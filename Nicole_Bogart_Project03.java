/*
 * Program takes numerical input from user and outputs the corresponding
 * letter grade. 
 * 
 * Nicole Bogart
 * 
 * Project 03
 * 
 * 02/15/2021
 */







// Import Scanner
import java.util.Scanner; 

public class Nicole_Bogart_Project03 {

	public static void main(String[] args) {
		
		char grade; 
		
		Scanner input = new Scanner(System.in); // Create Scanner object
		
		System.out.println("Enter your score: "); // Prompt user to enter score
		int score = input.nextInt(); 
		
		// If score is valid, this code will display corresponding grade.
	/*	
	 * if (score >= 0 && score <= 100) {
			if (score < 60) {
				grade = 'F';
			}
			else if (score >= 60 && score < 70) {
				grade = 'D';
			}
			else if (score >= 70 && score < 80) {
				grade = 'C';
			}
			else if (score >= 80 && score < 90) {
				grade = 'B';
			}
			else {
				grade = 'A';
			}
			
			System.out.println("Your grade is : " + grade );
		}
		
		// If score is not valid, error message will display.
		else {
			System.out.println("Error. Invalid score entered. Must be between 0 & 100");
			
		}
		*/
		
		
		// Takes input from user and out puts letter grade
		switch (score) {
		
		case 100 :
			
		case 99 :
			
		case 98 :
			
		case 97 :
			
		case 96 :
			
		case 95 :
			
		case 94 :
			
		case 93 :
			
		case 92 :
			
		case 91 :
			
		case 90 : 
			grade = 'A';
			System.out.println("Your grade is : " + grade);
			break;
			
		case 89 :
			
		case 88 :
			
		case 87 :
			
		case 86 :
			
		case 85 : 
			
		case 84 :
			
		case 83 :
			
		case 82 :
			
		case 81 :
			
		case 80 : 
			grade = 'B';
			System.out.println("Your grade is : " + grade);
			break;
			
		case 79 :
			
		case 78 :
			
		case 77 :
			
		case 76 :
			
		case 75 :
			
		case 74 :
			
		case 73 :
			
		case 72 :
			
		case 71 :
			
		case 70 :
			grade = 'C';
			System.out.println("Your grade is : " + grade);
			break;
			
		case 69 :
			
		case 68 :
			
		case 67 :
			
		case 65 :
			
		case 64 :
			
		case 63 : 
			
		case 62 :
			
		case 61 :
			
		case 60 :
			grade = 'D';
			System.out.println("Your grade is : " + grade);
			break;
			
		default :
			grade = 'F';
			System.out.println("Your grade is : " + grade);
			break;
		
			
		}

	}

}
