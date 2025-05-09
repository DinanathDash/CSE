import random
from math import gcd

# Generate a prime number (naive way)
def is_prime(n):
    if n <= 1: return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0: return False
    return True

def generate_prime(start=100, end=300):
    while True:
        p = random.randint(start, end)
        if is_prime(p): return p

# Extended Euclidean Algorithm
def modinv(a, m):
    m0, x0, x1 = m, 0, 1
    while a > 1:
        q = a // m
        a, m = m, a % m
        x0, x1 = x1 - q * x0, x0
    return x1 % m0

# Key generation
def generate_keys():
    p = generate_prime()
    q = generate_prime()
    while q == p:
        q = generate_prime()
    n = p * q
    phi = (p - 1) * (q - 1)

    e = 65537
    while gcd(e, phi) != 1:
        e = random.randrange(2, phi)

    d = modinv(e, phi)
    return (e, n), (d, n)

# Encryption
def encrypt(msg, public_key):
    e, n = public_key
    return [pow(ord(char), e, n) for char in msg]

# Decryption
def decrypt(cipher, private_key):
    d, n = private_key
    return ''.join([chr(pow(char, d, n)) for char in cipher])

# Usage
public, private = generate_keys()
message = "hello"
ciphertext = encrypt(message, public)
decrypted = decrypt(ciphertext, private)

print("Message:", message)
print("Encrypted:", ciphertext)
print("Decrypted:", decrypted)
