#include <SFML/Graphics.hpp>
#include <cmath>

float dx = x2 - x1;
float dy = y2 - y1;
float angle = std::atan2(dy, dx) * 180 / 3.14159265f;

m_Sprite.setRotation(angle);
