def vigenere_encrypt(plaintext, keyword):
    plaintext = plaintext.replace(" ", "").upper()
    keyword = keyword.upper()
    extended_keyword = (keyword * (len(plaintext) // len(keyword))) + keyword[:len(plaintext) % len(keyword)]
    ciphertext = []
    for p, k in zip(plaintext, extended_keyword):
        encrypted_letter = chr(((ord(p) - 65 + ord(k) - 65) % 26) + 65)
        ciphertext.append(encrypted_letter)   
    return ''.join(ciphertext)

def vigenere_decrypt(ciphertext, keyword):
    ciphertext = ciphertext.replace(" ", "").upper()
    keyword = keyword.upper()
    extended_keyword = (keyword * (len(ciphertext) // len(keyword))) + keyword[:len(ciphertext) % len(keyword)]
    plaintext = []
    for c, k in zip(ciphertext, extended_keyword):
        decrypted_letter = chr(((ord(c) - 65 - (ord(k) - 65)) % 26) + 65)
        plaintext.append(decrypted_letter)
    return ''.join(plaintext)

keyword = "KEY"
plaintext = "HELLO VIGENERE CIPHER"
encrypted = vigenere_encrypt(plaintext, keyword)
decrypted = vigenere_decrypt(encrypted, keyword)
print(f"Plaintext: {plaintext}")
print(f"Encrypted: {encrypted}")
print(f"Decrypted: {decrypted}")
