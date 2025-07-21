package Number_program;

public class Count_of_factors {

	public static void main(String[] args) {
		int number = 10;
		int count = 0;
		System.out.println("Factor of "+ number + " are : ");
		
		for (int i =1 ; i <= number ; i++) {
			if (number % i == 0) {
				System.out.println(i + " ");
				count++;
			}
		}
		
		System.out.println("The count of factors are "+ count);

	}

}
