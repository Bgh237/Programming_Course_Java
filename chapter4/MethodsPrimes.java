package chapter4;

import java.util.Scanner;

public class MethodsPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many primes: ");
		int primes = Integer.parseInt(input.nextLine());
		
		int total = 0;
		
		for (int i = 2; total < primes; i++) {
			
			if (isPrime(i) == true) {
				System.out.print(i + " ");
				total++;
			}
		}

		input.close();
	}

	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			
			if (x % i == 0) {
				return false;
			}

		}
		
		return true;

	}
}