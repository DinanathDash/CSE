/*
Computation:
Let deltaTime be the time elapsed per frame (in seconds), given by:
deltaTime = clock.restart().asSeconds()
Speed of the bee = beeSpeed (pixels/second)
Distance covered in one frame:
distance = beeSpeed × deltaTime

Final Formula:
distance = beeSpeed × clock.restart().asSeconds()
*/