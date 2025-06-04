import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;


public class MonthLengthCalculator {

    public static void main(String[] args) {
        int year = getYearInput();
        
        displayYearInfo(year);
        
        displayMonthLengths(year);
    }
    
    
    private static int getYearInput() {
        Scanner scanner = new Scanner(System.in);
        int year;
        
        while (true) {
            System.out.print("Enter a year: ");
            try {
                year = Integer.parseInt(scanner.nextLine().trim());
                if (year >= 1 && year <= 9999) {
                    break;
                } else {
                    System.out.println("Please enter a year between 1 and 9999.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year (numeric value).");
            }
        }
        
        return year;
    }
    
   
    private static void displayYearInfo(int year) {
        System.out.println("\nYear: " + year);
        System.out.println("Is leap year: " + Year.isLeap(year));
        System.out.println("\nMonth Lengths:");
        System.out.println("------------------");
    }
    
    
    private static void displayMonthLengths(int year) {
        for (Month month : Month.values()) {
            YearMonth yearMonth = YearMonth.of(year, month);
            
            int daysInMonth = yearMonth.lengthOfMonth();
            
            String formattedMonth = String.format("%-12s", month.toString());
            System.out.println(formattedMonth + ": " + daysInMonth + " days");
        }
    }
}

