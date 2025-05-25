from textblob import TextBlob
from textblob.sentiments import NaiveBayesAnalyzer
from bs4 import BeautifulSoup
import requests
from nltk.corpus import stopwords
url = 'https://www.bbc.com/news/world-asia-60565556'
response = requests.get(url)
page_content = response.text
soup = BeautifulSoup(page_content, 'html.parser')
text = soup.get_text(separator=' ')
stop_words = set(stopwords.words('english'))
filtered_text = ' '.join(word for word in text.split() if word.lower() not in stop_words)
blob = TextBlob(filtered_text, analyzer=NaiveBayesAnalyzer())
print("\nOverall Sentiment:")
print(blob.sentiment)
print("\nSentiment for Each Sentence:")
for sentence in blob.sentences:
    print(f"{sentence}\nSentiment: {sentence.sentiment}")
