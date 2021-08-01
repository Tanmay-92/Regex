package RegexProblems;

import java.util.regex.Pattern;

import java.util.Scanner;


public class RegexUC2 {
	
	Scanner scanner = new Scanner(System.in);
	
    public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";
    
	public static void main(String[] args) {
		
		 RegexUC2 user = new RegexUC2();
	        user.readIt();	
		
	}
	
	private void readIt() {
		System.out.println("Enter Last name ");
        String lastName = scanner.next();
        validateInput(NAMEPATTERN,lastName);
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
