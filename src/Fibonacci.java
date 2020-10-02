
public class Fibonacci {
	public static void main(String[]args) {
		int number1 = 0;
		int number2 = 1;
		int sum = 0;
		while (sum <=10000) {
			sum = number1 + number2;
			if (sum >= 10000) {
				break;
			}
			System.out.println(sum);
			number1= number2;
			number2= sum;
		}
	}
}

