
// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        int product = totalCostofItem();
        System.out.println("The total cost is : " + product);

        // Method call
        int quotient = sliceofPizza();
        System.out.println("The slices per person is: " + quotient);

        // close scanner
        scan.close();
    }

    // This method will request for two numbers and will add them.
    static int totalCostofItem() {
        System.out.println("This method will show the total of item you bought from the grocery");
        System.out.print("Enter the number of item: ");
        int x = scan.nextInt();

        System.out.print("Enter the cost of item: ");
        int y = scan.nextInt();

        return x * y;
    }

    // This method will request for two numbers and will subtract them.
    static int sliceofPizza() {
        System.out.println("This method will know how many slices of pizza would be given to 4 people");
        System.out.print("Enter the number of pizza slices: ");
        int x = scan.nextInt();

        System.out.print("Enter the the number people: ");
        int y = scan.nextInt();

        return x / y;
    }
}
