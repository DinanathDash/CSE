import re
class Time:
    def __init__(self, time_str):
        self.time_str = time_str
        self.hours, self.minutes, self.seconds = self._parse_time()
    def _parse_time(self):
        pattern = r"^(2[0-3]|[01]?[0-9]):([0-5]?[0-9]):([0-5]?[0-9])$"
        match = re.match(pattern, self.time_str)
        if match:
            return int(match.group(1)), int(match.group(2)), int(match.group(3))
        else:
            raise ValueError("Invalid time format. Please use HH:MM:SS (24-hour format).")
    def to_12_hour_format(self):
        period = "AM" if self.hours < 12 else "PM"
        hours_12 = self.hours if 1 <= self.hours <= 12 else (self.hours - 12) or 12
        return f"{hours_12:02}:{self.minutes:02}:{self.seconds:02} {period}"
    def display(self):
        print(f"24-hour format: {self.time_str}")
        print(f"12-hour format: {self.to_12_hour_format()}")
try:
    time_input = input("Enter time in HH:MM:SS (24-hour format): ")
    time_obj = Time(time_input)
    time_obj.display()
except ValueError as e:
    print(e)
