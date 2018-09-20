package desing_pattern.creator.abstract_factory;

public abstract class EnemyShip {

	private String name;
	ESWeapon weapon;
	ESEngine engine;
	private double amtDamage;
	
	abstract void makeShip();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDamage() {
		return amtDamage;
	}
	public void setDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

	@Override
	public String toString() {
		return "The "+name+" has a top speed of "+engine+" and an attack power of "+weapon;
	}
	
	public void followHeroShip() {
		System.out.println(getName()+" is following the hero");
	}
	
	public void displayHeroShip() {
		System.out.println(getName()+" is on the screen ");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName()+" attacks and does "+weapon);
	}
}
