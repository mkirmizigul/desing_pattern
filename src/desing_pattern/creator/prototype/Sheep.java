package desing_pattern.creator.prototype;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep is made");
	}
	
	
	
	@Override
	public Animal makeCopy() {
				
		System.out.println("Sheep is being made");
		
		Sheep sheepObject=null;
		
		try {
			sheepObject=(Sheep)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		return sheepObject;
	}

	@Override
	public String toString() {
		return "Dolly is my Hero, Baaa";
	}
}
