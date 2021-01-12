

/*You can check your solutions in Judge.
1.	Day of Week
Enter a day number [1…7] and print the day name (in English) or 
"Invalid day!". Use an array of strings.
Examples
Input	Output
1	Monday
2	Tuesday
7	Sunday
0	Invalid day!
Hints
•	Use an array of strings holding the day names: 
{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}.
•	Print the element at index (day-1) when it is in the range [1…7] or "Invalid Day!"
 otherwise.
 * */
import java.util.Scanner;
public class DayofWeek {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 String [] dayWeek = {"Invalid day!","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	int numberElementArray = Integer.parseInt(scanner.nextLine());
	if (numberElementArray>-1 && numberElementArray<=7) {
			System.out.print(dayWeek[numberElementArray]);
			} else {
				System.out.print("Invalid day!");
		}
	}
}
