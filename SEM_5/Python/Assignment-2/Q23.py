hundred_notes = 10
fifty_notes = 10
twenty_notes = 10
ten_notes = 10
total_cash = (100 * hundred_notes) + (50 * fifty_notes) + (20 * twenty_notes) + (10 * ten_notes)
amount = int(input("Enter the amount to withdraw: "))

if amount % 10 != 0:
    print("Amount must be a multiple of 10.")
    
elif amount > total_cash:
    print("ATM does not have enough cash.")
    
else:
    hundred_dispensed = 0
    fifty_dispensed = 0
    twenty_dispensed = 0
    ten_dispensed = 0
    
    if amount >= 100:
        hundred_dispensed = min(amount // 100, hundred_notes)
        amount -= hundred_dispensed * 100
    
    if amount >= 50:
        fifty_dispensed = min(amount // 50, fifty_notes)
        amount -= fifty_dispensed * 50
    
    if amount >= 20:
        twenty_dispensed = min(amount // 20, twenty_notes)
        amount -= twenty_dispensed * 20
    
    if amount >= 10:
        ten_dispensed = min(amount // 10, ten_notes)
        amount -= ten_dispensed * 10
    
    if amount == 0:
        print("Dispensed Notes:")
        if hundred_dispensed > 0:
            print(f"100 x {hundred_dispensed}")
        if fifty_dispensed > 0:
            print(f"50 x {fifty_dispensed}")
        if twenty_dispensed > 0:
            print(f"20 x {twenty_dispensed}")
        if ten_dispensed > 0:
            print(f"10 x {ten_dispensed}")
    else:
        print("ATM cannot dispense the exact amount requested.")
