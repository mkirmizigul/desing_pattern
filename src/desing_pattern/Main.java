package desing_pattern;

import desing_pattern.behavioral.strategy.Animal;
import desing_pattern.behavioral.strategy.Bird;
import desing_pattern.behavioral.strategy.CantFlys;
import desing_pattern.behavioral.strategy.Dog;
import desing_pattern.behavioral.strategy.ItsFlys;

public class Main {

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
		
		doddyAnimal.setFlyAvailable(new CantFlys());
		
		System.out.println("Dog says: "+doddyAnimal.tryToFly());
	}

}
