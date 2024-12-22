# Case (a)
f = open('PYTHON', 'w')
f.write('failure is a part of success')
f = open('PYTHON', 'r')
print("Case (a) Output:", f.read(4))  # Read first 4 characters
f.close()

# Case (b)
f = open('PYTHON', 'w')
f.write('failure is a part of success')
f = open('PYTHON', 'r')
print("Case (b) Output:", f.read())  # Read the entire content
f.close()

# Case (c)
f = open('PYTHON', 'w')
f.write('failure is a part of success also, i am fine')
f = open('PYTHON', 'r')
print("Case (c) Output:", f.readline())  # Read the first line
f.close()

# Case (d)
f = open('PYTHON', 'w')
description = ['we either choose the pain of discipline \n', 'or\n', 'the pain of regret\n']
f.writelines(description)  # Write lines to the file
f.close()
f = open('PYTHON', 'r')
print("Case (d) Output:", f.read())  # Read all content
f.close()