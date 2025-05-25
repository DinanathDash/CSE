"""
Advantages of Data Classes Over Named Tuples
Feature	            Named Tuple	            Data Class
Immutability	    Immutable by default	Mutable by default
Methods	            Cannot have methods	    Can define methods
Inheritance	        Limited support         Fully supports inheritance
Default Values	    Requires _replace()	    Supports default values
Type Annotations	Optional	            Strongly supported
Flexibility	        Less flexible	        More flexible with additional functionality

Example: NamedTuple vs. Data Class
Using NamedTuple

from collections import namedtuple
Person = namedtuple("Person", ["name", "age"])
p1 = Person("Alice", 30)
print(p1.name, p1.age)
try:
    p1.age = 35
except AttributeError as e:
    print(e)

Using Data Class
from dataclasses import dataclass
@dataclass
class Person:
    name: str
    age: int
    def birthday(self):
        self.age += 1
        return f"Happy Birthday! {self.name} is now {self.age} years old."
p2 = Person("Alice", 30)
print(p2.birthday())  
p2.age = 35  # Mutable
print(p2)

Key Takeaways:
Data classes allow mutability, while named tuples are immutable.
Data classes support methods and custom logic, enhancing functionality.
Data classes allow default values, type hints, and inheritance.
"""