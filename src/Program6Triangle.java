
import java.util.Scanner;

// Write a program in Java to display the pattern like a triangle with a number.
public class Program6Triangle<pubilc> {
    public static void traiangleNumber() {
        int i, j, r;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        r = obj.nextInt();
        for (i = 1; i <= r; i++) // outer loop for number of row
        {
            for (j = 1; j <= i; j++)//inner loop for number of colum
            {
                System.out.print(j);
            }
            System.out.println("");// ending line after each row
        }

    }

    public static void main(String[] args) {
        traiangleNumber();
    }
}
