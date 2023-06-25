/*
	* Language - Java
	* Level - Beginner

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

    Problem - Enter a string and then reverse it!
    Description: These code snippets prompt the user to enter a string and then reverse it.
                They introduce loops and string manipulation, which are important concepts for 
                beginner level hackathons.

	** Do not use any online help or AI tool like Chat GPT or Google Bard
*/

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}