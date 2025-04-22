/*
float X = 50.0f; 

sf::CircleShape topLeft(X), topRight(X), bottomLeft(X), bottomRight(X);
topLeft.setFillColor(sf::Color::Green);
topRight.setFillColor(sf::Color::Green);
bottomLeft.setFillColor(sf::Color::Green);
bottomRight.setFillColor(sf::Color::Green);

topLeft.setPosition(0, 0);
topRight.setPosition(1920 - 2 * X, 0);
bottomLeft.setPosition(0, 1080 - 2 * X);
bottomRight.setPosition(1920 - 2 * X, 1080 - 2 * X);

sf::CircleShape centerCircle(X);
centerCircle.setFillColor(sf::Color::Red);
centerCircle.setScale(2.0f, 1.0f);
centerCircle.setOrigin(X, X);
centerCircle.setPosition(1920 / 2, 1080 / 2);

inside window while loop -
    window.draw(topLeft);
    window.draw(topRight);
    window.draw(bottomLeft);
    window.draw(bottomRight);
    window.draw(centerCircle);
*/