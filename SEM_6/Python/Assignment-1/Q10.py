class CommissionEmployee:
    def __init__(self, name, sales, commission_rate):
        if sales < 0 or commission_rate < 0:
            raise ValueError("Sales and commission rate must be non-negative")
        self.name = name
        self.sales = sales
        self.commission_rate = commission_rate
    def earnings(self):
        return self.sales * self.commission_rate
    def __repr__(self):
        return f"CommissionEmployee(name='{self.name}', sales={self.sales}, "+\
                f"commission_rate={self.commission_rate})"
try:
    employee = CommissionEmployee("John Doe", 5000, 0.1)
    print(employee)
    print(f"Earnings: ₹{employee.earnings()}")
    employee.sales = 7000
    print(f"Updated Earnings: ₹{employee.earnings()}")
    employee.sales = -1000  
except ValueError as e:
    print(f"Error: {e}")
