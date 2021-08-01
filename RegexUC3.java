package RegexProblems;

import java.util.Scanner;
import java.util.regex.Pattern;


public class RegexUC3 {
	
	Scanner scanner = new Scanner(System.in);
    public static final String EMAILPATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";

	public static void main(String[] args) {

        RegexUC3 user = new RegexUC3();
        user.readIt();

	}

	private void readIt() {
		System.out.println("Enter EmailID ");
        String EmailID = scanner.next();
        validateInput(EMAILPATTERN,EmailID);
		
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
