#include <ESP8266WiFi.h>
#include <ESP8266WebServer.h>

ESP8266WebServer server(80);

void handleRoot() {
  String page = R"rawliteral(
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Robot Control</title>
  <style>
    body { font-family: Arial; text-align: center; background-color: #f2f2f2; margin: 0; padding: 20px; }
    h1 { color: #333; margin-bottom: 20px; }
    
    /* --- NEW: Flex Container for Perfect Symmetry --- */
    .mode-container {
      display: flex;
      justify-content: center;
      gap: 15px; /* Space between buttons */
      margin-bottom: 30px;
    }

    .mode-btn {
      flex: 1; /* Makes both buttons take equal width */
      padding: 15px 0; /* Vertical padding */
      font-size: 18px;
      border: none;
      border-radius: 8px;
      cursor: pointer;
      color: white;
      max-width: 200px; /* Prevents them from getting too huge on tablets */
    }

    .btn-auto { background-color: #2196F3; }
    .btn-manual { background-color: #FF9800; }
    
    .btn-stop { 
      background-color: #f44336; 
      width: 100%; 
      padding: 20px;
      font-size: 20px;
      font-weight: bold;
      max-width: 400px;
      margin-top: 30px;
    }

    /* Manual Control Pad */
    .control-grid { display: grid; grid-template-columns: 80px 80px 80px; gap: 10px; justify-content: center; }
    .pad-btn { padding: 20px; font-size: 24px; border: none; border-radius: 10px; cursor: pointer; background-color: #555; color: white; }
    .pad-btn:active { background-color: #333; }
    .hidden { visibility: hidden; }
  </style>
</head>
<body>

  <h1>Robot Controller</h1>

  <div class="mode-container">
    <button class="mode-btn btn-auto" onclick="sendCommand('AUTO')">Auto Mode</button>
    <button class="mode-btn btn-manual" onclick="sendCommand('MANUAL')">Manual Mode</button>
  </div>

  <div class="control-grid">
    <div class="pad-btn hidden"></div>
    <button class="pad-btn" onmousedown="sendCommand('F')" onmouseup="sendCommand('S')" ontouchstart="sendCommand('F')" ontouchend="sendCommand('S')">&#9650;</button>
    <div class="pad-btn hidden"></div>

    <button class="pad-btn" onmousedown="sendCommand('L')" onmouseup="sendCommand('S')" ontouchstart="sendCommand('L')" ontouchend="sendCommand('S')">&#9664;</button>
    <button class="pad-btn" onclick="sendCommand('S')">&#9632;</button>
    <button class="pad-btn" onmousedown="sendCommand('R')" onmouseup="sendCommand('S')" ontouchstart="sendCommand('R')" ontouchend="sendCommand('S')">&#9654;</button>

    <div class="pad-btn hidden"></div>
    <button class="pad-btn" onmousedown="sendCommand('B')" onmouseup="sendCommand('S')" ontouchstart="sendCommand('B')" ontouchend="sendCommand('S')">&#9660;</button>
    <div class="pad-btn hidden"></div>
  </div>

  <button class="mode-btn btn-stop" onclick="sendCommand('STOP')">EMERGENCY STOP</button>

  <script>
    function sendCommand(cmd) {
      fetch('/cmd?val=' + cmd);
    }
  </script>

</body>
</html>
)rawliteral";

  server.send(200, "text/html; charset=utf-8", page);
}

void handleCommand() {
  if (server.hasArg("val")) {
    String val = server.arg("val");
    Serial.println(val); // Send command to Arduino
    server.send(200, "text/plain", "OK");
  } else {
    server.send(400, "text/plain", "Bad Request");
  }
}

void setup() {
  Serial.begin(9600);
  
  // Create Access Point
  WiFi.mode(WIFI_AP);
  WiFi.softAP("Robot-Control", "12345678");

  server.on("/", handleRoot);
  server.on("/cmd", handleCommand);

  server.begin();
}

void loop() {
  server.handleClient();
}