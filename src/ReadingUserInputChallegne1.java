import java.util.Scanner;
/* Read 10 numbers from the console entered by the user and print the sum of those numbers.*/

public class ReadingUserInputChallegne1 {

    public static void main(String[] args) {
        ReadingUserInputChallenge();
    }

    public static void ReadingUserInputChallenge() {

        // variable declaration and intialization
        int i = 0;
        int array[] = new int[10];
        int sum1 = 0;
//while loop to get input form console and sum the entered numbers
        while (i < 10) {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter number " + (i + 1) + ":");
            // if else state. to check enter input is number or not
            if (obj.hasNextInt()) {
                array[i] = obj.nextInt();
                sum1 = sum1 + array[i];
                i++;
            } else {
                System.out.println("Enter Integer value.");
            }
        }
        System.out.println("Total sum is : " + sum1);
    }
}




