import matplotlib.pyplot as plt
from collections import Counter
resp = [1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]
freq = Counter(resp)
total_resp = len(resp)
per = {key: (value / total_resp) * 100 for key, value in freq.items()}
labels = list(freq.keys())
freq_values = list(freq.values())
per_val = [per[key] for key in labels]
plt.bar(labels, freq_values, color='skyblue')
for i, (freq, percent) in enumerate(zip(freq_values, per_val)):
    plt.text(labels[i], freq + 0.1, f"{percent:.1f}%", ha='center')
plt.xlabel('Responses')
plt.ylabel('Frequency')
plt.title('Response Frequencies and Percentages')
plt.show()