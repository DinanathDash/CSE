import math
class Shape:
    def area(self):
        raise NotImplementedError("Subclasses must implement this method")
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius
    def area(self):
        return math.pi * self.radius ** 2
class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height
    def area(self):
        return self.width * self.height
shapes = [Circle(5), Rectangle(4, 6)]
for shape in shapes:
    print(f"Area: {shape.area()}")

"""
How Polymorphism Works Here:
The Shape base class defines a common interface (area()).
Circle and Rectangle override area() to provide specific implementations.
Using polymorphism, both objects can be processed through the same loop, simplifying handling different shapes dynamically.
"""