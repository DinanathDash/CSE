def remove_extra_spaces(sentence):
    cleaned_sentence = " ".join(sentence.split())
    return cleaned_sentence
sentence = "Hello    World   this  is   Python"
result = remove_extra_spaces(sentence)
print(f"Original: '{sentence}'")
print(f"Cleaned: '{result}'")