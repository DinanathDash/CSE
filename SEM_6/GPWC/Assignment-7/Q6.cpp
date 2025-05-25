float dx = targetX - startX;
float dy = targetY - startY;
float length = std::sqrt(dx * dx + dy * dy);
float dirX = dx / length;
float dirY = dy / length;
float maxX = startX + dirX * 1200.f;
float maxY = startY + dirY * 1200.f;