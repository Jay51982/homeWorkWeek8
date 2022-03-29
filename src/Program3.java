
import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Program3 obj1 = new Program3();   //object creation
        obj1.vowelConsonant();
    }

    public void vowelConsonant() {
        Scanner obj = new Scanner(System.in);  // object creation
        System.out.println("Enter Input here :");
        String ch1 = obj.next().toLowerCase(); // variable declaration
        boolean vowl = ch1.equals("a") || ch1.equals("e") || ch1.equals("i") || ch1.equals("o") || ch1.equals("u");
        // if.. else state. to execute logic
        if (ch1.length() > 1) {
            System.out.println("Error : Length is bigger than one character");
        } else if (!(ch1.charAt(0) >= 65 && ch1.charAt(0) <= 90 || ch1.charAt(0) >= 97 && ch1.charAt(0) <= 122)) {
            System.out.println("Error : Input entered is not letter");
        } else if (vowl) {
            System.out.println("Letter is Vowl.");
        } else {
            System.out.println("Letter is Consonant.");
        }
    }
}
