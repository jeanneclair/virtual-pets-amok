import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {

	
	OrganicCat organicCat = new OrganicCat("Rainbow", "organic cat", 50, 50, 50, 50, 50);
	
	@Test
	public void shouldPassWhenCleaningLitterBoxIncreasesCleanliness () {
		
		int boxDirtinessBeforeCleaning = organicCat.getLitterBoxDirtiness();
		organicCat.cleanLitterBox();
		int boxDirtinessAfterCleaning = organicCat.getLitterBoxDirtiness();
		
		assertThat(boxDirtinessAfterCleaning, equalTo(boxDirtinessBeforeCleaning - 50));
	}
	
	@Test
	public void shouldPassWhenTickDecreasesLitterBoxCleanliness() {
		
		int litterBoxDirtinessBeforeTick = organicCat.getLitterBoxDirtiness();
		organicCat.tick(organicCat);
		int litterBoxDirtinessAfterTick = organicCat.getLitterBoxDirtiness();
		
		assertThat(litterBoxDirtinessAfterTick, equalTo(litterBoxDirtinessBeforeTick + 2));
	}

}
