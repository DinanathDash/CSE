class Player {
private:
    sf::Texture texture;
    sf::Sprite sprite;
public:
    Player();
};

Player::Player() {
    texture.loadFromFile("player.png");
    sprite.setTexture(texture);
    sprite.setOrigin(25.f, 25.f);
    sprite.setPosition(120.f, 234.f);
}
