/*
#include <SFML/Graphics.hpp>
#include <iostream>
using namespace sf;
using namespace std;
int main() {
    RenderWindow window(VideoMode(800, 600), "Key Press Detection");
    while (window.isOpen()) {
        Event event;
        while (window.pollEvent(event)) {
            if (event.type == Event::Closed)
                window.close();
            if (event.type == Event::KeyPressed) {
                cout << "A Key Pressed" << endl;
                if (event.key.code == Keyboard::W) {
                    cout << "W key was pressed" << endl;
                } else {
                    cout << "Another key was pressed" << endl;
                }
            }
        }
        window.clear();
        window.display();
    }
    return 0;
}
*/