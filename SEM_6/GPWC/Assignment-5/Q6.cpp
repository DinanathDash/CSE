#include <SFML/Graphics.hpp>
using namespace std;
int main() {
    sf::RenderWindow window(sf::VideoMode(300, 100), "Tile Drawing");

    sf::Texture tileset;
    if (!tileset.loadFromFile("sheet.png"))
        return -1;

    sf::VertexArray tiles(sf::Quads, 3 * 4); // 3 quads = 12 vertices

    // Function to set a tile (quad) at a position with given tex-coords
    auto setTile = [](sf::Vertex* quad, sf::Vector2f pos, sf::IntRect texRect) {
        quad[0].position = pos;
        quad[1].position = pos + sf::Vector2f(texRect.width, 0);
        quad[2].position = pos + sf::Vector2f(texRect.width, texRect.height);
        quad[3].position = pos + sf::Vector2f(0, texRect.height);

        quad[0].texCoords = sf::Vector2f(texRect.left, texRect.top);
        quad[1].texCoords = sf::Vector2f(texRect.left + texRect.width, texRect.top);
        quad[2].texCoords = sf::Vector2f(texRect.left + texRect.width, texRect.top + texRect.height);
        quad[3].texCoords = sf::Vector2f(texRect.left, texRect.top + texRect.height);
    };

    // Set mud-1 at (0,0)
    setTile(&tiles[0], sf::Vector2f(0, 0), sf::IntRect(0, 0, 50, 50));
    // Set grass at (60,0)
    setTile(&tiles[4], sf::Vector2f(60, 0), sf::IntRect(0, 50, 50, 50));
    // Set mud-2 at (120,0)
    setTile(&tiles[8], sf::Vector2f(120, 0), sf::IntRect(0, 100, 50, 50));

    sf::RenderStates states;
    states.texture = &tileset;

    while (window.isOpen()) {
        sf::Event event;
        while (window.pollEvent(event))
            if (event.type == sf::Event::Closed)
                window.close();

        window.clear();
        window.draw(tiles, states);
        window.display();
    }

    return 0;
}
