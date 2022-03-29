public class Program8RightAngleTriangle {
    public static void rightTriangle() {
        int i, j, row = 5;

        for (i = 0; i < row; i++) //outer loop for number of rows
        {
            for (j = 0; j <= i; j++) //  inner loop for columns
            {
                System.out.print("@"); // print @
            }
            System.out.println(); // ending line after each row
        }
    }

    public static void main(String args[]) {
        rightTriangle();
    }
}
