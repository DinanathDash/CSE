from datetime import datetime, timedelta

def get_new_date_and_day(today_date, today_day, num_days):
    current_date = datetime.strptime(today_date, "%Y-%m-%d")

    new_date = current_date + timedelta(days=num_days)
    days_of_week = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    
    current_day_index = days_of_week.index(today_day)
    
    new_day_index = (current_day_index + num_days) % 7
    
    new_day = days_of_week[new_day_index]
    
    return new_date.strftime("%Y-%m-%d"), new_day

today_date = input("Enter today's date (YYYY-MM-DD): ")
today_day = input("Enter today's day of the week: ")
num_days = int(input("Enter the number of days: "))

new_date, new_day = get_new_date_and_day(today_date, today_day, num_days)

print(f"New date: {new_date}")
print(f"New day: {new_day}")