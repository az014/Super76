import java.util.Scanner;

public class stringswap {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        System.out.println("Type a string:");
        String a = myObj.nextLine();  // Read user input

        System.out.println("Type another string:");
        String b = myObj.nextLine();  // Read user input

        System.out.println("Are the strings equal? " + a.equals(b)); // Compare strings

        myObj.close(); // Close scanner
    }
}
