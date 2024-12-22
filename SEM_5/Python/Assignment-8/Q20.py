import pandas as pd
def analyze_ticket_prices_and_under_18(file_name):
    try:
        df = pd.read_csv(file_name)
        print("Ticket Price Distribution (Fare) Statistics:")
        print(df['Fare'].describe())
        under_18 = df[df['Age'] < 18]
        print("\nPassengers under 18 years old on the Titanic:")
        for index, row in under_18.iterrows():
            print(row['Name'])
    except FileNotFoundError:
        print(f"Error: The file '{file_name}' does not exist.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
file_name = 'titanic.csv'
analyze_ticket_prices_and_under_18(file_name)