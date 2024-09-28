input_string = input("Enter a string: ")
for i in range(len(input_string)):
    for j in range(i + 1, len(input_string) + 1):
        print(input_string[i:j])
