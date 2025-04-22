import statistics as st
r = [1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]
frequency = {rating: r.count(rating) for rating in range(1, 6)}
print("Frequency of each rating:")
for rating, count in frequency.items():
    print(f"Rating {rating}: {count}")

value_range = max(r) - min(r)
mean = st.mean(r)
median = st.median(r)
mode = st.mode(r)
variance = st.variance(r)
standard_deviation = st.stdev(r)
print("\nResponse Statistics:")
print(f"Minimum: {min(r)}")
print(f"Maximum: {max(r)}")
print(f"Range: {value_range}")
print(f"Mean: {mean:.2f}")
print(f"Median: {median}")
print(f"Mode: {mode}")
print(f"Variance: {variance:.2f}")
print(f"Standard Deviation: {standard_deviation:.2f}")