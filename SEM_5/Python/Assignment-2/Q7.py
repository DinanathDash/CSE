limit = int(input("Enter a number: "))
prime_sum = 0
for number in range(2, limit):
    is_prime = True
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            is_prime = False
            break
        
    if is_prime:
        prime_sum += number
print(f"The sum of all prime numbers less than {limit} is {prime_sum}.")