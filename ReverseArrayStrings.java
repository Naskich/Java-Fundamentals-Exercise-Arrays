

/*Write a program to read an array of strings, reverse it and print its elements. 
 * The input consists of a sequence of space separated strings. 
 * Print the output on a single line (space separated).
Examples
Input	Output
a b c d e	e d c b a
-1 hi ho w	w ho hi -1
Hints
•	Read the array of strings.
•	Exchange the first element (at index 0) with the last element (at index n-1).
•	Exchange the second element (at index 1) with the element before the last (at index n-2).
•	Continue the same way until the middle of the array is reached.
 * */

import java.util.Scanner;
public class ReverseArrayStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String alphaBetChar =  scanner.nextLine();        //Declaration type 
		String [] charString = alphaBetChar.split(" ");  //Create Array with split " " 
	//-------------Declaration type dat---------------------  	
	    for (int i = 0; i < charString.length/2; i++) { //ForLoop for read - length/2 
	 //--------------loop device (/2) index Array ----------
	   int indexNumber = charString.length-1-i; //Index Array is type Int - first and last
    	String oldSimbol = charString[i];      //Declaration new temporary = Array from - index [i]
	  	charString[i] = charString[indexNumber];
	   	charString [indexNumber] = oldSimbol;	
		}	
	printArray(charString);  //------- Declaration printing from Method
	}
	//------------Create Method for printing -------------------
	public static void  printArray(String[] charString) {
		for (int i = 0; i < charString.length; i++) {
			System.out.printf("%s ",charString[i]);
		}
	}
}
