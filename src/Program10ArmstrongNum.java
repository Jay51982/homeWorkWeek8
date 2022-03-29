
import java.util.Scanner;

public class Program10ArmstrongNum {
    public static void armstrongno() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scr.nextInt();
        int ori, remainder, result = 0;
        ori = num;
        while (ori != 0) {
            remainder = ori % 10;
            result += Math.pow(remainder, 3);
            ori /= 10;
        }
        if (result == num)
            System.out.println(num + "is an Armstrong number ");
        else
            System.out.println(num + " is not an Armstrong number ");
    }

    public static void main(String[] args) {
        armstrongno();
    }

}
