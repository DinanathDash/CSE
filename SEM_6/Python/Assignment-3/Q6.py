import requests
from bs4 import BeautifulSoup
from wordcloud import WordCloud
from nltk.corpus import stopwords
import matplotlib.pyplot as plt
url = "https://www.python.org"
response = requests.get(url)
soup = BeautifulSoup(response.content, "html.parser")
text = soup.get_text(separator=" ")
text = ' '.join(text.split())
stop_words = set(stopwords.words('english'))
filtered_text = ' '.join(word for word in text.split() if word.lower() not in stop_words)
wordcloud = WordCloud(width=800, height=400, background_color='white').generate(filtered_text)
plt.figure(figsize=(10,5))
plt.imshow(wordcloud, interpolation='bilinear')
plt.axis("off")
plt.show()
