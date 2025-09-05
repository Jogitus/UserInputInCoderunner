import java.util.Scanner;

public class UserInputKoe {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

       int n1 = 0;
       int n2 = 0;
    
        System.out.println("First number?");
            n1 = Integer.parseInt(in.nextLine());
        System.out.println("Second number?");
            n2 = Integer.parseInt(in.nextLine());
        int vastaus = n1 + n2;
        System.out.println("The sum is " + vastaus + ".");
    }
}


// Ask the user to type two numbers. Then print the sum.
// The output in the console should be precisely, if the user types "2" and "3":
// First number?
// 2
// Second number?
// 3
// The sum is 5.
