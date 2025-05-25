for (Zombie& zombie : zombies) {
    if (zombie.isAlive() && zombie.getBounds().intersects(player.getBounds())) {
        player.decreaseHealth(zombie.getDamage());
        if (player.getHealth() <= 0) {
            gameState = GameState::GameOver;
        }
    }
}