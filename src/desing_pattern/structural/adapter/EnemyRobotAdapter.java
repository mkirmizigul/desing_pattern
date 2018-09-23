package desing_pattern.structural.adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot theRobot) {
		super();
		this.theRobot = theRobot;
	}

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		theRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		theRobot.walkForward();
	}

	@Override
	public void assingDriver(String driverName) {
		// TODO Auto-generated method stub
		theRobot.reactToHuman(driverName);
	}

}
