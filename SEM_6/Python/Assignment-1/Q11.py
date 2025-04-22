class Dog:
    def speak(self):
        return "Woof!"
class Robot:
    def speak(self):
        return "Beep Boop!"
def describe(entity):
    print(entity.speak())
dog = Dog()
robot = Robot()
describe(dog)
describe(robot)

"""
How Duck Typing Works Here:
The describe() function does not check the type of the object.
As long as the object has a speak() method, it works.
Both Dog and Robot have speak(), so they are compatible.
Python's duck typing allows flexibility without enforcing explicit type checks.
"""