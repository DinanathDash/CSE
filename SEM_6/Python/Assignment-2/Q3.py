def generate_numbers(n, start=1, num=""):
    if n == 0:
        print(num)
        return
    for i in range(start, 10):
        generate_numbers(n - 1, i + 1, num + str(i))

n = int(input("Enter the number of digits: "))
generate_numbers(n)