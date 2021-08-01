package RegexProblems;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexUC1 {
	Scanner scanner = new Scanner(System.in);
	
	
    public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";
    
    
	public static void main(String[] args) {
	
		  RegexUC1 user = new RegexUC1();
	        user.readInput();	
		
	     
	}


	private void readInput() {
		System.out.println("Enter first name ");
        String firstName = scanner.next();
        validateInput(NAMEPATTERN,firstName);
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
