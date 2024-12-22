import csv
def read_csv_to_dict(file_name):
    try:
        with open(file_name, mode='r') as file:
            csv_reader = csv.DictReader(file)
            data = list(csv_reader)
            print(f"Successfully read {len(data)} rows from '{file_name}'.")
            print("First 5 rows of the CSV data as dictionaries:")
            for row in data[:5]:
                print(row)
    except FileNotFoundError:
        print(f"Error: The file '{file_name}' does not exist.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
file_name = 'sample.csv'
read_csv_to_dict(file_name)