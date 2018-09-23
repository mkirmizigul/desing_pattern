package desing_pattern.structural.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza tempPizza) {
		super(tempPizza);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Souce");
	}

	@Override
	public String getDescription() 
	{
		return tempPizza.getDescription()+" ,Tomato Sauce";
	}
	
	
	@Override
	public double getCost() {
		return tempPizza.getCost()+.35;
	}
}
