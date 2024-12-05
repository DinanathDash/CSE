tlds = {'Canada': 'ca', 'United States': 'us', 'Mexico': 'mx'}
print("Does the dictionary contain the key 'Canada'? :", 'Canada' in tlds)
print("Does the dictionary contain the key 'France'? :", 'France' in tlds)
print("\nCountry and TLD in two-column format:")
print("{:<15} {:<5}".format("Country", "TLD"))
print("-" * 20)
for country, tld in tlds.items():
    print("{:<15} {:<5}".format(country, tld))
tlds['Sweden'] = 'sw'
print("\nAfter adding Sweden with incorrect TLD:", tlds)
tlds['Sweden'] = 'se'
print("\nAfter updating Sweden to the correct TLD:", tlds)
reversed_tlds = {tld: country for country, tld in tlds.items()}
print("\nReversed dictionary (TLD to Country):", reversed_tlds)