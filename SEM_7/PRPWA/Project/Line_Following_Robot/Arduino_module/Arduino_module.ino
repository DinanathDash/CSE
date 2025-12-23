#define IR_SENSOR_RIGHT 8
#define IR_SENSOR_LEFT 9
#define MOTOR_SPEED 255

// Right motor
int enableRightMotor = 10;
int rightMotorPin2 = 4;
int rightMotorPin1 = 5;
float rightScale = 0.33;

// Left motor
int enableLeftMotor = 11;
int leftMotorPin2 = 6;
int leftMotorPin1 = 7;

// Robot Modes
enum Mode { STOPPED, AUTO, MANUAL };
Mode currentMode = STOPPED;

// Manual Direction State
char manualDirection = 'S';

void setup() {
  Serial.begin(9600);

  // PWM frequency config
  TCCR0B = TCCR0B & B11111000 | B00000010;

  pinMode(enableRightMotor, OUTPUT);
  pinMode(rightMotorPin1, OUTPUT);
  pinMode(rightMotorPin2, OUTPUT);

  pinMode(enableLeftMotor, OUTPUT);
  pinMode(leftMotorPin1, OUTPUT);
  pinMode(leftMotorPin2, OUTPUT);

  pinMode(IR_SENSOR_RIGHT, INPUT);
  pinMode(IR_SENSOR_LEFT, INPUT);

  rotateMotor(0, 0);
}

void loop() {
  handleWiFi();

  switch (currentMode) {
    case STOPPED:
      rotateMotor(0, 0);
      break;

    case AUTO:
      runLineFollower();
      break;

    case MANUAL:
      runManualControl();
      break;
  }
}

void handleWiFi() {
  if (Serial.available()) {
    String cmd = Serial.readStringUntil('\n');
    cmd.trim();

    if (cmd == "AUTO") {
      currentMode = AUTO;
    } else if (cmd == "MANUAL") {
      currentMode = MANUAL;
      manualDirection = 'S';
    } else if (cmd == "STOP") {
      currentMode = STOPPED;
    } else if (currentMode == MANUAL) {
      if (cmd == "F") manualDirection = 'F';
      else if (cmd == "B") manualDirection = 'B';
      else if (cmd == "L") manualDirection = 'L';
      else if (cmd == "R") manualDirection = 'R';
      else if (cmd == "S") manualDirection = 'S';
    }
  }
}

void runLineFollower() {
  int rightIRSensorValue = digitalRead(IR_SENSOR_RIGHT);
  int leftIRSensorValue = digitalRead(IR_SENSOR_LEFT);

  if (rightIRSensorValue == LOW && leftIRSensorValue == LOW) {
    rotateMotor(MOTOR_SPEED, MOTOR_SPEED);
  } else if (rightIRSensorValue == HIGH && leftIRSensorValue == LOW) {
    rotateMotor(-MOTOR_SPEED, MOTOR_SPEED);
  } else if (rightIRSensorValue == LOW && leftIRSensorValue == HIGH) {
    rotateMotor(MOTOR_SPEED, -MOTOR_SPEED);
  } else {
    rotateMotor(0, 0);
  }
}

void runManualControl() {
  // FIXED: Logic for L and R swapped to match your wiring
  if (manualDirection == 'F') rotateMotor(MOTOR_SPEED, MOTOR_SPEED);
  else if (manualDirection == 'B') rotateMotor(-MOTOR_SPEED, -MOTOR_SPEED);
  else if (manualDirection == 'L') rotateMotor(MOTOR_SPEED, -MOTOR_SPEED);
  else if (manualDirection == 'R') rotateMotor(-MOTOR_SPEED, MOTOR_SPEED);
  else rotateMotor(0, 0);
}

void rotateMotor(int rightMotorSpeed, int leftMotorSpeed) {
  // ----- RIGHT MOTOR -----
  int rightDirection = 0;
  if (rightMotorSpeed < 0) rightDirection = -1;
  else if (rightMotorSpeed > 0) rightDirection = 1;

  int rightPWM = abs(rightMotorSpeed) * rightScale;

  // ----- LEFT MOTOR -----
  int leftDirection = 0;
  if (leftMotorSpeed < 0) leftDirection = -1;
  else if (leftMotorSpeed > 0) leftDirection = 1;

  int leftPWM = abs(leftMotorSpeed);

  // ----- APPLY RIGHT MOTOR -----
  if (rightDirection == -1) {
    digitalWrite(rightMotorPin1, HIGH);
    digitalWrite(rightMotorPin2, LOW);
  } else if (rightDirection == 1) {
    digitalWrite(rightMotorPin1, LOW);
    digitalWrite(rightMotorPin2, HIGH);
  } else {
    digitalWrite(rightMotorPin1, LOW);
    digitalWrite(rightMotorPin2, LOW);
  }

  // ----- APPLY LEFT MOTOR -----
  if (leftDirection == -1) {
    digitalWrite(leftMotorPin1, LOW);
    digitalWrite(leftMotorPin2, HIGH);
  } else if (leftDirection == 1) {
    digitalWrite(leftMotorPin1, HIGH);
    digitalWrite(leftMotorPin2, LOW);
  } else {
    digitalWrite(leftMotorPin1, LOW);
    digitalWrite(leftMotorPin2, LOW);
  }

  analogWrite(enableRightMotor, rightPWM);
  analogWrite(enableLeftMotor, leftPWM);
}