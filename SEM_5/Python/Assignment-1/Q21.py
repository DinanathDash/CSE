import math
height = float(input("Enter the height in meters: "))
initial_speed = 0
acceleration = 9.8

final_speed = math.sqrt(initial_speed**2 + 2 * acceleration * height)

print("The final speed is: %.2f m/s" %final_speed)