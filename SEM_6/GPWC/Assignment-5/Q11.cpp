#include <SFML/Graphics.hpp>

enum GameState { ON, OFF };

int main() {
    sf::RenderWindow window(sf::VideoMode(800, 600), "Game State Toggle");
    window.setFramerateLimit(60);

    // Load textures
    sf::Texture playerTexture, bloaterTexture;
    if (!playerTexture.loadFromFile("player.png") || !bloaterTexture.loadFromFile("bloater.png")) {
        return -1;
    }

    // Create sprites
    sf::Sprite playerSprite(playerTexture);
    sf::Sprite bloaterSprite(bloaterTexture);

    // Center sprites on screen
    playerSprite.setPosition(375, 275);
    bloaterSprite.setPosition(375, 275);

    GameState state = ON;

    while (window.isOpen()) {
        sf::Event event;
        while (window.pollEvent(event)) {
            if (event.type == sf::Event::Closed)
                window.close();

            if (event.type == sf::Event::KeyPressed && event.key.code == sf::Keyboard::Return) {
                // Toggle state
                state = (state == ON) ? OFF : ON;
            }
        }

        window.clear(sf::Color::Red);

        if (state == ON)
            window.draw(playerSprite);
        else
            window.draw(bloaterSprite);

        window.display();
    }

    return 0;
}
