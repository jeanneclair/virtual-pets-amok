import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog organicDog = new OrganicDog("Fido", "organic dog", 50, 50, 50, 50, 50);

	@Test
	public void shouldPassWhenCleaningCageIncreasesCageCleanliness() {

		int cageCleanlinessBeforeCleaning = organicDog.getCageDirtiness();
		organicDog.cleanCages();
		int cageCleanlinessAfterCleaning = organicDog.getCageDirtiness();

		assertThat(cageCleanlinessAfterCleaning, equalTo(cageCleanlinessBeforeCleaning - 50));

	}
	
	@Test
	public void shouldPassWhenWalkingOrganicDogIncreasesCageCleanliness() {

		int cageCleanlinessBeforeCleaning = organicDog.getCageDirtiness();
		organicDog.walkDog(organicDog);
		int cageCleanlinessAfterCleaning = organicDog.getCageDirtiness();

		assertThat(cageCleanlinessAfterCleaning, equalTo(cageCleanlinessBeforeCleaning - 5));

	}
	
	@Test
	public void shouldPassWhenCageCleanlinessDecreasesWithTick() {
		int cageCleanlinessBeforeTick = organicDog.getCageDirtiness();
		organicDog.tick(organicDog);
		int cageCleanlinessAfterTick = organicDog.getCageDirtiness();
		
		assertThat(cageCleanlinessAfterTick, equalTo(cageCleanlinessBeforeTick + 2));

		
	}

}
