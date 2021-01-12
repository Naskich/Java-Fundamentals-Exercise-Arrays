
/*6.	Equal Arrays
Read two arrays and print on the console whether they are identical or not.
 Arrays are identical if their elements are equal. If the arrays are identical
  find the sum of the first one and print on the console following message: 
  "Arrays are identical. Sum: {sum}", otherwise find the first index where 
  the arrays differ and print on the console following message:
   "Arrays are not identical. Found difference at {index} index."
Examples
Input	Output
10 20 30
10 20 30	Arrays are identical. Sum: 60
1 2 3 4 5
1 2 4 3 5	Arrays are not identical. Found difference at 2 index.
1
10	Arrays are not identical. Found difference at 0 index.
 * */
import java.util.Scanner;
public class EqualArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String numbers1 = scanner.nextLine();
		String [] numbersArray1 = numbers1.split(" ");
		int[] simbolArray1 = new int[numbersArray1.length];
		
		String numbers2 = scanner.nextLine();
		String [] numbersArray2 = numbers2.split(" ");
		int[] simbolArray2 = new int[numbersArray2.length];
	
		int sumArray = 0;
		int sumElementArray = 0;
		int elementArray = 0;
		int indexArray = 0;
		
		for (int i = 0; i < numbersArray1.length; i++) {
			indexArray++;
			simbolArray1 [i] = Integer.parseInt(numbersArray1[i]);
			simbolArray2 [i] = Integer.parseInt(numbersArray2[i]);
			if (simbolArray1[i]!=simbolArray2[i]) {
				sumArray+=1;
				elementArray = indexArray-sumArray;
			}
			sumElementArray+=simbolArray1[i];	
		}	
		if (sumArray==0) {
			System.out.println("Arrays are identical. Sum: "+sumElementArray);
		}
		if (sumArray>0) {
			System.out.printf("Arrays are not identical. Found difference at "+elementArray+" index.");
		}		
	}
}
