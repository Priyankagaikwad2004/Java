package Number_program;

public class Power_of_a_number {

	public static void main(String[] args) {
		int num = 2;
		int raise = 4;
		
		int ans = 1;
		
		for (int i=0; i < raise ; i++) {
			ans *= num;
		}
		System.out.println(ans);

	}

}
