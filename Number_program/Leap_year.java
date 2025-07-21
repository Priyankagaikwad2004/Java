package Number_program;
import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
//		int year = 2024;
		
//		if(year % 100 != 0){
//			
//			if(year % 4 == 0 || year % 400 == 0) {
//				System.out.println("Leap year");
//			}
//			else {
//				System.out.println(year + "not a leap year");
//			}
//		}
//		else {
//			System.out.println(year + "not a leap year");
//		}
		
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter a year :");

			int year = scanner.nextInt();

			boolean isLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

			if (isLeap) {

			System.out.println(year + " is a leap year");
			
			}

			else {

			System.out.println(year + " not a leap year");
			}
			
			scanner.close();

	}

}
