/*
sf::Font font;
font.loadFromFile("arial.ttf")
sf::Text gameOverText;
gameOverText.setFont(font);
gameOverText.setString("Player Expired - Game End");
gameOverText.setFillColor(sf::Color::Red);
sf::FloatRect textRect = gameOverText.getLocalBounds();
gameOverText.setOrigin(textRect.width / 2, textRect.height / 2);
gameOverText.setPosition(400, 300);
bool playerSquashed = true;

inside while loop:
if (playerSquashed) {
    window.draw(gameOverText);
}
*/