
public class MainPr2 {

	public static void main(String[] args) {
		
		char grade='C';
		switch(grade) {
		
		case 'A':
			System.out.println("You are eligible for a Scholarship of 75%");
			break;
		case 'B':
			System.out.println("You are eligible for a Scholarship of 50%");
			break;
		case 'C':
			System.out.println("You are eligible for a Scholarship of 25%");
			break;
		default:
			System.out.println("You are not eligible for a Scholarship");
			
			
		}

	}

}
/*
 * if grade is 'A',  You are eligible for a Scholarship of 75%
 * if grade is 'B',  You are eligible for a Scholarship of 50%
 * if grade is 'C',  You are eligible for a Scholarship of 25% 
 * if grade is not 'A' or 'B' or'C',   You are not eligible for a Scholarship
 * 
*/
