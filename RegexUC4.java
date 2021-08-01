package RegexProblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexUC4 {
	Scanner scanner = new Scanner(System.in);
    public static final String NUMBERPATTERN = "^[+0-9]{2}{10}$";

	public static void main(String[] args) {
		
		 RegexUC4 user = new RegexUC4();
	        user.readIt();
	}

	private void readIt() {
		 System.out.println("Enter Ur Mobile-No.:- ");
	        String MobileNumber = scanner.next();
	        validateInput(NUMBERPATTERN,MobileNumber);
		
	}

	private void validateInput(String pattern, String input) {
		  if(Pattern.matches(pattern, input)) {
	        
	            System.out.println("Valid");
	        }
	        else
	        {
	            System.out.println("Invalid");
	        }
		
	}

}
