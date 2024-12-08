def clear_field(cities):
    return sorted(set(cities))

cities = ["Kyiv", "Kharkiv", "Odessa", "Kyiv", "Lviv", "Kharkiv", "Dnipro"]
cleaned_cities = clear_field(cities)
print("Cleaned cities:", cleaned_cities)