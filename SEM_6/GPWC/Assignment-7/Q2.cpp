class Bullet {
public:
    Bullet();
    void update();
    void render(sf::RenderWindow& window);
    sf::FloatRect getBounds();
    bool isInFlight();
};