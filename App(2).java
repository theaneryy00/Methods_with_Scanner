
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

        int sum = totalNumberofStudents();
        System.out.println( "The total number of students in two sections are " + sum );

        int difference = numberofStudentsPassed();
        System.out.println( " The students who passed the exam are " + difference);

        // close scanner
        scan.close();
    }


    static int totalCostofItem() {
        System.out.println("This method will show the total of item you bought from the grocery");
        System.out.print("Enter the number of item: ");
        int x = scan.nextInt();

        System.out.print("Enter the cost of item: ");
        int y = scan.nextInt();

        return x * y;
    }


    static int sliceofPizza() {
        System.out.println("This method will know how many slices of pizza would be given to 4 people");
        System.out.print("Enter the number of pizza slices: ");
        int x = scan.nextInt();

        System.out.print("Enter the the number people: ");
        int y = scan.nextInt();

        return x / y;
    }
    static int totalNumberofStudents(){
        System.out.println( "This method will know how many students are there in two sections");
        System.out.print( " Enter the number of students in the first section: ");
        int x =scan.nextInt();

        System.out.print( "Enter the number of students in the second section: ");
        int y = scan.nextInt();

        return x + y;

        
    }

    static int numberofStudentsPassed(){
        System.out.println( "This method will know how many students passed the exam");
        System.out.print( "Enter the total in number of students: ");
        int x = scan.nextInt();

        System.out.print( "Enter the number of students who failed: ");
        int y = scan.nextInt();

        return x - y;
    }
}
