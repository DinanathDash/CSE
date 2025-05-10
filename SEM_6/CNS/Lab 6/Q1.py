from Crypto.Cipher import AES
import binascii

def encryption(aes, plaintext):
    while len(plaintext) % 16 != 0:
        plaintext += ' '
    plaintext = plaintext.encode()
    ciphertext = aes.encrypt(plaintext)
    return binascii.hexlify(ciphertext).decode()

def decryption(aes, ciphertext_hex):
    ciphertext = binascii.unhexlify(ciphertext_hex)
    plaintext = aes.decrypt(ciphertext)
    return plaintext.decode().strip()

if __name__ == "__main__":
    try:
        key = input("Enter key (16 bytes): ")
        if len(key) != 16:
            print("Key must be exactly 16 characters!")
            exit()
        plaintext = input("Enter plaintext: ")
        print("Plaintext is:", plaintext)
        key_bytes = key.encode()
        aes_cipher = AES.new(key_bytes, AES.MODE_ECB)
        ciphertext = encryption(aes_cipher, plaintext)
        print("Ciphertext after encryption:", ciphertext)
        decrypted_text = decryption(aes_cipher, ciphertext)
        print("Plaintext after decryption:", decrypted_text)
    except ValueError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")