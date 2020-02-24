package chapter1;
import java.util.Scanner;

public class AgeAndName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.println(firstName + ", " + age + " years");
		
		input.close();

	}

}
