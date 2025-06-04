import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;


public class MondayFinder {

    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        
        int monthNumber = getMonthInput();
        
        Month month = Month.of(monthNumber);
        
        displayHeader(month, currentYear);
        
        findAndDisplayMondays(month, currentYear);
    }
    
    
    private static int getMonthInput() {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;
        
        while (true) {
            System.out.print("Enter a month (1-12): ");
            try {
                monthNumber = Integer.parseInt(scanner.nextLine().trim());
                
                if (monthNumber >= 1 && monthNumber <= 12) {
                    break;
                } else {
                    System.out.println("Invalid month. Please enter a number between 1 and 12.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid month number (1-12).");
            }
        }
        
        return monthNumber;
    }
    
   
    private static void displayHeader(Month month, int year) {
        String monthName = month.getDisplayName(TextStyle.FULL, Locale.getDefault());
        
        System.out.println("\nMondays in " + monthName + " " + year + ":");
        System.out.println("----------------------------------------");
    }
    
    
    private static void findAndDisplayMondays(Month month, int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        
        LocalDate date = LocalDate.of(year, month, 1);
        
        LocalDate lastDay = date.withDayOfMonth(date.lengthOfMonth());
        
        int mondayCount = 0;
        
        while (!date.isAfter(lastDay)) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondayCount++;
                System.out.println(mondayCount + ". " + date.format(formatter));
            }
            
            date = date.plusDays(1);
        }
        
        if (mondayCount == 0) {
            System.out.println("No Mondays found in this month (this should never happen).");
        } else {
            System.out.println("\nTotal Mondays in " + month.getDisplayName(TextStyle.FULL, Locale.getDefault()) + 
                               " " + year + ": " + mondayCount);
        }
    }
}

