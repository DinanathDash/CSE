#include <SFML/Graphics.hpp>
#include <iostream>

int main() {
    sf::RenderWindow window(sf::VideoMode(800, 600), "Key Press Handler");

    while (window.isOpen()) {
        sf::Event event;
        while (window.pollEvent(event)) {
            if (event.type == sf::Event::Closed)
                window.close();

            if (event.type == sf::Event::KeyPressed) {
                switch (event.key.code) {
                    case sf::Keyboard::W:
                        std::cout << "W key pressed\n";
                        break;
                    case sf::Keyboard::Return:
                        std::cout << "Return (Enter) key pressed\n";
                        break;
                    case sf::Keyboard::Num0:
                        std::cout << "Num0 key pressed\n";
                        break;
                    case sf::Keyboard::Num1:
                        std::cout << "Num1 key pressed\n";
                        break;
                    default:
                        break;
                }
            }
        }

        window.clear();
        window.display();
    }

    return 0;
}
