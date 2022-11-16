package AssignmentProblem;

import java.util.Scanner;

public class LeapYear {	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Ente the Year : ");
		int year = s.nextInt();
		if(year%400 == 0 && year > 1582 && year%4 == 0 ) {
			System.out.println("This is a Leap year");
		}
		else {
			System.out.println("It is not a Leap Year");
			}
		}
}
