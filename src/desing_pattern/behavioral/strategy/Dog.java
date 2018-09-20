package desing_pattern.behavioral.strategy;

public class Dog extends Animal {

	public Dog() {
		super();
		setSound("woowh");
		
		flysType=new CantFlys();
	}
	
}
