import json
def load_json_data(filename):
    try:
        with open(filename, 'r') as file:
            data = json.load(file)
            print("JSON data successfully loaded.")
            print("Deserialized Data:", data)
    except FileNotFoundError:
        print(f"Error: The file '{filename}' does not exist.")
        print("No valid data could be loaded.")
    except json.JSONDecodeError:
        print(f"Error: The file '{filename}' contains invalid JSON data.")
        print("No valid data could be loaded.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
        print("No valid data could be loaded.")
load_json_data('data.json')