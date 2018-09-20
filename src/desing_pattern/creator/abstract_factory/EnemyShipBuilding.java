package desing_pattern.creator.abstract_factory;

public abstract class EnemyShipBuilding {

	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	
	public EnemyShip orderTheShip(String typeOfShip) {
		EnemyShip theEnemyShip=makeEnemyShip(typeOfShip);
		theEnemyShip.makeShip();
		theEnemyShip.displayHeroShip();
		theEnemyShip.followHeroShip();
		theEnemyShip.enemyShipShoots();
		return theEnemyShip;
	}
}
