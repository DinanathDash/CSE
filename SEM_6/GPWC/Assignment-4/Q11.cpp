/*
void moveLeft() {
    if (bat.getPosition().x > 0)
        velocity.x = -speed;
    else
        velocity.x = 0;
}
void moveRight() {
    if (bat.getPosition().x + bat.getSize().x < 1920)
        velocity.x = speed;
    else
        velocity.x = 0;
}
void stopLeft() {
    if (velocity.x < 0)
        velocity.x = 0;
}
void stopRight() {
    if (velocity.x > 0)
        velocity.x = 0;
}
void update(Time dt) {
    bat.move(velocity * dt.asSeconds());
    if (bat.getPosition().x < 0)
        bat.setPosition(0, bat.getPosition().y);
    if (bat.getPosition().x + bat.getSize().x > 1920)
        bat.setPosition(1920 - bat.getSize().x, bat.getPosition().y);
}
*/