package Number_program;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121;
		int reverse = 0;
		int remainder; 
		int x = num;
		
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num /= 10;
		}
		
		if (reverse == x) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}

	}

}
