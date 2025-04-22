def format_2d_array(arr):
    max_widths = [max(len(str(x)) for x in col) for col in zip(*arr)]
    format_str = " ".join(f"{{:>{w}}}" for w in max_widths)
    for row in arr:
        print(format_str.format(*row))
array = [[123, 45, 6], [789, 10, 1111]]
format_2d_array(array)