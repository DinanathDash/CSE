import random
import string

def generate_key_matrix(key):
    key = ''.join(sorted(set(key), key=key.index))
    key = key.replace('J', 'I')
    alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ"
    matrix = key + alphabet
    matrix = ''.join(sorted(set(matrix), key=matrix.index))
    key_matrix = [matrix[i:i+5] for i in range(0, len(matrix), 5)]
    return key_matrix

def create_digraphs(plaintext):
    plaintext = ''.join(filter(str.isalpha, plaintext)).upper()
    plaintext = plaintext.replace('J', 'I')
    digraphs = []
    i = 0
    while i < len(plaintext):
        if i + 1 < len(plaintext) and plaintext[i] == plaintext[i+1]:
            digraphs.append(plaintext[i] + 'X')
            i += 1
        else:
            digraphs.append(plaintext[i:i+2])
            i += 2
    return digraphs

def find_position(letter, key_matrix):
    for i in range(5):
        for j in range(5):
            if key_matrix[i][j] == letter:
                return i, j

def encrypt_digraph(digraph, key_matrix):
    r1, c1 = find_position(digraph[0], key_matrix)
    r2, c2 = find_position(digraph[1], key_matrix)
    if r1 == r2:
        return key_matrix[r1][(c1+1) % 5] + key_matrix[r2][(c2+1) % 5]
    elif c1 == c2:
        return key_matrix[(r1+1) % 5][c1] + key_matrix[(r2+1) % 5][c2]
    else:
        return key_matrix[r1][c2] + key_matrix[r2][c1]

def decrypt_digraph(digraph, key_matrix):
    r1, c1 = find_position(digraph[0], key_matrix)
    r2, c2 = find_position(digraph[1], key_matrix)
    if r1 == r2:
        return key_matrix[r1][(c1-1) % 5] + key_matrix[r2][(c2-1) % 5]
    elif c1 == c2:
        return key_matrix[(r1-1) % 5][c1] + key_matrix[(r2-1) % 5][c2]
    else:
        return key_matrix[r1][c2] + key_matrix[r2][c1]

def playfair_encrypt(plaintext, key):
    key_matrix = generate_key_matrix(key)
    digraphs = create_digraphs(plaintext)
    ciphertext = ''.join([encrypt_digraph(d, key_matrix) for d in digraphs])
    return ciphertext

def playfair_decrypt(ciphertext, key):
    key_matrix = generate_key_matrix(key)
    digraphs = [ciphertext[i:i+2] for i in range(0, len(ciphertext), 2)]
    plaintext = ''.join([decrypt_digraph(d, key_matrix) for d in digraphs])
    return plaintext

def generate_random_plaintext(length):
    return ''.join(random.choices(string.ascii_uppercase, k=length))

key = "KEYWORD"
random_plaintext = generate_random_plaintext(random.randint(5, 10))
encrypted = playfair_encrypt(random_plaintext, key)
decrypted = playfair_decrypt(encrypted, key)
print(f"Generated Plaintext: {random_plaintext}")
print(f"Encrypted: {encrypted}")
print(f"Decrypted: {decrypted}")