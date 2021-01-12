

/*2.	Print Numbers in Reverse Order
Read n numbers and print them in reverse order.
Examples
Input	Output
3
10
20
30	30 20 10
3
30
20
10	10 20 30
1
10	10
 * */
import java.util.Scanner;
public class PrintNumbersReverseOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberArray = Integer.parseInt(scanner.nextLine());
		int [] rowArray = new int [numberArray];
		for (int i = 0; i < numberArray; i++) {
			rowArray [i]  = scanner.nextInt();
		}
		for (int i = rowArray.length-1; i >= 0; i--) {
			System.out.printf(" %d",rowArray[i]);
		}
	}
}
