package chapter2;

import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter dividend: ");
		int x = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter divisor: ");
		int y = Integer.parseInt(input.nextLine());
		
		int z = x / y;
		
		int a = x % y;
		
		System.out.println(x + " / " + y + " = " + z + ", the remainder is " + a);
		
		input.close();
	}

}
