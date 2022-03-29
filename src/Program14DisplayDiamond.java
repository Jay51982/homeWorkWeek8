import java.util.Scanner;

public class Program14DisplayDiamond {
    public void diamond(int r) {
        int i, j;
        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        Program14DisplayDiamond obj = new Program14DisplayDiamond();
        int r;
        System.out.print("Input number or row (half of diamond) : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        obj.diamond(r);


    }


}
