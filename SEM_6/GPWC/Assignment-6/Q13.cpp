sf::Vector2f direction = playerLocation - m_Position;

float length = std::sqrt(direction.x * direction.x + direction.y * direction.y);
sf::Vector2f unitDirection = direction / length;

float speed = 1.0f;
m_Position += unitDirection * speed;

m_Sprite.setPosition(m_Position);
