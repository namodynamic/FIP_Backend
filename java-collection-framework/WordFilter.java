import java.util.*;

public class WordFilter {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list of words or sentence to filter:");
        String input = scanner.nextLine();

        List<String> words = new ArrayList<>(Arrays.asList(input.split("\\s+")));

        System.out.println("\nOriginal Words:");
        System.out.println(words);

        words = new ArrayList<>(new HashSet<>(words));


        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 4 || word.matches("\\d+")) {
                iterator.remove();
            }
        }

        ListIterator<String> listIterator = words.listIterator();
        while (listIterator.hasNext()) {
            String word = listIterator.next();
            if (!word.isEmpty()) {
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                listIterator.set(capitalized);
            }
        }

        System.out.println("\nFiltered & Capitalized Words:");
        System.out.println(words);

        scanner.close();
    }
}