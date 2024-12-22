"""In Python, the read and readlines methods are used to read the contents of a file, but they differ in functionality and output:

1. read() Method
Purpose: Reads the entire content of a file as a single string.
Output: A single string containing all the data in the file.
Usage:
python
Copy code
with open("example.txt", "r") as file:
    content = file.read()
    print(content)
Best For: When you need the whole file's content as one continuous string.
2. readlines() Method
Purpose: Reads all the lines of a file and returns them as a list of strings.
Output: A list where each element is a single line (including the newline character at the end of each line).
Usage:
python
Copy code
with open("example.txt", "r") as file:
    lines = file.readlines()
    print(lines)
Best For: When you need to process each line individually.
Key Differences:
Feature	read	readlines
Output	Single string	List of strings
Memory Usage	Reads entire file into memory	Reads entire file into memory (split by lines)
When to Use	For processing entire content	For line-by-line processing
For large files, both can use significant memory. In such cases, consider reading the file line-by-line using a loop:

python
Copy code
with open("example.txt", "r") as file:
    for line in file:
        print(line.strip())"""