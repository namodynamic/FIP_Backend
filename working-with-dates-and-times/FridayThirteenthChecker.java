import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class FridayThirteenthChecker {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        LocalDate date = getValidDateInput(scanner);
        
        boolean isFridayThirteenth = checkIfFridayThirteenth(date);
        
        displayResult(date, isFridayThirteenth);
        
        scanner.close();
    }
    
   
    private static LocalDate getValidDateInput(Scanner scanner) {
        LocalDate date = null;
        
        while (date == null) {
            System.out.print("Enter a date (YYYY-MM-DD): ");
            String input = scanner.nextLine().trim();
            
            try {
                date = LocalDate.parse(input, DATE_FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter a date in YYYY-MM-DD format.");
            }
        }
        
        return date;
    }
    
    
    private static boolean checkIfFridayThirteenth(LocalDate date) {
        boolean isThirteenth = date.getDayOfMonth() == 13;
        
        boolean isFriday = date.getDayOfWeek() == DayOfWeek.FRIDAY;
        
        return isThirteenth && isFriday;
    }
    
   
    private static void displayResult(LocalDate date, boolean isFridayThirteenth) {
        String formattedDate = date.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy"));
        
        System.out.println("\nDate: " + formattedDate);
        
        if (isFridayThirteenth) {
            System.out.println("This date IS Friday the 13th!");
        } else {
            System.out.println("This date is NOT Friday the 13th.");
            
            if (date.getDayOfMonth() == 13) {
                System.out.println("It's the 13th, but not a Friday.");
            }
            else if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println("It's a Friday, but not the 13th.");
            }
        }
    }
}

