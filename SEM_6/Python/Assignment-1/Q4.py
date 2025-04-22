"""
Access Control in Python
Python enforces access control through naming conventions rather than strict access modifiers like in Java or C++. It uses prefixes (_ and __) to indicate different levels of attribute visibility.
1. Public Attributes (name): Accessible from anywhere (inside and outside the class). No restrictions on modification.

class Example:
    def __init__(self):
        self.public_var = "I am Public"
obj = Example()
print(obj.public_var)
obj.public_var = "Modified"

2. Protected Attributes (_name): Indicated with a single underscore (_). Not enforced by Python but treated as a convention: "Use this carefully." Can still be accessed but should be considered internal to the class or its subclasses.

class Example:
    def __init__(self):
        self._protected_var = "I am Protected"
obj = Example()
print(obj._protected_var)
obj._protected_var = "Modified"

3. Private Attributes (__name): Indicated with double underscores (__). Python performs name mangling, renaming __var to _ClassName__var, making it harder to access directly. Cannot be accessed directly outside the class but can still be accessed using name mangling.

class Example:
    def __init__(self):
        self.__private_var = "I am Private"
obj = Example()
# print(obj.__private_var)
print(obj._Example__private_var)
"""