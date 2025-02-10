public class Q4 {
    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            int daysInYear = numberOfDaysInAYear(year);
            System.out.println(year + " has " + daysInYear + " days.");
        }
    }
    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
        }
        else {
            return 365;
        }
    }
}