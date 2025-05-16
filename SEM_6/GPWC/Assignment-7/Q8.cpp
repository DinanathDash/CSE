if (sf::Mouse::isButtonPressed(sf::Mouse::Left)) {
    if (!bullet.isInFlight()) {
        sf::Vector2i mousePos = sf::Mouse::getPosition(window);
        sf::Vector2f worldPos = window.mapPixelToCoords(mousePos);

        bullet.shoot(playerX, playerY, worldPos.x, worldPos.y);
    }
}


//Inside main
if (sf::Mouse::isButtonPressed(sf::Mouse::Left)) {
}
bullet.update();