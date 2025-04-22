a = int(input("Enter the first integer: "))
b = int(input("Enter the second integer: "))
c = int(input("Enter the third integer: "))
smallest = min(a, b, c)
largest = max(a, b, c)
middle = a + b + c - smallest - largest

print("Sorted order:", smallest, middle, largest)