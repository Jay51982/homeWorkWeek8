import java.util.Scanner;

/* Write program to check enter no. in console is Palindrome or not */

public class Program5PalindromeNumber {
    public static boolean isPalindrome(int number) {
        // varibale declare
        int reverse = 0;
        int palindrome = number;
// while loop
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Please enter the number :");
        int palindrome = new Scanner(System.in).nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + "is a palindrome");
        } else {
            System.out.println("Number :" + palindrome + "is not a palindrome");
        }
    }
}