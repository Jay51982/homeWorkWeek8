import java.util.Scanner;

public class Program9Fibonacci {
    public static void fibonacciNumber() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the series number : ");
        int n = scr.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci series " + n + " terms : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int Z = firstTerm + secondTerm;
            firstTerm = secondTerm;//assign the value secondterm to firstterm
            secondTerm = Z;//assign the value Z to secondterm
        }
    }

    public static void main(String[] args) {
        fibonacciNumber();
    }
}


