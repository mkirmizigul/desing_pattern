package desing_pattern.creator.prototype;

public class TestCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CloneFactory animalMaker=new CloneFactory();
		
		Sheep sally=new Sheep();
		
		Sheep clonedSheep=(Sheep)animalMaker.getClone(sally);
		
		System.out.println(sally);
		
		System.out.println(clonedSheep);
		
		System.out.println("Sally has code :"+System.identityHashCode(System.identityHashCode(sally)));
		
		System.out.println("Clone has code :"+System.identityHashCode(System.identityHashCode(clonedSheep)));
		
	}

}
