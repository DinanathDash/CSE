from nltk.tokenize import word_tokenize, sent_tokenize
from nltk.corpus import stopwords
from nltk.stem import PorterStemmer, WordNetLemmatizer
text = "Natural Language Processing enables machines to understand and process human languages. It is a fascinating field with numerous applications, such as chatbots and language translation."
words = word_tokenize(text)
sentences = sent_tokenize(text)
ps = PorterStemmer()
lemmatizer = WordNetLemmatizer()
stemmed_words = [ps.stem(word) for word in words]
lemmatized_words = [lemmatizer.lemmatize(word) for word in words]
stop_words = set(stopwords.words('english'))
filtered_words = [word for word in words if word.lower() not in stop_words]
print("Sentences:\n", sentences)
print("Words:\n", words)
print("Stemmed Words:\n", stemmed_words)
print("Lemmatized Words:\n", lemmatized_words)
print("Filtered Words (No Stopwords):\n", filtered_words)
