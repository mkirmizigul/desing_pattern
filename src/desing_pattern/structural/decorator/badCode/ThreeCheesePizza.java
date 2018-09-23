package desing_pattern.structural.decorator.badCode;

public class ThreeCheesePizza extends Pizza {

	@Override
	public void setDescription(String newDescription) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Mozzarella,Fontina,Permesan,Cheese Pizza";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 10.00;
	}

}
