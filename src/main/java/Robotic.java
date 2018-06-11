
public abstract class Robotic extends VirtualPet implements Tick {

	private int rustiness;

	public Robotic(String name, String description, int health, int happiness, int rustiness) {
		super(name, description, health, happiness);
		this.rustiness = rustiness;

	}

	public int getRustiness() {
		return rustiness;
	}

	public void oil() {

		setHealth(getHealth() + 10);
		setHappiness(getHappiness() + 10);
		rustiness -= rustiness;

	}

	@Override
	public void tick(VirtualPet virtualPet) {

		setHealth(getHealth() - 2);
		setHappiness(getHappiness() - 2);
		rustiness += 2;

	}

	@Override
	public String toString() {
		return "Robotic: Name= " + getName() + ", Description= " + getDescription() + ", Health= " + getHealth()
				+ ", Happiness= " + getHappiness() + ", Rustiness= " + getRustiness();
	}

}
