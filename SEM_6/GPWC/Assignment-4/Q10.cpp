/*
void update(Time dt) {
    ball.move(ballVelocity * dt.asSeconds());
    Vector2f ballPos = ball.getPosition();
    if (ballPos.x <= 0 || ballPos.x + ball.getRadius() * 2 >= 1920) {
        ballVelocity.x = -ballVelocity.x;
    }
    if (ballPos.y <= 0) {
        ballVelocity.y = -ballVelocity.y;
    }
    if (ball.getGlobalBounds().intersects(playerBat.getGlobalBounds())) {
        ballVelocity.y = -ballVelocity.y;
    }
    if (ballPos.y > 1080) {
        // Reset position (example)
        ball.setPosition(960, 540);
    }
    if (Keyboard::isKeyPressed(Keyboard::Left) && playerBat.getPosition().x > 0) {
        playerBat.move(-batSpeed * dt.asSeconds(), 0);
    }
    if (Keyboard::isKeyPressed(Keyboard::Right) && playerBat.getPosition().x + playerBat.getSize().x < 1920) {
        playerBat.move(batSpeed * dt.asSeconds(), 0);
    }
}
*/