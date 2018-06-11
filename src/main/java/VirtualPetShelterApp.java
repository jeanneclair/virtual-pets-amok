import java.util.Scanner;

public class VirtualPetShelterApp {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		VirtualPetShelter shelter = new VirtualPetShelter();

		shelter.addPet(new OrganicCat("Junebug", "tuxedo cat", 30, 30, 30, 30, 40));
		shelter.addPet(new OrganicCat("Rainbow", "striped cat", 40, 40, 40, 40, 40));
		shelter.addPet(new OrganicDog("Charlie", "white dog", 35, 35, 35, 35, 35));
		shelter.addPet(new OrganicDog("Clifford", "red dog", 44, 44, 44, 44, 44));
		shelter.addPet(new RoboticCat("Silver", "titanium cat", 50, 50, 50));
		shelter.addPet(new RoboticCat("Gold", "gold cat", 55, 55, 55));
		shelter.addPet(new RoboticDog("Rusty", "rusty dog", 20, 20, 80));
		shelter.addPet(new RoboticDog("Shiny", "new dog", 70, 70, 0));

		String menuChoice;

		Boolean gameRunning = false;

		while (gameRunning = true) {

			do {

				showStatus(shelter);
				showMenu();
				menuChoice = input.nextLine();

			} while (!menuChoice.equals("1") && !menuChoice.equals("2") & !menuChoice.equals("3")
					&& !menuChoice.equals("4") && !menuChoice.equals("5") && !menuChoice.equals("6")
					&& !menuChoice.equals("7") && !menuChoice.equals("8") && !menuChoice.equals("9"));

			switch (menuChoice) {
			case "1":

				for (VirtualPet virtualPet : shelter.getAllPets()) {

					if (virtualPet instanceof Organic) {

						((Organic) virtualPet).feed();

					}
					virtualPet.tick(virtualPet);

				}

				System.out.println("\nYum!\n");

				break;

			case "2":

				for (VirtualPet virtualPet : shelter.getAllPets()) {

					if (virtualPet instanceof Organic) {

						((Organic) virtualPet).water();

					}
					virtualPet.tick(virtualPet);

				}
				System.out.println("\nSlurp!\n");

				break;

			case "3":

				for (VirtualPet virtualPet : shelter.getAllPets()) {

					if (virtualPet instanceof OrganicCat) {

						((OrganicCat) virtualPet).cleanLitterBox();

					}
					virtualPet.tick(virtualPet);

				}
				System.out.println("\nClean!\n");

				break;

			case "4":

				for (VirtualPet virtualPet : shelter.getAllPets()) {

					if (virtualPet instanceof OrganicDog) {

						((OrganicDog) virtualPet).cleanCages();

					}
					virtualPet.tick(virtualPet);

				}
				System.out.println("Cleaned!\n");

				break;

			case "5":

				for (VirtualPet virtualPet : shelter.getAllPets()) {

					if (virtualPet instanceof WalkDog) {

						((WalkDog) virtualPet).walkDog(virtualPet);

					}
					virtualPet.tick(virtualPet);

				}
				System.out.println("Walked!\n");

				break;

			case "6":

				for (VirtualPet virtualPet : shelter.getAllPets()) {

					if (virtualPet instanceof Robotic) {

						((Robotic) virtualPet).oil();

					}
					virtualPet.tick(virtualPet);

				}
				System.out.println("Oiled!\n");

				break;

			case "7":

				System.out.println("Who do you want to play with?");
				String playName = input.nextLine();
				playName = playName.substring(0, 1).toUpperCase() + playName.substring(1).toLowerCase();
				shelter.playWithPet(playName);
				System.out.println("Thanks for playing with " + playName + "!\n");

				break;

			case "8":

				System.out.println("Who do you want to adopt?");
				for (VirtualPet pet : shelter.getAllPets()) {

					System.out.println(pet.getName() + "\t|" + pet.getDescription());
				}
				String adoptName = input.nextLine();
				adoptName = adoptName.substring(0, 1).toUpperCase() + adoptName.substring(1).toLowerCase();
				VirtualPet pet = shelter.getAPet(adoptName);
				shelter.adoptPet(pet);

				System.out.println("Thanks for adopting " + adoptName + "!\n");

				break;

			case "9":

				System.out.println("\nWho would you like to admit?\n");
				String admitName = input.nextLine();
				admitName = admitName.substring(0, 1).toUpperCase() + admitName.substring(1).toLowerCase();
				System.out.println("\nPlease describe your pet.\n");
				String admitDesc = input.nextLine();

				System.out.println("Is the pet an OrganicCat, OrganicDog, RoboticCat, or RoboticDog?");
				String petType = input.nextLine();
				petType = petType.toLowerCase();

				switch (petType) {

				case "organiccat":
					OrganicCat addOrganicCat = new OrganicCat(admitName, admitDesc, 50, 50, 50, 50, 50);
					shelter.addPet(addOrganicCat);
					System.out.println("\n You have added: " + admitName + " as an OrganicCat.");

					break;

				case "organicdogt":
					OrganicDog addOrganicDog = new OrganicDog(admitName, admitDesc, 50, 50, 50, 50, 50);
					shelter.addPet(addOrganicDog);
					System.out.println("\n You have added: " + admitName + " as an OrganicDog.");

					break;

				case "roboticcat":
					RoboticCat addRoboticCat = new RoboticCat(admitName, admitDesc, 50, 50, 50);
					shelter.addPet(addRoboticCat);
					System.out.println("\n You have added: " + admitName + " as a RoboticCat.");

					break;

				case "roboticdog":
					RoboticDog addRoboticDog = new RoboticDog(admitName, admitDesc, 50, 50, 50);
					shelter.addPet(addRoboticDog);
					System.out.println("\n You have added: " + admitName + " as a RoboticDog.");

					break;
				}// end petType switch statement
				break;
			} // end menuChoice switch statement
		} // end of while loop
	} // end main method

	private static void showStatus(VirtualPetShelter shelter) {
		System.out.println("This is the status of your pets:");
		System.out.println("--------------------------------");

		for (VirtualPet virtualPet : shelter.getAllPets()) {

			System.out.println(virtualPet.toString());

		}
	}

	private static void showMenu() {
		System.out.println("\nPress '1' to feed organic pets\n" + "Press '2' to water organic pets\n"
				+ "Press '3' to clean the organic cat litter box\n" + "Press '4' to clean all organic dog cages\n"
				+ "Press '5' to take both organic and robotic dogs on a walk\n" + "Press '6' to oil all robotic pets\n"
				+ "Press '7' to play with a single pet\n" + "Press '8' to adopt a pet\n"
				+ "Press '9' to admit a pet\n");
	}

}
