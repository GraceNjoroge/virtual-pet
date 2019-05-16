package balsamVirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet myVirtualPet = new VirtualPet("name", "type", 25);

		System.out.println("Welcome");
		System.out.println("Are you ready to take care of your own virtual pet? (Enter Yes or No)");
		String ready = input.nextLine();

		if (ready.equals("Yes")) {
			System.out.println("This is the koala");
			System.out.println("Balsam looks like this when he is happy. You have to keep him happy");
			System.out.println(" _____");
			System.out.println("{~._.~}");
			System.out.println("()~*~()");
			System.out.println("(-)-(-)");

		}
		while (ready.equals("Yes")) {
			// VirtualPet.tick();
			boolean virtualPet = true;
			System.out.println("What would you like to do with balsam?");

			System.out.println("Enter 1 to feed balsam");
			System.out.println("Enter 2 to play with balsam");
			System.out.println("Enter 3 to put balsam to sleep");
			System.out.println("Enter 4 to quit");
			String menuOption = input.next();
			// while (!menuOption.equals("4")) {

			if (menuOption.equals("1")) {
				System.out.println("Balsam loves to eat leaves. Enter amount to feed him");
				int numbertoFeed = input.nextInt();
				myVirtualPet.feed(numbertoFeed);
				input.nextLine();

			} else if (menuOption.equals("2")) {
				System.out.println("Balsam loves playing");
				int numbertoPlay = input.nextInt();
				myVirtualPet.play(numbertoPlay);
				input.nextLine();

			} else if (menuOption.equals("3")) {
				System.out.println("Goodnight");
				input.nextLine();

			} else {
				System.out.println("Goodbye....thanks for playing!");

			}

			System.out.println("Enter 1 to feed balsam");
			System.out.println("Enter 2 to play with balsam");
			System.out.println("Enter 3 to put balsam to sleep");
			System.out.println("Enter 4 to quit");
			menuOption = input.next();
		}

		input.close();

	}
}
