for (Bullet& bullet : bullets) {
    if (bullet.isInFlight()) {
        for (Zombie& zombie : zombies) {
            if (zombie.isAlive() && bullet.getBounds().intersects(zombie.getBounds())) {
                bullet.stop();
                zombie.kill();
            }
        }
    }
}
bool allZombiesDead = true;
for (const Zombie& zombie : zombies) {
    if (zombie.isAlive()) {
        allZombiesDead = false;
        break;
    }
}
if (allZombiesDead) {
    gameState = GameState::LevelComplete;
}