package desing_pattern.behavioral.strategy;

public class Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal doddyAnimal=new Dog();
		Animal twitty=new Bird();
		
		System.out.println("Dog says: "+doddyAnimal.getSound());
		System.out.println("Bird says: "+twitty.getSound());
		
		System.out.println("Dog says: "+doddyAnimal.tryToFly());
		System.out.println("Bird says: "+twitty.tryToFly());
		
		doddyAnimal.setFlyAvailable(new ItsFlys());
		
		System.out.println("Dog says: "+doddyAnimal.tryToFly());
		
		doddyAnimal.setFlyAvailable(new CantFly());
		
		System.out.println("Dog says: "+doddyAnimal.tryToFly());
	}

}
