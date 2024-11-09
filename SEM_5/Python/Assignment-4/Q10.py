def num_elem(list):
    total_sum = 0
    for i in list:
        for j in i:
            if isinstance(j, (int, float)):
                total_sum += j
    print("Sum of all numeric elements:", total_sum)
l = ((1, 2, 3), (4.5, 'a', 6), (7, 8, 'b', 9))
num_elem(l)