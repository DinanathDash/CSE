from wordcloud import WordCloud
from textblob import TextBlob
from bs4 import BeautifulSoup
import requests
from nltk.corpus import stopwords
url = 'https://www.python.org'
response = requests.get(url)
page_content = response.text
soup = BeautifulSoup(page_content, 'html.parser')
text = soup.get_text(separator=' ')
stop_words = set(stopwords.words('english'))
filtered_text = ' '.join(word for word in text.split() if word.lower() not in stop_words)
wordcloud = WordCloud(width=800, height=400, background_color='white').generate(filtered_text)
blob = TextBlob(filtered_text)
print("\nOverall Sentiment:")
print(blob.sentiment)
print("\nSentiment for Each Sentence:")
for sentence in blob.sentences:
    print(f"{sentence} -> Sentiment: {sentence.sentiment}")
