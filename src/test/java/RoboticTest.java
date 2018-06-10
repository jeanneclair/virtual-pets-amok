import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticTest{
	
	Robotic robotic = new Robotic("Fido", "robotic dog", 50, 50, 50);
	//now failing after making class abstract
	
	@Test //passed
	public void shouldPassWhenOilingMakesRustinessGoDown() {
	
		int rustinessBeforeGettingOiled = robotic.getRustiness();
		robotic.oil();
		int rustinessAfterGettingOiled = robotic.getRustiness();
		
		assertThat(rustinessAfterGettingOiled, equalTo(rustinessBeforeGettingOiled-10));

	}
	
	@Test //passed
	public void shouldPassWhenTickIncreasesRustiness() {
		int rustinessBeforeTick = robotic.getRustiness();
		robotic.tick(robotic);
		int rustinessAfterTick = robotic.getRustiness();
		
		assertThat(rustinessAfterTick, equalTo(rustinessBeforeTick + 2));

	}

}
