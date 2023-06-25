/*
	* Language - Java
	* Level - Intermediate

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

    Problem - enter a sentence and then generate an acronym from the first letter of each word
    Description: These code snippets prompt the user to enter a sentence and then generate 
                an acronym from the first letter of each word. They introduce string manipulation, 
                arrays, and loops, which are important concepts for intermediate level hackathons.

	** Do not use any AI tool like Chat GPT or Google Bard
*/

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String acronym = "";
        for (String word : words) {
            acronym += word.charAt(0);
        }
        System.out.println("Acronym: " + acronym.toUpperCase());
    }
}