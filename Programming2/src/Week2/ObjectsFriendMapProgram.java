package Week2;

import java.util.Scanner;
import java.util.Map;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;

public class ObjectsFriendMapProgram {
	public static Map<String, Friend> friendMap = new HashMap<String, Friend>();
	
	public static void main(String[] args) {

		int choice = getChoice();
		while (choice != 0) {
			if (choice == 1) {
				addFriend();
			} else if (choice == 2) {
				findFriend();
			} else if (choice == 3) {
				deleteFriend();
			} else if (choice == 4) {
				printFriends();
			} else {
				System.out.println("Please enter a number between 0 and 4");
			}
			choice = getChoice();
		}
		System.out.println("Bye!");
	}

	public static void addFriend() {
		Scanner input = new Scanner(System.in);
		Map<String, Friend> friendMap = new HashMap<String, Friend>();

		System.out.print("Enter nickname: ");
		String a = input.nextLine();

		if (friendMap.get(a) == null) {

			System.out.print("Enter name: ");
			String b = input.nextLine();

			System.out.print("Enter birthdate (dd.mm.yyyy): ");
			String c = input.nextLine();
			
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate localDate = LocalDate.parse(c, formatter);

				friendMap.put(a, new Friend(a, b, c));
			} catch (DateTimeParseException dtpe) {
				System.out.println("Invalid date:" + c);
			}
			

		} else {
			System.out.println(a + " is already in use!");
		}
		
		System.out.println();
		//input.close();
	}

	public static void findFriend() {
		Scanner input = new Scanner(System.in);
		
		//Map<String, Friend> friendMap = new HashMap<String, Friend>();
		
		System.out.print("Enter nickname: ");
		String a = input.nextLine();

		if (friendMap.get(a) != n) {
			System.out.println(friendMap.get(a));
		} else {
			System.out.println("Friend not found!");
		}

		//input.close();

	}

	public static void deleteFriend() {
		Scanner input = new Scanner(System.in);
		//Map<String, Friend> friendMap = new HashMap<String, Friend>();

		System.out.print("Enter nickname: ");
		String a = input.nextLine();

		if (friendMap.get(a) != null) {
			friendMap.remove(a);
		}

		//input.close();

	}

	public static void printFriends() {
		//Map<String, Friend> friendMap = new HashMap<String, Friend>();

		for (Friend friend : friendMap.values()) {
			System.out.println(friend);
		}

	}

	public static int getChoice() {
		Scanner input = new Scanner(System.in);
		int a = 1;
		while (a != 0) {
			try {
				
				System.out.println("1 = Add friend | 2 = Find friend | 3 = Delete friend | 4 = Print friends | 0 = Quit");

				System.out.print("Enter choice: ");
				a = Integer.parseInt(input.nextLine());

				return a;
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter a number between 0 and 4");
				System.out.println();

			}
			
		}
		
		return a;
	}
	
	

}
