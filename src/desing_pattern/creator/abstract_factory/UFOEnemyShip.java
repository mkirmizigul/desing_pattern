package desing_pattern.creator.abstract_factory;

public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory shipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		super();
		this.shipFactory = shipFactory;
	}

	@Override
	void makeShip() {
		// TODO Auto-generated method stub
		System.out.println("Making enemy ship "+getName());
		weapon=shipFactory.addESGun();
		engine=shipFactory.addESEngine();
	}
	
	

}
