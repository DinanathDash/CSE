if (m_Position.x < m_Arena.left + m_TileSize)
    m_Position.x = m_Arena.left + m_TileSize;

if (m_Position.x > m_Arena.left + m_Arena.width - m_TileSize)
    m_Position.x = m_Arena.left + m_Arena.width - m_TileSize;

if (m_Position.y < m_Arena.top + m_TileSize)
    m_Position.y = m_Arena.top + m_TileSize;

if (m_Position.y > m_Arena.top + m_Arena.height - m_TileSize)
    m_Position.y = m_Arena.top + m_Arena.height - m_TileSize;
