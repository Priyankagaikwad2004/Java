package Number_program;

public class Reverse_the_number {

	public static void main(String[] args) {
		int num = 12345;
		int reverse = 0;
		int remainder; 
		
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num /= 10;
		}
		
		System.out.println(reverse);

	}

}
