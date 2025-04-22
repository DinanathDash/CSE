def track_supply_distribution(supplies):
    distribution = {}
    for city, supply_type, quantity in supplies:
        if city not in distribution:
            distribution[city] = {}
        distribution[city][supply_type] = quantity
    return distribution

supplies = [("Kyiv", "Food", 500), ("Moscow", "Medicines", 200), ("Lviv", "Water", 300), 
            ("Saint Petersburg", "Blankets", 100), ("Kharkiv", "Food", 150)]
supply_distribution = track_supply_distribution(supplies)

print("Supply distribution:", supply_distribution)