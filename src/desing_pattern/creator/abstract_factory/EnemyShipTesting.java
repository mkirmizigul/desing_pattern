package desing_pattern.creator.abstract_factory;

public class EnemyShipTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnemyShipBuilding makeUFOsBuilding=new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt=makeUFOsBuilding.orderTheShip("UFO");
		System.out.println(theGrunt+"\n");
		
		EnemyShip theBoss=makeUFOsBuilding.orderTheShip("UFO BOSS");
		System.out.println(theBoss+"\n");
		
	}


}
