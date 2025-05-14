import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class GenericsCount {

    public static <T> int countByProperty(Collection<T> collection, Predicate<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.test(element)) {
                count++;
            }
        }
        return count;
    }

   public static void main(String[] args) {
        List<Integer> numbers = List.of( 3, 4, 5, 6, 7, 11, 13);
        List<String> words = List.of("madam", "apple", "racecar", "hello");

        int oddCount = GenericsCount.countByProperty(numbers, n -> n % 2 != 0);
        System.out.println("Odd count: " + oddCount);

        int primeCount = GenericsCount.countByProperty(numbers, GenericsCount::isPrime);
        System.out.println("Prime count: " + primeCount);

        int palindromeCount = GenericsCount.countByProperty(words, GenericsCount::isPalindrome);
        System.out.println("Palindrome count: " + palindromeCount);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right)
            if (str.charAt(left++) != str.charAt(right--)) return false;
        return true;
    }
}