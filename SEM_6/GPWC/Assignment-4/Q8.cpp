/*
#include <SFML/Graphics.hpp>
using namespace sf;
class SelfBat {
private:
    RectangleShape bat;
public:
    SelfBat(float posX, float posY) {
        bat.setSize(Vector2f(100, 5));
        bat.setFillColor(Color::Red);
        bat.setPosition(posX, posY);
    }
    void draw(RenderWindow& window) {
        window.draw(bat);
    }
};
int main() {
    RenderWindow window(VideoMode(800, 600), "SelfBat Example");
    SelfBat playerBat(300.f, 500.f);
    while (window.isOpen()) {
        Event event;
        while (window.pollEvent(event)) {
            if (event.type == Event::Closed)
                window.close();
        }
        window.clear(Color::Black);
        playerBat.draw(window);
        window.display();
    }

    return 0;
}
*/