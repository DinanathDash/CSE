class BankAccount:
    def __init__(self, account_holder, balance=0.0):
        self.__account_holder = account_holder
        self.__balance = balance
    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            print(f"₹{amount} deposited successfully.")
        else:
            print("Invalid deposit amount.")
    def withdraw(self, amount):
        if 0 < amount <= self.__balance:
            self.__balance -= amount
            print(f"₹{amount} withdrawn successfully.")
        else:
            print("Insufficient balance or invalid amount.")
    def get_balance(self):
        return f"Available balance: ₹{self.__balance}"
account = BankAccount("Dinanath Dash", 5000)
account.deposit(1500)
print(account.get_balance())
account.withdraw(2000)
print(account.get_balance())

"""
Why Use Private Attributes?
Encapsulation - Prevents direct modification of sensitive attributes.
Data Security - Ensures controlled access via methods, reducing risks of unintended changes.
Prevents Accidental Modification - Direct access to __balance is restricted, avoiding unintended overwrites.
"""