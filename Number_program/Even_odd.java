package Number_program;

public class Even_odd {

	public static void main(String[] args) {
		int num = 123456;
		
		if(num%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
		//Another approach
		if(num%2 != 0) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}

	}

}
