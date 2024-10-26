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

def employee_report(employees):
    print("\nEmployee Salary Report:")
    print("-" * 50)
    print(f"{'Name':<20} {'Basic Salary':<15} {'Gross Salary':<15} {'Tax Amount':<15} {'Salary Bracket':<15}")
    print("-" * 50)

    for name, hourly_rate, hours_per_week in employees:
        basic = basic_salary(hourly_rate, hours_per_week)
        gross = gross_salary(basic)
        tax = tax_amount(basic)
        bracket = salary_bracket(gross)

        print(f"{name:<20} {basic:<15.2f} {gross:<15.2f} {tax:<15.2f} {bracket:<15}")

employees = []
for i in range(3):
    name = input(f"Enter the name of employee {i + 1}: ")
    hourly_rate = float(input(f"Enter hourly rate for {name}: "))
    hours_per_week = float(input(f"Enter hours worked per week for {name}: "))
    employees.append((name, hourly_rate, hours_per_week))

employee_report(employees)
