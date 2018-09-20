package desing_pattern.creator.abstract_factory;

public interface EnemyShipFactory {
	
	public ESWeapon addESGun();
	public ESEngine addESEngine();

}
