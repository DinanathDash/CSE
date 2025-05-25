//In Zombie.h
void spawn(float startX, float startY, int type, int seed);


//In Zombie.cpp
void Zombie::spawn(float startX, float startY, int type, int seed) {
    srand(seed);

    std::string texturePath;
    switch (type) {
        case 0: texturePath = "bloater.png"; break;
        case 1: texturePath = "crawler.png"; break;
        case 2: texturePath = "chaser.png"; break;
        default: texturePath = "bloater.png"; break;
    }

    texture.loadFromFile(texturePath);
    sprite.setTexture(texture);
    
    sf::Vector2u size = texture.getSize();
    sprite.setOrigin(size.x / 2.f, size.y / 2.f);

    sprite.setPosition(startX, startY);
}


//In main.cpp
Zombie zombie1, zombie2, zombie3;

zombie1.spawn(300.f, 75.f, 0, 10);
zombie2.spawn(75.f, 300.f, 1, 20);
zombie3.spawn(525.f, 300.f, 2, 30);
