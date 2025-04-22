class InsufficientFundsError(Exception):
    def __init__(self, balance, withdrawal_amount):
        super().__init__(f"Insufficient funds: Balance ₹{balance}, "+\
                         f"Withdrawal ₹{withdrawal_amount}")
        self.balance = balance
        self.withdrawal_amount = withdrawal_amount

class BankAccount:
    def __init__(self, balance):
        self.balance = balance

    def withdraw(self, amount):
        if amount > self.balance:
            raise InsufficientFundsError(self.balance, amount)
        self.balance -= amount
        return f"Withdrawal successful. Remaining balance: ₹{self.balance}"

try:
    account = BankAccount(5000)
    print(account.withdraw(7000))
except InsufficientFundsError as e:
    print(e)
