void displayBackground(sf::VertexArray& rVA, sf::IntRect arena) {
    const int TILE_SIZE = 50;
    rVA.setPrimitiveType(sf::Quads);
    rVA.resize(arena.width * arena.height * 4);

    // Loop through each tile in the arena grid
    for (int i = 0; i < arena.width; ++i) {
        for (int j = 0; j < arena.height; ++j) {
            int index = (i + j * arena.width) * 4;
            sf::Vertex* quad = &rVA[index];

            // Position of quad in the window
            quad[0].position = sf::Vector2f(i * TILE_SIZE, j * TILE_SIZE);
            quad[1].position = sf::Vector2f((i + 1) * TILE_SIZE, j * TILE_SIZE);
            quad[2].position = sf::Vector2f((i + 1) * TILE_SIZE, (j + 1) * TILE_SIZE);
            quad[3].position = sf::Vector2f(i * TILE_SIZE, (j + 1) * TILE_SIZE);

            // Texture coordinate logic (choose tile type)
            sf::IntRect texRect;
            if (j == arena.height - 1) {
                // Bottom row → wall
                texRect = sf::IntRect(0, 150, TILE_SIZE, TILE_SIZE);
            } else if (j == arena.height - 2) {
                // One row above bottom → mud-2
                texRect = sf::IntRect(0, 100, TILE_SIZE, TILE_SIZE);
            } else if (j == arena.height - 3) {
                // Two rows above bottom → grass
                texRect = sf::IntRect(0, 50, TILE_SIZE, TILE_SIZE);
            } else {
                // The rest → mud-1
                texRect = sf::IntRect(0, 0, TILE_SIZE, TILE_SIZE);
            }

            // Assign texture coordinates
            quad[0].texCoords = sf::Vector2f(texRect.left, texRect.top);
            quad[1].texCoords = sf::Vector2f(texRect.left + TILE_SIZE, texRect.top);
            quad[2].texCoords = sf::Vector2f(texRect.left + TILE_SIZE, texRect.top + TILE_SIZE);
            quad[3].texCoords = sf::Vector2f(texRect.left, texRect.top + TILE_SIZE);
        }
    }
}
