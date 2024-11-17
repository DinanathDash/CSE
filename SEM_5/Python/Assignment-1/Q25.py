days = int(input("Enter the number of days: "))
hours = int(input("Enter the number of hours: "))
minutes = int(input("Enter the number of minutes: "))
seconds = int(input("Enter the number of seconds: "))
total_seconds = days * 86400 + hours * 3600 + minutes * 60 + seconds

print("The total number of seconds is: ",total_seconds)