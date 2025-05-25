import random
p = 23
g = 5
a = random.randint(1, p-2)
A = pow(g, a, p)
b = random.randint(1, p-2)
B = pow(g, b, p)
shared_key_alice = pow(B, a, p)
shared_key_bob = pow(A, b, p)
print(f"Alice's Private Key: {a}")
print(f"Bob's Private Key: {b}")
print(f"Alice's Public Key (A): {A}")
print(f"Bob's Public Key (B): {B}")
print(f"Shared Key at Alice: {shared_key_alice}")
print(f"Shared Key at Bob: {shared_key_bob}")
print("Key exchange successful:", shared_key_alice == shared_key_bob)