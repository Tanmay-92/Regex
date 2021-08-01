package RegexProblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexUC7 {

	Scanner scanner = new Scanner(System.in);
    public static final String PASSWORDPATTERN = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@$!%*#?&]{6,}$";

	public static void main(String[] args) {
	
		   RegexUC7 user = new RegexUC7();
	        user.readIt();
	}

	private void readIt() {

        System.out.println("Enter the PassWord ");
        String PassWord = scanner.next();
        validateInput(PASSWORDPATTERN,PassWord);	
	}

	private void validateInput(String pattern, String input) {
		  if(Pattern.matches(pattern, input))
	        {
	            System.out.println("Valid");
	        }
	        else
	        {
	            System.out.println("Invalid");
	        }
		
	}

}
