#include <SFML/Graphics.hpp>

void displayBackground(sf::VertexArray& rVA, sf::IntRect arena) {
    const int TILE_SIZE = 50;

    rVA.setPrimitiveType(sf::Quads);
    rVA.resize(arena.width * arena.height * 4);

    int centerRow = arena.top + arena.height / 2;
    int centerCol = arena.left + arena.width / 2;

    for (int x = 0; x < arena.width; ++x) {
        for (int y = 0; y < arena.height; ++y) {
            int index = (x + y * arena.width) * 4;
            sf::Vertex* quad = &rVA[index];

            // Quad position on screen
            quad[0].position = sf::Vector2f(x * TILE_SIZE, y * TILE_SIZE);
            quad[1].position = sf::Vector2f((x + 1) * TILE_SIZE, y * TILE_SIZE);
            quad[2].position = sf::Vector2f((x + 1) * TILE_SIZE, (y + 1) * TILE_SIZE);
            quad[3].position = sf::Vector2f(x * TILE_SIZE, (y + 1) * TILE_SIZE);

            sf::IntRect texRect;

            // Edge wall tiles
            if (x == 0 || y == 0 || x == arena.width - 1 || y == arena.height - 1) {
                texRect = sf::IntRect(0, 150, TILE_SIZE, TILE_SIZE); // wall
            }
            // Grass strip (cross in center)
            else if (y == centerRow || x == centerCol) {
                texRect = sf::IntRect(0, 50, TILE_SIZE, TILE_SIZE); // grass
            }
            // Everything else is mud-1
            else {
                texRect = sf::IntRect(0, 0, TILE_SIZE, TILE_SIZE); // mud-1
            }

            // Set texture coordinates
            quad[0].texCoords = sf::Vector2f(texRect.left, texRect.top);
            quad[1].texCoords = sf::Vector2f(texRect.left + TILE_SIZE, texRect.top);
            quad[2].texCoords = sf::Vector2f(texRect.left + TILE_SIZE, texRect.top + TILE_SIZE);
            quad[3].texCoords = sf::Vector2f(texRect.left, texRect.top + TILE_SIZE);
        }
    }
}
