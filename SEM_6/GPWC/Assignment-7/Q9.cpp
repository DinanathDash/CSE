for (int i = 0; i < bulletCount; ++i) {
    if (bullets[i].isInFlight()) {
        bullets[i].update();
        bullets[i].render(window);
    }
}