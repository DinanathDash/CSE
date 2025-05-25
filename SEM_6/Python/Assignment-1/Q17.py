species = "Global Species"
class Animal:
    species = "Class Species"
    def __init__(self, species):
        self.species = species
    def display_species(self):
        print("Instance species:", self.species)
        print("Class species:", Animal.species)
        print("Global species:", globals()['species'])
a = Animal("Instance Species")
a.display_species()

"""
Scope Resolution Process:
Python follows a LEGB (Local → Enclosing → Global → Built-in) resolution order:

Instance Namespace (self.species): self.species = "Instance Species" sets the instance-specific species attribute. When self.species is accessed, Python first checks the object's namespace and finds "Instance Species".

Class Namespace (Animal.species): Animal.species = "Class Species" is a class-level attribute. If self.species did not exist, it would fall back to Animal.species. Animal.species is directly accessed in display_species(), printing "Class Species".

Global Namespace (species): species = "Global Species" is a global variable. globals()['species'] retrieves it explicitly, printing "Global Species".
"""