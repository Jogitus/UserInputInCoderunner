import java.util.Scanner;

public class UserInputKoe {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        String nimi = "";
            System.out.println("What is your name?");
                nimi = in.nextLine();
        if (nimi.equals ("")){
            System.out.println("Error");
        }
        else{
            System.out.println("Your name is " + nimi + ".");
            }
    }
}



// At first print:
// What is your name?
// After user has typed the name, assign the input to a variable and print: Your name is ..... 
// If the user just presses enter and won't write anything, print "Error".
// The output in the console should be precisely, if the user types "Justin":
// What is your name?
// Justin
// Your name is Justin.
// The output should be precisely, if the user won't type anything and just presses enter:
// What is your name?
// Error
