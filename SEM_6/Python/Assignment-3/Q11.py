from textblob import TextBlob
from collections import Counter
from deep_translator import GoogleTranslator
def translate_text(text):
    print("French:", GoogleTranslator(source='auto', target='fr').translate(text))
    print("Spanish:", GoogleTranslator(source='auto', target='es').translate(text))
    print("German:", GoogleTranslator(source='auto', target='de').translate(text))
def analyze_sentiment(text):
    blob = TextBlob(text)
    for sentence in blob.sentences:
        print(f"{sentence} -> Polarity: {sentence.sentiment.polarity}, Subjectivity: {sentence.sentiment.subjectivity}")
def sentence_sentiment(paragraph):
    blob = TextBlob(paragraph)
    for sentence in blob.sentences:
        print(f"{sentence} -> Sentiment Score: {sentence.sentiment}")
def pos_tagging(sentence):
    blob = TextBlob(sentence)
    for word, tag in blob.tags:
        print(f"{word} -> {tag}")
def spell_check(word):
    blob = TextBlob(word)
    suggestions = blob.correct()
    print("Suggested Correction:", suggestions)
def extract_adjectives(paragraph):
    blob = TextBlob(paragraph)
    adjectives = [word for word, tag in blob.tags if tag == "JJ"]
    print("Adjectives:", adjectives)
def extract_keywords(text):
    blob = TextBlob(text)
    noun_phrases = blob.noun_phrases
    common_phrases = Counter(noun_phrases).most_common(5)
    print("Top 5 Keywords:", common_phrases)
def summarize_text(paragraph):
    blob = TextBlob(paragraph)
    scores = {sentence: sum(blob.noun_phrases.count(phrase) for phrase in sentence.split()) for sentence in blob.sentences}
    summary = sorted(scores, key=scores.get, reverse=True)[:3]
    print("Summary:", ' '.join(str(s) for s in summary))
text = input("Enter a paragraph: ")
translate_text(text)
analyze_sentiment(text)
sentence_sentiment(text)
pos_tagging(text)
word = input("Enter a word to check spelling: ")
spell_check(word)
extract_adjectives(text)
extract_keywords(text)
summarize_text(text)
