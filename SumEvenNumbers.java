
/*3.	Sum Even Numbers
Read an array from the console and sum only the even numbers.
Examples
Input	        Output
1 2 3 4 5 6	      12
3 5 7 9	          0
2 4 6 8 10	      30
 * */
import java.util.Scanner;
     public class SumEvenNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numberAlphabet = scanner.nextLine();
		String []  numStrings = numberAlphabet.split(" ");
		int [] number = new int [numStrings.length];
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			number [i] = Integer.parseInt(numStrings[i]);
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i]%2==0) {
				sum +=number[i]; 
			}
		}
		System.out.println(sum);
	}
}
