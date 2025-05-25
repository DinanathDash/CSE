#include <SFML/Graphics.hpp>
#include <iostream>

enum GameState { PLAYING, PAUSED, LEVELING_UP, GAME_OVER };

int main() {
    sf::RenderWindow window(sf::VideoMode(800, 600), "Zombie Arena - State Handling");
    sf::Event event;
    GameState currentState = GAME_OVER;

    while (window.isOpen()) {
        while (window.pollEvent(event)) {
            if (event.type == sf::Event::Closed)
                window.close();

            if (event.type == sf::Event::KeyPressed) {
                switch (currentState) {
                    case GAME_OVER:
                        if (event.key.code == sf::Keyboard::Enter) {
                            currentState = LEVELING_UP;
                            std::cout << "State changed to LEVELING_UP\n";
                        }
                        break;

                    case LEVELING_UP:
                        if (event.key.code == sf::Keyboard::Num1) {
                            currentState = PLAYING;
                            std::cout << "State changed to PLAYING\n";
                        }
                        break;

                    case PLAYING:
                        if (event.key.code == sf::Keyboard::Return) {
                            currentState = PAUSED;
                            std::cout << "State changed to PAUSED\n";
                        }
                        break;

                    case PAUSED:
                        if (event.key.code == sf::Keyboard::Return) {
                            currentState = PLAYING;
                            std::cout << "State changed to PLAYING\n";
                        }
                        break;
                }
            }
        }

        window.clear();
        window.display();
    }

    return 0;
}
