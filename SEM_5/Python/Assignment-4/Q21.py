n = [10, 3, 7, 1, 9, 4, 2, 8, 5, 6]
l=list(map(lambda x: x ** 2, filter(lambda x: x % 2 != 0, n)))
print(l)


'''
Answers
a) How many times does the filter operation call its lambda argument?

The filter operation iterates over the entire list numbers, applying the lambda function lambda x: x % 2 != 0 to each element to check if it is odd.
Since numbers has 10 elements, the filter operation calls its lambda function 10 times.
b) How many times does the map operation call its lambda argument?

After filtering, the list contains only the odd numbers: [3, 7, 1, 9, 5].
This means there are 5 elements that pass the filter (the odd numbers).
The map operation then calls its lambda function lambda x: x ** 2 on each of these 5 elements.
Therefore, the map operation calls its lambda function 5 times.
c) If you reverse the filter and map operations, how many times does the map operation call its lambda argument?

If we reverse the operations, the map operation would apply lambda x: x ** 2 to every element in numbers before filtering.
Since numbers has 10 elements, map would call its lambda function 10 times.
After applying map, the filter operation would then receive the squared values and apply the condition lambda x: x % 2 != 0 to filter the odd results.
'''