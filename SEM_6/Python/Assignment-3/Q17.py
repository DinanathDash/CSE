from textblob.utils import strip_punc, lowerstrip
from urllib.request import urlopen
url = "https://www.gutenberg.org/cache/epub/1513/pg1513.txt"
response = urlopen(url)
text = response.read().decode('utf-8')
cleaned_text_strip = strip_punc(text, all=True)
cleaned_text_lowerstrip = lowerstrip(text, all=True)
print("After strip_punc:\n", cleaned_text_strip[:500])
print("\nAfter lowerstrip:\n", cleaned_text_lowerstrip[:500])
