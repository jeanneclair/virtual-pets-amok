
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
		cageDirtiness +=10;
		
	}

	@Override
	public void walkDog(VirtualPet virtualPet) {

		cageDirtiness -=5;
//		health +=10;
//		happiness +=10;
		setHealth(getHealth() + 5);
		setHappiness(getHappiness() + 5);
	}

	@Override
	public void tick(VirtualPet virtualPet) {

		cageDirtiness += 2;
		setHealth(getHealth() - 2);
		setHappiness(getHappiness() - 2);
		setHunger(getHunger() + 2);
		setThirst(getThirst() + 2);
	}

	private void setThirst(int i) {

		return;
	}

	private void setHunger(int i) {
		
		return;
		
	}

	@Override
	public String toString() {
		return "Organic Name= " + getName()  + ", Description= " + getDescription()+ ", Health= " + getHealth()
		+ ", Happiness= " + getHappiness() + ", Hunger= " + getHunger()
				+ ", Thirst= " + getThirst() + ", Cage Dirtiness= " + getCageDirtiness();
	}
	
	
}
