#pragma once
#include <SFML/Graphics.hpp>

class Player {
private:
    sf::Texture texture;
    sf::Sprite sprite;

public:
    Player(const std::string& texturePath);
    void centerInView(const sf::View& view);
    void draw(sf::RenderWindow& window);
};



#include "Player.hpp"

Player::Player(const std::string& texturePath) {
    texture.loadFromFile(texturePath);
    sprite.setTexture(texture);

    sf::Vector2u size = texture.getSize();
    sprite.setOrigin(size.x / 2.f, size.y / 2.f);
}

void Player::centerInView(const sf::View& view) {
    sprite.setPosition(view.getCenter());
}

void Player::draw(sf::RenderWindow& window) {
    window.draw(sprite);
}
