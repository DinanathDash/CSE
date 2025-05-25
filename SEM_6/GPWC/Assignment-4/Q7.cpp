/*
#include <SFML/Graphics.hpp>
using namespace sf;
class MyRectangle {
private:
    RectangleShape rect;
public:
    void initialize() {
        rect.setSize(Vector2f(10, 10));
        rect.setFillColor(Color::Green);
        rect.setPosition(100, 100); // optional: position it somewhere visible
    }
    void draw(RenderWindow& window) {
        window.draw(rect);
    }
};
int main() {
    RenderWindow window(VideoMode(1920, 1080), "Rectangle Display");
    MyRectangle myRect;
    myRect.initialize();
    while (window.isOpen()) {
        Event event;
        while (window.pollEvent(event)) {
            if (event.type == Event::Closed)
                window.close();
        }
        window.clear();
        myRect.draw(window);
        window.display();
    }
    return 0;
}
*/
