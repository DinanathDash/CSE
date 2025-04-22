import pandas as pd
def find_passenger_with_longest_name(file_name):
    try:
        df = pd.read_csv(file_name)
        if 'Name' not in df.columns:
            print("Error: 'Name' column is missing in the file.")
            return
        df['Name_Length'] = df['Name'].apply(len)
        longest_name_row = df.loc[df['Name_Length'].idxmax()]
        print("Passenger with the longest name:")
        print(f"Name: {longest_name_row['Name']}")
        print(f"Length of Name: {longest_name_row['Name_Length']}")
        print(f"PassengerId: {longest_name_row['PassengerId']}")
        print(f"Age: {longest_name_row['Age']}")
    except FileNotFoundError:
        print(f"Error: The file '{file_name}' does not exist.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
file_name = 'titanic1.csv'
find_passenger_with_longest_name(file_name)