from datetime import datetime, timedelta
def calculate_new_date(today_date, num_days):
    date_obj = datetime.strptime(today_date, "%Y-%m-%d")
    new_date = date_obj + timedelta(days=num_days)
    return new_date.strftime("%Y-%m-%d")
def calculate_new_day(current_day, num_days):
    days_of_week = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    current_index = days_of_week.index(current_day)
    new_index = (current_index + num_days) % 7
    return days_of_week[new_index]
def main():
    today_date = input("Enter today's date (YYYY-MM-DD): ")
    current_day = input("Enter today's day of the week: ")
    num_days = int(input("Enter the number of days: "))
    new_date = calculate_new_date(today_date, num_days)
    new_day = calculate_new_day(current_day, num_days)
    print(f"New date: {new_date}")
    print(f"New day: {new_day}")
main()
