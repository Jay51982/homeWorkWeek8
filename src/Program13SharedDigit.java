
import java.util.Scanner;

public class Program13SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        //if one number is out of range
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int a1, a2, b1, b2;
        a1 = a % 10;// extaracting once digit
        a2 = a / 10;// extaracting hundredth digit
        b1 = b % 10;//extaracting once digit
        b2 = b / 10;//extaracting hundredth digit

        //if one common digit
        if (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter 1st  value :  ");
        int a = scr.nextInt();
        System.out.print("Enter 2st  value :  ");
        int b = scr.nextInt();

        //driver code
        System.out.println("Shared digit sum :  " + hasSharedDigit(a, b));

    }

}
