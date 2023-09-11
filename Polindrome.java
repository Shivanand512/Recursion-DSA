import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    static boolean isPalindrome(int n) {
        int original = n;
        int reversed = reverse(n);
        return original == reversed;
    }

    static int reverse(int n) {
        return reverseHelper(n, 0);
    }

    static int reverseHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        return reverseHelper(n / 10, reversed);
    }
}
