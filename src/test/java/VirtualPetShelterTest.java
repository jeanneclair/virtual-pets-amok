import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetShelterTest {
	
	OrganicCat testOrganicPet = new OrganicCat("Rainbow", "striped cat", 50, 50, 50, 50, 50);
	
	
	@Test //passed
	public void shouldPassWhenAddPetToShelter() {
		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		testPetShelter.addPet(testOrganicPet);
		int numberOfPetsBeforeAdd = testPetShelter.getPetCount();
		testPetShelter.addPet(testOrganicPet);
		int numberOfPetsAfterAdd = testPetShelter.getPetCount();
		
		assertThat(numberOfPetsAfterAdd, equalTo(testPetShelter.getPetCount()));
		
	}
	
	@Test //passed
	public void shouldPassWhenAdoptPetFromShelter() {
		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		testPetShelter.addPet(testOrganicPet);
		int numberOfPetsBeforeAdd = testPetShelter.getPetCount();
		testPetShelter.addPet(testOrganicPet);
		testPetShelter.adoptPet(testOrganicPet);
		int numberOfPetsAfterAdd = testPetShelter.getPetCount();

		assertThat(numberOfPetsAfterAdd, equalTo(testPetShelter.getPetCount()));
		
	}
	@Test //passed
	public void shouldPassWhenFeedAllPetsDecreasesHunger() {
		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		testPetShelter.addPet(testOrganicPet);
		int hungernessBeforeFeeding = ((Organic) testPetShelter.getAPet("Rainbow")).getHunger();
		testPetShelter.feedAllPets();
		int hungernessAfterFeeding = ((Organic) testPetShelter.getAPet("Rainbow")).getHunger();
		
		assertThat(hungernessAfterFeeding, equalTo(hungernessBeforeFeeding - 10));
	}
	@Test //passed
	public void shouldPassWhenWaterAllPetsDecreasesThirst() {
		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		testPetShelter.addPet(testOrganicPet);
		int thirstBeforeFeeding = ((Organic) testPetShelter.getAPet("Rainbow")).getThirst();
		testPetShelter.waterAllPets();
		int thirstAfterFeeding = ((Organic) testPetShelter.getAPet("Rainbow")).getThirst();
		
		assertThat(thirstAfterFeeding, equalTo(thirstBeforeFeeding - 10));

	}
	@Test //passed
	public void shouldPassWhenPlayingWithSinglePetIncreasesHappiness() {
		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		testPetShelter.addPet(testOrganicPet);
		int happinessBeforePlaying = testPetShelter.getAPet("Rainbow").getHappiness();
		testPetShelter.playWithPet("Rainbow");
		int happinessAfterPlaying = testPetShelter.getAPet("Rainbow").getHappiness();
		
		assertThat(happinessAfterPlaying, equalTo(100));
	
	}	
	
	@Test //passed
	public void shouldPassWhenAdoptingDecreasesPetCount() {
		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		testPetShelter.addPet(testOrganicPet);
		int sizeBeforeAdopting = testPetShelter.getPetCount();
		testPetShelter.adoptPet(testOrganicPet);
		int sizeAfterAdopting = testPetShelter.getPetCount();
		
		assertThat(sizeAfterAdopting, equalTo(0));
	
	}	
	
	@Test //passed
	public void shouldPassWhenAdmittingIncreasesPetCount() {
		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		int sizeBeforeAdmitting = testPetShelter.getPetCount();
		testPetShelter.addPet(testOrganicPet);
		int sizeAfterAdmitting = testPetShelter.getPetCount();
		
		assertThat(sizeAfterAdmitting, equalTo(1));

	}

}
