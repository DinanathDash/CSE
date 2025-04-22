from wordcloud import WordCloud
import numpy as np
from PIL import Image
import matplotlib.pyplot as plt
def generate_wordcloud(file_path):
    with open(file_path, 'r') as file:
        text = file.read()
    wordcloud = WordCloud(width=800, height=400, background_color='white').generate(text)
    plt.imshow(wordcloud, interpolation='bilinear')
    plt.axis('off')
    plt.show()
def generate_shaped_wordcloud(file_path, mask_path):
    mask = np.array(Image.open(mask_path))
    with open(file_path, 'r') as file:
        text = file.read()
    wordcloud = WordCloud(mask=mask, background_color='white', contour_width=1, contour_color='black').generate(text)
    plt.imshow(wordcloud, interpolation='bilinear')
    plt.axis('off')
    plt.show()
generate_wordcloud('file.txt')
generate_shaped_wordcloud('file.txt', 'image.png')
