// 1. Dynamically Allocate Zombie Objects
const int NUM_ZOMBIES = 3;
Zombie* zombies[NUM_ZOMBIES];

// 2. Dynamically Create and Spawn Each Zombie
float spawnX[NUM_ZOMBIES] = {300.f, 75.f, 525.f};
float spawnY[NUM_ZOMBIES] = {75.f, 300.f, 300.f};
int types[NUM_ZOMBIES]   = {0, 1, 2};
int seeds[NUM_ZOMBIES]   = {10, 20, 30};

for (int i = 0; i < NUM_ZOMBIES; ++i) {
    zombies[i] = new Zombie();
    zombies[i]->spawn(spawnX[i], spawnY[i], types[i], seeds[i]);
}

// 3. Drawing Each Zombie
for (int i = 0; i < NUM_ZOMBIES; ++i) {
    zombies[i]->draw(window);
}

// 4. Clean Up Memory When Done
for (int i = 0; i < NUM_ZOMBIES; ++i) {
    delete zombies[i];
}