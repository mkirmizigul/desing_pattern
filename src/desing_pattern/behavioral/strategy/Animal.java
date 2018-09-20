package desing_pattern.behavioral.strategy;

public class Animal {

	private String name;
	private double height;
	private String sound;
	private String favFood;
	private double speed;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Flys flysType;
	
	public String tryToFly() {
		return flysType.fly();
	}
	
	public void setFlyAvailable(Flys flys) {
		flysType=flys;
	}
}
