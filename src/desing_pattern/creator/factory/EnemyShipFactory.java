package desing_pattern.creator.factory;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType) {
		
		EnemyShip newShip=null;
		
		switch (newShipType) {
		case "U":
			newShip=new UFOEnemyShip();
			break;
		case "R":
			newShip=new RocketEnemyShip();
			break;
		case "B":
			newShip=new BigUFOEnemyShip();
			break;
		default:
			break;
		}
		
		return newShip;
		
	}

}
