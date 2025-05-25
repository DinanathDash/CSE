sf::View cameraView(sf::FloatRect(0.f, 0.f, 800.f, 600.f));

window.setView(cameraView);
window.draw(sprite);
window.draw(player);
window.draw(background);
