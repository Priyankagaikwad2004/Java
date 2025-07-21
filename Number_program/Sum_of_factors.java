package Number_program;

public class Sum_of_factors {

	public static void main(String[] args) {
		int number = 10;
		int sum = 0;
		System.out.println("Factor of "+ number + " are : ");
		
		for (int i =1 ; i <= number ; i++) {
			if (number % i == 0) {
				System.out.println(i + " ");
				sum+=i;
			}
		}
		
		System.out.println("The sum of factors are "+ sum);

	}

}
