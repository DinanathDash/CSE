def rotate(x, y, z):
    return (y, z, x)
a, b, c = 'Doug', 22, 1984
for _ in range(3):
    a, b, c = rotate(a, b, c)
    print("a:", a, ", b:", b, ", c:", c)