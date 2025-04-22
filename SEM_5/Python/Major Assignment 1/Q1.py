def basic_salary(hourly_rate, hours_per_week):
    return hourly_rate * min(40, hours_per_week) * 4

def overtime_salary(hourly_rate, hours_per_week):
    if hours_per_week > 40:
        overtime_hours = hours_per_week - 40
        return overtime_hours * hourly_rate * 1.5 * 4
    return 0

def total_salary(hourly_rate, hours_per_week):
    return basic_salary(hourly_rate, hours_per_week) + overtime_salary(hourly_rate, hours_per_week)

hourly_rate = float(input("Enter hourly rate: "))
hours_per_week = float(input("Enter hours worked per week: "))

print("Total Salary:", total_salary(hourly_rate, hours_per_week))
