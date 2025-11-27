#include <ESP8266WiFi.h>
#include <ESP8266WebServer.h>

ESP8266WebServer server(80);

void handleRoot() {
  String page = 
    "<html><head><title>Robot Control</title>"
    "<style>body{font-family:Arial;text-align:center;padding-top:50px;} "
    "button{font-size:30px;padding:20px 40px;margin:20px;border:none;border-radius:10px;cursor:pointer;} "
    ".start{background:#4CAF50;color:white;} "
    ".stop{background:#f44336;color:white;} "
    "</style></head><body>"
    "<h1>Line Follower Control</h1>"
    "<button class='start' onclick=\"fetch('/start')\">START</button><br>"
    "<button class='stop' onclick=\"fetch('/stop')\">STOP</button>"
    "</body></html>";

  server.send(200, "text/html", page);
}

void handleStart() {
  Serial.println("START");
  server.send(200, "text/plain", "OK");
}

void handleStop() {
  Serial.println("STOP");
  server.send(200, "text/plain", "OK");
}

void setup() {
  Serial.begin(9600);

  WiFi.mode(WIFI_AP);
  WiFi.softAP("Robot-Control", "12345678");

  server.on("/", handleRoot);
  server.on("/start", handleStart);
  server.on("/stop", handleStop);

  server.begin();
}

void loop() {
  server.handleClient();
}
