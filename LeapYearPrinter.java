public class Leapyear {
    import java.util.Scanner;

public class LeapYearPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input range
        System.out.println("Enter the starting year:");
        int startYear = scanner.nextInt();
        System.out.println("Enter the ending year:");
        int endYear = scanner.nextInt();
        
        // Validate range
        if (startYear >= endYear) {
            System.out.println("Invalid range! Ending year should be greater than starting year.");
            return;
        }
        
        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
        // Print leap years
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }
    
    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

}
