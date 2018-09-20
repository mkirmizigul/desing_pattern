package desing_pattern.behavioral.strategy;

public class Bird extends Animal {

	public Bird() {
		super();
		setSound("cik");
		
		flysType=new ItsFlys();
	}

}
