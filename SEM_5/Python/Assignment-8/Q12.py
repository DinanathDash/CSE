import re
def extract_unique_emails(input_file, output_file):
    try:
        email_pattern = r'[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}'
        unique_emails = set()
        with open(input_file, 'r') as file:
            content = file.read()
            emails = re.findall(email_pattern, content)
            unique_emails.update(emails)
        with open(output_file, 'w') as output_f:
            for email in unique_emails:
                output_f.write(email + "\n")
        print(f"Unique email addresses have been saved to '{output_file}'.")
    except FileNotFoundError:
        print(f"Error: The file '{input_file}' does not exist.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
input_file = 'sample.txt'
output_file = 'Output.txt'
extract_unique_emails(input_file, output_file)