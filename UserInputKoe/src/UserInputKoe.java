import java.util.Scanner;

public class UserInputKoe {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        String nimi = "";
            System.out.println("What is your name?");
                nimi = in.nextLine();
        int ika = 0;
            System.out.println("What is your age?");
                ika = Integer.parseInt(in.nextLine());
            System.out.println("Your name is " + nimi + " and you are " + ika + "years old.");
        
    }
}



// First ask the name of the user and then the age of the user. Then print:
// Your name is Justin and you are 45 years old.
// The output in the console should be precisely, if the user types "Justin" and "45":
// What is your name?
// Justin
// How old are you?
// 45
// Your name is Justin and you are 45 years old.
// Notice! When CodeRunner checks the code, it doesn't print the user input. It should be like above,
    // but in Test Cases output looks like (if the input was Justin and 45):
// What is your name?
// How old are you?
// Your name is Justin and you are 45 years old.
