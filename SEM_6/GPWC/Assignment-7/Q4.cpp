shape.setPosition(startX, startY);
float dx = targetX - startX;
float dy = targetY - startY;
float length = std::sqrt(dx * dx + dy * dy);
direction.x = dx / length;
direction.y = dy / length;