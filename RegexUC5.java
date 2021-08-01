package RegexProblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexUC5 {
	Scanner scanner = new Scanner(System.in);
    public static final String PASSWORDPATTERN = "[0-9a-zA-Z!@#$%^&*]{8,}";

	public static void main(String[] args) {

        RegexUC5 user = new RegexUC5();
        user.readIt();
	}

	private void readIt() {

        System.out.println("Enter A PassWord ");
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
