#include <SFML/Graphics.hpp>
#include <SFML/Audio.hpp>
#include <sstream>
#include <iostream>
using namespace sf;

void updateBranches(int seed);
const int NUM_BRANCHES = 6;
Sprite branches[NUM_BRANCHES];
enum class side {
    LEFT, RIGHT, NONE
};
side branchPosition[NUM_BRANCHES];

int main() {
    VideoMode vm(1920, 1080);
    RenderWindow window(vm, "Timber", Style::Fullscreen);
    View view(FloatRect(0, 0, 1920, 1080));
    window.setView(view);

    // BACKGROUND IMAGE SETUP
    Texture textureBackground;
    textureBackground.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/background.png");
    Sprite spriteBackground;
    spriteBackground.setTexture(textureBackground);
    spriteBackground.setPosition(0, 0);

    // TREE IMAGE SETUP
    Texture textureTree;
    textureTree.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/tree.png");
    Sprite spriteTree;
    spriteTree.setTexture(textureTree);
    spriteTree.setPosition(810, 0);

    // BEE IMAGE SETUP
    Texture textureBee;
    textureBee.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/bee.png");
    Sprite spriteBee;
    spriteBee.setTexture(textureBee);
    spriteBee.setPosition(0, 500); // 800
    bool beeActive = false;
    float beeSpeed = 0.0f;

    // CLOUD IMAGE SETUP
    Texture textureCloud;
    textureCloud.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/cloud.png");
    Sprite spriteCloud1;
    Sprite spriteCloud2;
    Sprite spriteCloud3;
    Sprite spriteCloud4;

    spriteCloud1.setTexture(textureCloud);
    spriteCloud2.setTexture(textureCloud);
    spriteCloud3.setTexture(textureCloud);
    spriteCloud4.setTexture(textureCloud);

    // spriteCloud1.setPosition(0,0);
    // spriteCloud2.setPosition(400,100);
    // spriteCloud3.setPosition(800,0);
    // spriteCloud4.setPosition(1200,100);

    bool cloud1Active = false;
    bool cloud2Active = false;
    bool cloud3Active = false;
    bool cloud4Active = false;

    float cloud1Speed = 0.0f;
    float cloud2Speed = 0.0f;
    float cloud3Speed = 0.0f;
    float cloud4Speed = 0.0f;

    // PLAYER IMAGE SETUP
    Texture texturePlayer;
    texturePlayer.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/player.png");
    Sprite spritePlayer;
    spritePlayer.setTexture(texturePlayer);
    spritePlayer.setPosition(580, 720);
    side playerSide = side::LEFT;

    // RIP IMAGE SETUP
    Texture textureRIP;
    textureRIP.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/rip.png");
    Sprite spriteRIP;
    spriteRIP.setTexture(textureRIP);
    spriteRIP.setPosition(600, 860);

    // AXE IMAGE SETUP
    Texture textureAxe;
    textureAxe.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/axe.png");
    Sprite spriteAxe;
    spriteAxe.setTexture(textureAxe);
    spriteAxe.setPosition(700, 830);

    const float AXE_POSITION_LEFT = 700;
    const float AXE_POSITION_RIGHT = 1075;

    // LOG IMAGE SETUP
    Texture textureLog;
    textureLog.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/log.png");
    Sprite spriteLog;
    spriteLog.setTexture(textureLog);
    spriteLog.setPosition(810, 720);
    bool logActive = false;
    float logSpeedX = 1000;
    float logSpeedY = -1500;

    bool acceptInput = false;

    SoundBuffer chopBuffer;
    chopBuffer.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/sound/chop.wav");
    Sound chop;
    chop.setBuffer(chopBuffer);

    SoundBuffer deathBuffer;
    deathBuffer.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/sound/death.wav");
    Sound death;
    death.setBuffer(deathBuffer);

    SoundBuffer ootBuffer;
    ootBuffer.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/sound/out_of_time.wav");
    Sound outOfTime;
    outOfTime.setBuffer(ootBuffer);

    Clock clock;
    //-------------- Timer code --------------

    //Time bar
    RectangleShape timeBar;
    float timeBarStartWidth = 400;
    float timeBarheight = 50;
    timeBar.setSize(Vector2f(timeBarStartWidth, timeBarheight));
    timeBar.setFillColor(Color::Red);
    timeBar.setPosition((1920 / 2) - timeBarStartWidth / 2, 980);

    Time gameTimeTotal;
    float timeRemaining = 6.0f;
    float timeBarWidthPerSecond = timeBarStartWidth / timeRemaining;

    //-------------- Score and Pause Text --------------
    bool paused = true;
    int score = 0;
    Text messageText;
    Text scoreText;
    Font font;
    font.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/fonts/KOMIKAP_.ttf");
    messageText.setFont(font);
    scoreText.setFont(font);
    messageText.setString("Press Enter to start!");
    scoreText.setString("Score = 0");
    messageText.setCharacterSize(75);
    scoreText.setCharacterSize(50);
    messageText.setFillColor(Color::White);
    scoreText.setFillColor(Color::White);
    FloatRect textRect = messageText.getLocalBounds();
    messageText.setOrigin(textRect.left + textRect.width / 2.0f, textRect.top + textRect.height / 2.0f);
    messageText.setPosition(1920 / 2.0f, 1080 / 2.0f);
    scoreText.setPosition(20, 20);

    // Branches
    Texture textureBranch;
    textureBranch.loadFromFile("/Users/dinanathdash/Documents/CSE/SEM_6/GPWC/SFML/Timberman/graphics/branch.png");
    for (int i = 0; i < NUM_BRANCHES; i++) {
        branches[i].setTexture(textureBranch);
        branches[i].setPosition(-2000, -2000);
        branches[i].setOrigin(220, 20);
    }
    for (int i = 0; i < NUM_BRANCHES; i++) {
        updateBranches(i);
    }

    // GAME START HERE
    while (window.isOpen()) {
        Event event;
        while (window.pollEvent(event)) {
            if (event.type == Event::KeyReleased && !paused) {
                acceptInput = true;
                spriteAxe.setPosition(2000, spriteAxe.getPosition().y);
            }
        }
        if (Keyboard::isKeyPressed(Keyboard::Escape)) {
            window.close();
        }
        if (Keyboard::isKeyPressed(Keyboard::Return)) {
            paused = false;
            // time setup
            score = 0;
            timeRemaining = 6;
            for (int i = 1; i < NUM_BRANCHES; i++) {
                branchPosition[i] = side ::NONE;
            }
            spriteRIP.setPosition(675, 2000);
            spritePlayer.setPosition(580, 720);
            acceptInput = true;
        }
        if (acceptInput) {
            if (Keyboard::isKeyPressed(Keyboard::Right)) {
                playerSide = side::RIGHT;
                score++;
                timeRemaining += (2 / score) + .15;
                spriteAxe.setPosition(AXE_POSITION_RIGHT, spriteAxe.getPosition().y);
                spritePlayer.setPosition(1200, 720);
                updateBranches(score);
                spriteLog.setPosition(810, 720);
                logSpeedX = -5000;
                logActive = true;
                acceptInput = false;
                chop.play();
            }
            if (Keyboard::isKeyPressed(Keyboard::Left)) {
                playerSide = side::LEFT;
                score++;
                timeRemaining += (2 / score) + .15;
                spriteAxe.setPosition(AXE_POSITION_LEFT, spriteAxe.getPosition().y);
                spritePlayer.setPosition(580, 720);
                updateBranches(score);
                spriteLog.setPosition(810, 720);
                logSpeedX = 5000;
                logActive = true;
                acceptInput = false;
                chop.play();
            }
        }

        if (!paused) {
            // ------ Animation of all objects -----------
            Time dt = clock.restart();

            // set up the timer
            timeRemaining -= dt.asSeconds();
            timeBar.setSize(Vector2f(timeBarWidthPerSecond * timeRemaining, timeBarheight));
            if (timeRemaining <= 0.0f) {
                paused = true;
                messageText.setString("Out of Time!");
                FloatRect textRect = messageText.getLocalBounds();
                messageText.setOrigin(textRect.left + textRect.width / 2.0f, textRect.top + textRect.height / 2.0f);
                messageText.setPosition(1920 / 2.0f, 1080 / 2.0f);
                outOfTime.play();
            }

            // set up the bee
            if (!beeActive) {
                srand((int)time(0));
                beeSpeed = (rand() % 200) + 200;

                srand((int)time(0) * 10);
                float height = (rand() % 200) + 300;
                spriteBee.setPosition(2000, height);

                beeActive = true;
            }
            // move the bee
            else {
                spriteBee.setPosition(spriteBee.getPosition().x - (beeSpeed * dt.asSeconds()), spriteBee.getPosition().y);
                if (spriteBee.getPosition().x < -100){
                    beeActive = false;
                }
            }

            // Set up the cloud movement
            if (!cloud1Active) {
                // Randomize speed and position
                cloud1Speed = 50;                              //(rand() % 50) + 50;  random speed between 50 and 100
                spriteCloud1.setPosition(-1200, rand() % 100); // Randomize vertical position
                cloud1Active = true;
            }
            else {
                spriteCloud1.move(cloud1Speed * dt.asSeconds(), 0); // Move cloud to the right
                if (spriteCloud1.getPosition().x > 1920){ // Reset cloud when it goes off-screen
                    cloud1Active = false;
                }
            }

            if (!cloud2Active) {
                cloud2Speed = 50; //(rand() % 50) + 50;
                spriteCloud2.setPosition(-800, rand() % 150);
                cloud2Active = true;
            }
            else {
                spriteCloud2.move(cloud2Speed * dt.asSeconds(), 0);
                if (spriteCloud2.getPosition().x > 1920){
                    cloud2Active = false;
                }
            }

            if (!cloud3Active) {
                cloud3Speed = 50; //(rand() % 50) + 50;
                spriteCloud3.setPosition(-400, rand() % 100);
                cloud3Active = true;
            }
            else {
                spriteCloud3.move(cloud3Speed * dt.asSeconds(), 0);
                if (spriteCloud3.getPosition().x > 1920){
                    cloud3Active = false;
                }
            }

            if (!cloud4Active) {
                cloud4Speed = 50; //(rand() % 50) + 50;
                spriteCloud4.setPosition(-100, rand() % 150);
                cloud4Active = true;
            }
            else {
                spriteCloud4.move(cloud4Speed * dt.asSeconds(), 0);
                if (spriteCloud4.getPosition().x > 1920){
                    cloud4Active = false;
                }
            }
            std::stringstream ss;
            ss << "Score = " << score;
            scoreText.setString(ss.str());

            // Setting position of branches left and right
            for (int i = 0; i < NUM_BRANCHES; i++) {
                float height = i * 150;
                if (branchPosition[i] == side::LEFT) {
                    branches[i].setPosition(610, height);
                    branches[i].setRotation(180);
                }
                else if (branchPosition[i] == side::RIGHT) {
                    branches[i].setPosition(1330, height);
                    branches[i].setRotation(0);
                }
                else {
                    branches[i].setPosition(3000, height);
                }
            }
            if (logActive) {
                spriteLog.setPosition(spriteLog.getPosition().x + (logSpeedX * dt.asSeconds()), spriteLog.getPosition().y + (logSpeedY * dt.asSeconds()));
                if (spriteLog.getPosition().x < -100 || spriteLog.getPosition().x > 2000){
                    logActive = false;
                    spriteLog.setPosition(810, 720);
                }
            }
            if (branchPosition[5] == playerSide) {
                paused = true;
                acceptInput = false;
                spriteRIP.setPosition(525, 760);
                spritePlayer.setPosition(2000, 660);
                messageText.setString("SQUISHED !!");
                FloatRect textRect = messageText.getLocalBounds();
                messageText.setOrigin(textRect.left + textRect.width / 2.0f, textRect.top + textRect.height / 2.0f);
                messageText.setPosition(1920 / 2.0f, 1080 / 2.0f);
                death.play();
            }
        }

        window.clear();
        window.draw(spriteBackground);
        window.draw(spriteCloud1);
        window.draw(spriteCloud2);
        window.draw(spriteCloud3);
        window.draw(spriteCloud4);
        for (int i = 0; i < NUM_BRANCHES; i++) {
            window.draw(branches[i]);
        }
        window.draw(spriteTree);
        window.draw(spritePlayer);
        window.draw(spriteAxe);
        window.draw(spriteLog);
        window.draw(spriteRIP);
        window.draw(spriteBee);
        window.draw(scoreText);
        window.draw(timeBar);
        if (paused) {
            window.draw(messageText);
        }
        window.display();
    }
    return 0;
}

//Branch Position
void updateBranches(int seed) {
    for (int j = NUM_BRANCHES - 1; j > 0; j--) {
        branchPosition[j] = branchPosition[j - 1];
    }
    srand((int)time(0) + seed);
    int r = (rand() % 5);
    switch (r) {
    case 0:
        branchPosition[0] = side::LEFT;
        break;
    case 1:
        branchPosition[0] = side::RIGHT;
        break;
    case 2:
        branchPosition[0] = side::NONE;
        break;
    }
}