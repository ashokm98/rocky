import java.util.Scanner;

public class Calculater {

	public static void main(String[] arguments) {
		int operator,n1,n2;
		System.out.println("1 - Addition \n 2 -Subraction \n 3 - Multiplication\n 4 - Division");
		System.out.print("Choose Operator : ");
		Scanner sc = new Scanner(System.in);
		operator = sc.nextInt();
		System.out.print("Enter ther First no: ");
		n1 = sc.nextInt();
		System.out.print("Enter ther Second no : ");
		n2 = sc.nextInt();
		
		double result = 0;
		switch(operator) {
		
		case 1 :
			result = n1 + n2;
			break;
		case 2 :
			result = n1 - n2;
			break;
		case 3 :
			result = n1 * n2;
			break;
		case 4 :
			result = n1 / n2;
			break;
			
			default:
				System.out.println("Enter the Operator is invalid");
		}
		
		System.out.println("The Result is :" + result);
	}

}
