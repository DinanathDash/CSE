#include <cstdlib>
#include <ctime>

srand(static_cast<unsigned int>(time(0)));
int randomNumber = rand() % 21 + 80;
