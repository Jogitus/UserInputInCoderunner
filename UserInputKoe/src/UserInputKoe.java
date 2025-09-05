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
        System.out.println(n1 + " + " + n2 + " = " + vastaus);
    }
}


// Ask the user to type two numbers. Sum the numbers and print the formula.
// If the user types "2" and "3", the output should be precisely (Notice the spaces also):

// First number?
// 2
// Second number?
// 3
// 2 + 3 = 5