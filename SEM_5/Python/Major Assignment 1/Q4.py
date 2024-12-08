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

def gross_salary(basic_salary):
    allowances = basic_salary * 0.20
    tax = tax_amount(basic_salary)
    return basic_salary + allowances - tax

def salary_bracket(gross_salary):
    if gross_salary < 50000:
        return "Low income"
    elif 50000 <= gross_salary <= 80000:
        return "Middle income"
    else:
        return "High income"

hourly_rate = float(input("Enter hourly rate: "))
hours_per_week = float(input("Enter hours worked per week: "))

basic = basic_salary(hourly_rate, hours_per_week)
overtime = overtime_salary(hourly_rate, hours_per_week)
total = total_salary(hourly_rate, hours_per_week)
tax = tax_amount(basic)
gross = gross_salary(basic)

bracket = salary_bracket(gross)

print("Basic Salary:", basic)
print("Overtime Salary:", overtime)
print("Total Salary:", total)
print("Tax Deducted:", tax)
print("Gross Salary:", gross)
print("Salary Bracket:", bracket)
