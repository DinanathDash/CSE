import math

# Check if number is prime
def is_prime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(math.sqrt(n)) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True

# Extended Euclidean Algorithm
def extended_gcd(a, b):
    if a == 0:
        return b, 0, 1
    gcd, x1, y1 = extended_gcd(b % a, a)
    x = y1 - (b // a) * x1
    y = x1
    return gcd, x, y

# Modular Inverse
def mod_inverse(e, phi):
    gcd, x, _ = extended_gcd(e, phi)
    if gcd != 1:
        return None
    return x % phi

# Encryption
def encrypt(plaintext, e, n):
    ascii_vals = [ord(char) for char in plaintext]
    cipher = [pow(val, e, n) for val in ascii_vals]
    return cipher

# Decryption
def decrypt(ciphertext, d, n):
    decrypted_vals = [pow(val, d, n) for val in ciphertext]
    plaintext = ''.join(chr(val) for val in decrypted_vals)
    return plaintext

# Main RSA setup and execution
def rsa_demo():
    print("RSA Cryptosystem Demonstration\n")

    # Get primes p and q
    p = int(input("Enter prime number p: "))
    while not is_prime(p):
        p = int(input("Invalid! Enter a valid prime number for p: "))

    q = int(input("Enter prime number q: "))
    while not is_prime(q):
        q = int(input("Invalid! Enter a valid prime number for q: "))

    n = p * q
    phi = (p - 1) * (q - 1)

    print(f"\nCalculated n = {n} and φ(n) = {phi}")

    # Choose e
    e = int(input("Enter encryption key e (1 < e < φ(n)) such that gcd(e, φ) = 1: "))
    while math.gcd(e, phi) != 1:
        e = int(input("Invalid! Enter a valid e: "))

    # Compute d
    d = mod_inverse(e, phi)
    if d is None:
        print("Modular inverse could not be found. Try different values.")
        return

    print(f"Public Key (e, n): ({e}, {n})")
    print(f"Private Key (d, n): ({d}, {n})")

    # Message input
    plaintext = input("\nEnter message to encrypt: ")

    # Encrypt and Decrypt
    ciphertext = encrypt(plaintext, e, n)
    print(f"\nEncrypted Message (ciphertext): {ciphertext}")

    decrypted_message = decrypt(ciphertext, d, n)
    print(f"Decrypted Message: {decrypted_message}")

# Run the demo
rsa_demo()
