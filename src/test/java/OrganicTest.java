import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicTest {
	
	Organic organic = new Organic("Junebug", "tuxedo cat", 50, 50, 50, 50);
	//now failing after making class abstract

	
	
	@Test //passed
	public void shouldPassWhenFeedingIncreasesHappiness() {
		
		int happinessBeforeFeeding = organic.getHappiness();
		organic.feed();
		int happinessAfterFeeding = organic.getHappiness();
		
		assertThat(happinessAfterFeeding, equalTo(happinessBeforeFeeding + 5));
				
	}
	
	@Test //passed
	public void shouldPassWhenWateringDecreasesThirst () {
		
		int thirstBeforeWatering = organic.getThirst();
		organic.water();
		int thirstAfterWater = organic.getThirst();
		
		assertThat(thirstAfterWater, equalTo(thirstBeforeWatering-10));
	}
	

}
