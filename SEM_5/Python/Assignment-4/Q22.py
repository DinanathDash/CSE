n = [10, 3, 7, 1, 9, 4, 2, 8, 5, 6]
l = list(filter(lambda x: x % 2 == 0, map(lambda x: x * 2, n)))
print(l)
'''
Why This Happens
The difference arises because:

In the original code, filter removes elements that don't meet the condition (x % 2 == 0) before mapping, so only the even numbers are doubled.
In the reordered code, map first doubles every element, and then filter checks for evenness on the doubled values. Since doubling any integer always results in an even number, all elements pass the filter, giving the mapped values as the final result.
'''