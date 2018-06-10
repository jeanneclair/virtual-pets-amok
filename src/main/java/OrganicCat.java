
public class OrganicCat extends Organic implements Tick {

	private int litterBoxDirtiness;

	public OrganicCat(String name, String description, int health, int happiness, int hunger, int thirst,
			int litterBoxCleanliness) {
		super(name, description, health, happiness, hunger, thirst);
		this.litterBoxDirtiness = litterBoxCleanliness;
	}

	public int getLitterBoxDirtiness() {

		return litterBoxDirtiness;
	}

	public void cleanLitterBox() {

		litterBoxDirtiness -= getLitterBoxDirtiness();
		setHealth(getHealth() + 5);
		setHappiness(getHappiness() + 5);
	}
	
	@Override
	public void feed() {
		
		hunger -= 10;
		thirst += 10;
		happiness += 10;
		litterBoxDirtiness +=10;
		
	}
	
	@Override
	public void tick(VirtualPet virtualPet) {

		litterBoxDirtiness += 2;
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
				+ ", Happiness= " + getHappiness() + ", Hunger= " + getHunger() + 
				", Thirst= " + getThirst() + ", Litterbox Dirtiness= " + getLitterBoxDirtiness();
	}


}
