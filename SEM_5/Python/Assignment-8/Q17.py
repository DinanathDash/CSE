def write_to_file(file_name):
    try:
        user_input = input("Enter some text to write to the file: ").strip()
        if not user_input:
            raise ValueError("Input cannot be empty.")
        with open(file_name, 'a') as file:
            file.write(user_input + '\n')
        print(f"Successfully wrote to the file '{file_name}'.")
    except ValueError as ve:
        print(f"Error: {ve}")
    except IOError:
        print("Error: Unable to write to the file. Please check the file permissions or path.")
    except Exception as e:
        print(f"Unexpected error: {e}")
file_name = 'user_input.txt'
write_to_file(file_name)