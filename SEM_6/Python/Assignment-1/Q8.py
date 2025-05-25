class Vehicle:
    def __init__(self, make, model):
        self.make = make
        self.model = model
    def display_info(self):
        print(f"Make: {self.make}, Model: {self.model}")
class Car(Vehicle):
    def __init__(self, make, model, num_doors):
        super().__init__(make, model)
        self.num_doors = num_doors
    def display_info(self):
        super().display_info()
        print(f"Number of doors: {self.num_doors}")
vehicle = Vehicle("Toyota", "Corolla")
car = Car("Honda", "Civic", 4)
vehicle.display_info()
car.display_info()

"""
How Inheritance Works Here:
The Car subclass inherits attributes (make, model) and methods (display_info()) from the Vehicle base class.
The super().__init__() call allows Car to initialize inherited attributes from Vehicle.
The display_info() method in Car extends the base class method by adding num_doors.
"""