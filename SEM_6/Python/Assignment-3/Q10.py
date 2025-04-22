from textblob import TextBlob
import requests
url = "https://www.gutenberg.org/files/1342/1342-0.txt"
response = requests.get(url)
book_content = response.text
blob = TextBlob(book_content)
words = blob.words
print("\nMisspelled Words and Corrections:")
for word in words:
    if not word.correct() == word:
        print(f"{word} -> {word.correct()}")
