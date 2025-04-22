def high_alert(cleaned_cities, previous_intel):
    all_cities = cleaned_cities.union(previous_intel)
    unique_cities = cleaned_cities.symmetric_difference(previous_intel)
    high_alert_cities = cleaned_cities.intersection(previous_intel)
    return all_cities, unique_cities, high_alert_cities

cleaned_cities = {"Dnipro", "Kharkiv", "Kyiv", "Lviv", "Odessa"}
previous_intel = {"Kyiv", "Mariupol", "Lviv", "Donetsk"}
all_cities, unique_cities, high_alert_cities = high_alert(set(cleaned_cities), previous_intel)

print("All cities:", all_cities)
print("Unique cities:", unique_cities)
print("High alert cities:", high_alert_cities)