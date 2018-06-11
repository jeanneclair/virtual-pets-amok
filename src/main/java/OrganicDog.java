
public class OrganicDog extends Organic implements WalkDog, Tick {

	private int cageDirtiness;

	public OrganicDog(String name, String description, int health, int happiness, int hunger, int thirst,
			int cageDirtiness) {
		super(name, description, health, happiness, hunger, thirst);
		this.cageDirtiness = cageDirtiness;
	}

	public int getCageDirtiness() {
		return cageDirtiness;
	}

	public void cleanCages() {

		cageDirtiness -= cageDirtiness;
		setHealth(getHealth() + 5);
		setHappiness(getHappiness() + 5);

	}

	@Override
	public void feed() {

		hunger -= 10;
		thirst += 10;
		happiness += 10;
		cageDirtiness += 10;

	}

	@Override
	public void walkDog(VirtualPet virtualPet) {

		cageDirtiness -= 5;
		health += 10;
		happiness += 10;

	}

	@Override
	public void tick(VirtualPet virtualPet) {

		cageDirtiness += 2;
		health -= 2;
		happiness -= 2;
		hunger += 2;
		thirst += 2;

	}

	@Override
	public String toString() {
		return "Organic Name= " + getName() + ", Description= " + getDescription() + ", Health= " + getHealth()
				+ ", Happiness= " + getHappiness() + ", Hunger= " + getHunger() + ", Thirst= " + getThirst()
				+ ", Cage Dirtiness= " + getCageDirtiness();
	}

}
