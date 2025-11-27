#define IR_SENSOR_RIGHT 8
#define IR_SENSOR_LEFT 9
#define MOTOR_SPEED 255

// Right motor
int enableRightMotor = 10;
int rightMotorPin2 = 4;
int rightMotorPin1 = 5;
float rightScale = 0.33; // adjust as needed

// Left motor
int enableLeftMotor = 11;
int leftMotorPin2 = 6;
int leftMotorPin1 = 7;

// WiFi control
bool robotEnabled = false;

void setup()
{
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

void loop()
{
  handleWiFi();

  if (!robotEnabled) {
    rotateMotor(0, 0);
    return;
  }

  int rightIRSensorValue = digitalRead(IR_SENSOR_RIGHT);
  int leftIRSensorValue = digitalRead(IR_SENSOR_LEFT);

  // LINE FOLLOWING LOGIC
  if (rightIRSensorValue == LOW && leftIRSensorValue == LOW)
  {
    rotateMotor(MOTOR_SPEED, MOTOR_SPEED);
  }
  else if (rightIRSensorValue == HIGH && leftIRSensorValue == LOW)
  {
    rotateMotor(-MOTOR_SPEED, MOTOR_SPEED);
  }
  else if (rightIRSensorValue == LOW && leftIRSensorValue == HIGH)
  {
    rotateMotor(MOTOR_SPEED, -MOTOR_SPEED);
  }
  else
  {
    rotateMotor(0, 0);
  }
}

void handleWiFi() {
  if (Serial.available()) {
    String cmd = Serial.readStringUntil('\n');
    cmd.trim();

    if (cmd == "START") {
      robotEnabled = true;
    }
    else if (cmd == "STOP") {
      robotEnabled = false;
    }
  }
}

void rotateMotor(int rightMotorSpeed, int leftMotorSpeed)
{
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

  // ----- APPLY RIGHT MOTOR (INVERTED POLARITY) -----
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
