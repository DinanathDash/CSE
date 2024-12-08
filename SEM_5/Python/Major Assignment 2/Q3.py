def detailed_city_intel(high_alert_cities, city_data):
    city_info = {city: data for city, *data in city_data if city in high_alert_cities}
    total_population = sum(data[0] for data in city_info.values())
    total_aid_requests = sum(data[1] for data in city_info.values())
    return city_info, total_population, total_aid_requests

high_alert_cities = {"Kyiv", "Lviv"}
city_data = [("Kyiv", 2800000, 250), ("Kharkiv", 1431000, 180), ("Lviv", 721301, 90), ("Odessa", 1029049, 120)]
city_info, total_population, total_aid_requests = detailed_city_intel(high_alert_cities, city_data)

print("High alert cities info:", city_info)
print("Total population:", total_population)
print("Total aid requests:", total_aid_requests)