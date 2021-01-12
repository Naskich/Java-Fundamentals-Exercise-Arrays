
/*5.	Even and Odd Subtraction
Write a program that calculates the difference between the
 sum of the even and the sum of the odd numbers in an array.
Examples
Input	Output	Comments
1 2 3 4 5 6	3	2 + 4 + 6 = 12
1 + 3 + 5 = 9
12 – 9 = 3
3 5 7 9	-24	
2 4 6 8 10	30	
 * */
import java.util.Scanner;
public class EvenOddSubtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String alphaBetChar =  scanner.nextLine();        
		String [] charString = alphaBetChar.split(" ");  
		int[] intArr = new int[charString.length];
		int sumArr1 = 0;
		int sumArr2 = 0;
		int sumLast = 0;
		for (int i = 0; i < intArr.length; i++) {
			String number = charString[i];
	        intArr[i] = Integer.parseInt(number);
	      if (intArr[i]%2==0) {
			sumArr1+=intArr[i];
	      	} else if (intArr[i]%2!=0) {
				sumArr2+=intArr[i];
			}
		}
		 sumLast=sumArr1-sumArr2;
	     System.out.println(sumLast);
	}
}