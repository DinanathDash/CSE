from nltk.corpus import wordnet
def word_analysis(word):
    synonyms = []
    antonyms = []
    definitions = []
    for syn in wordnet.synsets(word):
        definitions.append(syn.definition())
        for lemma in syn.lemmas():
            synonyms.append(lemma.name())
            if lemma.antonyms():
                antonyms.append(lemma.antonyms()[0].name())
    print("Definitions:", definitions)
    print("Synonyms:", set(synonyms))
    print("Antonyms:", set(antonyms))
word = input("Enter a word: ")
word_analysis(word)
