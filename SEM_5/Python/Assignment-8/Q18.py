import csv
def merge_csv_files(file1, file2, output_file):
    try:
        with open(file1, mode='r', newline='') as f1, open(file2, mode='r', newline='') as f2:
            reader1 = csv.DictReader(f1)
            reader2 = csv.DictReader(f2)
            fieldnames = reader1.fieldnames
            combined_data = list(reader1) + list(reader2)
            with open(output_file, mode='w', newline='') as output:
                writer = csv.DictWriter(output, fieldnames=fieldnames)
                writer.writeheader()
                writer.writerows(combined_data)
            print("Combined Dataset:")
            for row in combined_data:
                print(row)
    except FileNotFoundError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
file1 = 'titanic1.csv'
file2 = 'titanic2.csv'
output_file = 'combined_titanic.csv'
merge_csv_files(file1, file2, output_file)