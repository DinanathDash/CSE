import requests
from bs4 import BeautifulSoup
import textstat
urls = [
    "https://www.bbc.com/news/world",
    "https://edition.cnn.com/world",
    "https://www.aljazeera.com/news/"
]
def analyze_readability(url):
    response = requests.get(url)
    soup = BeautifulSoup(response.content, 'html.parser')
    text = ' '.join([p.get_text() for p in soup.find_all('p')])
    readability = {
        'avg_words_per_sentence': textstat.avg_sentence_length(text),
        'avg_chars_per_word': textstat.avg_character_per_word(text),
        'avg_syllables_per_word': textstat.avg_syllables_per_word(text)
    }
    print("URL:", url)
    print("Average Words per Sentence:", readability['avg_words_per_sentence'])
    print("Average Characters per Word:", readability['avg_chars_per_word'])
    print("Average Syllables per Word:", readability['avg_syllables_per_word'])
for url in urls:
    analyze_readability(url)
