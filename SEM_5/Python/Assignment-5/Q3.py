user_dict = {}
n = int(input("Enter the number of entries in the dictionary: "))
for _ in range(n):
    k = input("Enter the key: ")
    v = float(input(f"Enter the value for '{k}': "))
    user_dict[k] = v
v_sum = sum(user_dict.values())
print("\nThe dictionary is:", user_dict)
print(f"The sum of the values is: {v_sum}")