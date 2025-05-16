float angle = std::atan(gradient);
m_BulletSpeedX = m_BulletSpeed * std::cos(angle);
m_BulletSpeedY = m_BulletSpeed * std::sin(angle);