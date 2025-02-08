package jumpThrough;

import java.util.Scanner;

public class MaddnesswithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stare = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int input = stare.nextInt();
		System.out.println("Your number is :"+input);
		
		stare.close();
		

		
		// compareTwoInt example below
		
		int b = 20;
		int c = 64;
		System.out.println(Integer.compare(b, c));
		
		
		
		// sumTwoInts example below
		
		int a = 8;
		int l = 14;
		int sum = l - a;
		System.out.println(sum);
	}

}
