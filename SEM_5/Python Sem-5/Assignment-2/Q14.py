room_prices = {'Standard': 100, 'Deluxe': 150, 'Suite': 250}
room_type = input("Enter room type (Standard/Deluxe/Suite): ")
if room_type not in room_prices:
    print("Invalid room type.")
    exit()
nights = int(input("Enter the number of nights: "))
season = input("Enter the season (Normal/Peak/Off): ")
loyalty_member = input("Are you a loyalty member? (yes/no): ")
cost_per_night = room_prices[room_type]
total_cost = cost_per_night * nights
if nights > 7:
    total_cost *= 0.80
elif nights > 3:
    total_cost *= 0.90
if season.lower() == "peak":
    total_cost *= 1.20
elif season.lower() == "off":
    total_cost *= 0.85
if loyalty_member.lower() == "yes":
    total_cost *= 0.95
print(f"The final booking cost is: ${total_cost:.2f}")