import spacy
from urllib.request import urlopen
nlp = spacy.load('en_core_web_md')
def fetch_text(url):
    response = urlopen(url)
    return response.read().decode('utf-8')
romeo_juliet_url = "https://www.gutenberg.org/cache/epub/1513/pg1513.txt"
comedy_url = "https://www.gutenberg.org/cache/epub/1524/pg1524.txt"
romeo_juliet_text = nlp(fetch_text(romeo_juliet_url))
comedy_text = nlp(fetch_text(comedy_url))
similarity_score = romeo_juliet_text.similarity(comedy_text)
print(f"Similarity between Romeo and Juliet and the comedy: {similarity_score:.2f}")
