float currentX = shape.getPosition().x;
float currentY = shape.getPosition().y;
float dx = currentX - startX;
float dy = currentY - startY;
float distanceTraveled = std::sqrt(dx * dx + dy * dy);
if (distanceTraveled > 1200.f) {
    m_InFlight = false;
}