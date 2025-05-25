#pragma once
#include <SFML/Graphics.hpp>

class Player {
private:
    sf::Texture texture;
    sf::Sprite sprite;

public:
    Player(const std::string& texturePath);
    void spawn(float x, float y);
    void draw(sf::RenderWindow& window);
};





#include "Player.hpp"

Player::Player(const std::string& texturePath) {
    texture.loadFromFile(texturePath);
    sprite.setTexture(texture);
    
    sf::Vector2u size = texture.getSize();
    sprite.setOrigin(size.x / 2.f, size.y / 2.f);
}

void Player::spawn(float x, float y) {
    sprite.setPosition(x, y);
}

void Player::draw(sf::RenderWindow& window) {
    window.draw(sprite);
}







#include "Player.hpp"
#include <vector>

int main() {
    sf::RenderWindow window(sf::VideoMode(600, 600), "Player Spawning");

    std::vector<sf::Vector2f> positions = {
        {75.f, 75.f},
        {525.f, 75.f},
        {300.f, 300.f},
        {75.f, 525.f},
        {525.f, 525.f}
    };

    std::vector<Player> players;
    for (int i = 0; i < 5; ++i) {
        Player p("player.png");
        p.spawn(positions[i].x, positions[i].y);
        players.push_back(p);
    }

    while (window.isOpen()) {
        sf::Event event;
        while (window.pollEvent(event)) {
            if (event.type == sf::Event::Closed)
                window.close();
        }

        window.clear();
        for (auto& p : players)
            p.draw(window);
        window.display();
    }

    return 0;
}