
public abstract class Organic extends VirtualPet {
	
	

	private int hunger;
	private int thirst;



	public Organic(String name, String description, int health, int happiness, int hunger, int thirst) {
		super(name, description, health, happiness);
		this.hunger = hunger;
		this.thirst = thirst;

	}
	
	




	public int getHunger() {
		return hunger;
	}



	public int getThirst() {
		return thirst;
	}



	public void feed() {
		
		hunger -= 10;
		thirst += 10;
		setHappiness(getHappiness() + 5);
		
	}

	public void water() {

		thirst -= 10;
		setHappiness(getHappiness() + 5);
	}

}
