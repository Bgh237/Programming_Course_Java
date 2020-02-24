package chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int cand = Integer.parseInt(input.nextLine());

		String[] name = new String[cand];
		int[] votes = new int[cand];

		for (int i = 0; i < cand; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			name[i] = input.nextLine();

			System.out.print("Enter votes: ");
			votes[i] = Integer.parseInt(input.nextLine());
		}

		int[] winner = Arrays.copyOf(votes, votes.length);

		Arrays.sort(winner);

		int y = votes.length - 1;
		int count = 0;
		String output1 = "";
		String output2 = "";

		for (int i = 0; i < cand; i++) {

			if (votes[i] == (winner[y])) {

				output1 = "The winner is " + name[i] + " with " + votes[i] + " votes!";
				output2 += name[i] + " (" + votes[i] + " votes) \n";
				count++;
			}

		}

		if (count <= 1) {
			System.out.println(output1);
		} else {
			System.out.println("The election is a tie between the following candidates: \n" + output2);
		}
		
		input.close();
	}

}
