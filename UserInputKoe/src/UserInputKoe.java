import java.util.Scanner;

public class UserInputKoe {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        String nimi = "";
            System.out.println("What is your name?");
                nimi = in.nextLine();
            System.out.println("Your name is " + nimi + ".");

    }
}



// Ask the name of the user and print it. More precisely:
// At first print:
// What is your name?
// After the user has typed the name, assign the input to a variable and print: Your name is ..... 
// The output in console should be precisely, if the user types "Justin":
// What is your name?
// Justin
// Your name is Justin.
