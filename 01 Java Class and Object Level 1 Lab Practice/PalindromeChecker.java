import java.util.*;

public class PalindromeChecker {
    String text;
	PalindromeChecker(String usertext){
		text = usertext;
	}
    
    void checkPalindrome() {
        int textLength = text.length();
        String reverse = "";
        for (int i = textLength - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        if (text.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
		
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String text = input.nextLine();
        PalindromeChecker pc = new PalindromeChecker(text);
        pc.checkPalindrome();
    }
}
