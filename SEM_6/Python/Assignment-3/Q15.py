import requests
from bs4 import BeautifulSoup
import spacy
nlp = spacy.load('en_core_web_sm')
def analyze_entities(url):
    response = requests.get(url)
    soup = BeautifulSoup(response.content, 'html.parser')
    text = ' '.join([p.get_text() for p in soup.find_all('p')])
    doc = nlp(text)
    for ent in doc.ents:
        print(f"{ent.text} -> {ent.label_}")
url = input("Enter the news article URL: ")
analyze_entities(url)
