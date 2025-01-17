def basic_salary(hourly_rate, hours_per_week):
    return hourly_rate * min(40, hours_per_week) * 4

def overtime_salary(hourly_rate, hours_per_week):
    if hours_per_week > 40:
        overtime_hours = hours_per_week - 40
        return overtime_hours * hourly_rate * 1.5 * 4
    return 0

def total_salary(hourly_rate, hours_per_week):
    return basic_salary(hourly_rate, hours_per_week) + overtime_salary(hourly_rate, hours_per_week)

def tax_amount(basic_salary):
    if basic_salary < 60000:
        return basic_salary * 0.10
    elif 60000 <= basic_salary <= 85000:
        return basic_salary * 0.15
    else:
        return basic_salary * 0.20

hourly_rate = float(input("Enter hourly rate: "))
hours_per_week = float(input("Enter hours worked per week: "))

basic = basic_salary(hourly_rate, hours_per_week)
overtime = overtime_salary(hourly_rate, hours_per_week)
total = total_salary(hourly_rate, hours_per_week)
tax = tax_amount(basic)

print("Basic Salary:", basic)
print("Overtime Salary:", overtime)
print("Total Salary:", total)
print("Tax Deducted:", tax)
