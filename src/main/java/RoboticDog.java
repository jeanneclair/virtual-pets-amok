
public class RoboticDog extends Robotic implements WalkDog {

	public RoboticDog(String name, String description, int health, int happiness, int rustiness) {
		super(name, description, health, happiness, rustiness);
			
		}

	@Override
	public void walkDog(VirtualPet virtualPet) {

		setHealth(getHealth() + 5);
		setHappiness(getHappiness() + 5);
	}

	

	
	
	

}
