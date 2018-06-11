
public abstract class VirtualPet implements Tick {

	private String name;
	private String description;
	protected int health;
	protected int happiness;

	public VirtualPet(String name, String description, int health, int happiness) {
		super();
		this.name = name;
		this.description = description;
		this.setHealth(health);
		this.setHappiness(happiness);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void tick(VirtualPet virtualPet) {

		setHealth(getHealth() - 2);
		setHappiness(getHappiness() - 2);

	}

	@Override
	public String toString() {
		return "Name=" + getName() + ", Description= " + getDescription() + ", Health= " + getHealth() + ", Happiness= "
				+ getHappiness();
	}

}
