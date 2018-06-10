import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticDogTest {
	
	RoboticDog roboticDog = new RoboticDog("Fido", "robotic dog", 50, 50, 50);
	
	@Test
	public void shouldPassWhenWalkingRoboticDogIncreasesCageHealth() {

		int cageCleanlinessBeforeCleaning = roboticDog.getHealth();
		roboticDog.walkDog(roboticDog);
		int cageCleanlinessAfterCleaning = roboticDog.getHealth();

		assertThat(cageCleanlinessAfterCleaning, equalTo(cageCleanlinessBeforeCleaning + 5));

	}
}
