import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public Map<String, VirtualPet> getPets() {
		return pets;
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public int getPetCount() {

		return pets.size();
	}

	public void addPet(VirtualPet pet) {

		pets.put(pet.getName(), pet);

	}

	public VirtualPet getAPet(String name) {

		return pets.get(name);
	}

	public void adoptPet(VirtualPet pet) {

		pets.remove(pet.getName(), pet);
	}

	public void feedAllPets() {

		for (VirtualPet pet : pets.values()) {

			if (pet instanceof Organic) {

				((Organic) pet).feed();

			}

		}
	}

	public void waterAllPets() {

		for (VirtualPet pet : pets.values()) {

			if (pet instanceof Organic) {

				((Organic) pet).water();

			}

		}
	}

	public void playWithPet(String name) {

		VirtualPet pet = pets.get(name);
		pet.setHappiness(100);
	}

}
