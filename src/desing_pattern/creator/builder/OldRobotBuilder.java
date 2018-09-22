package desing_pattern.creator.builder;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;

	public OldRobotBuilder() {
		super();
		this.robot=new Robot();
	}

	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		this.robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		// TODO Auto-generated method stub
		this.robot.setRobotTorso("Tin torso");

	}

	@Override
	public void buildRobotArms() {
		// TODO Auto-generated method stub
		this.robot.setRobotArms("Blowtorch arms");
	}

	@Override
	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		this.robot.setRobotLegs("Roller Skates");
	}

	@Override
	public Robot getRobot() {
		// TODO Auto-generated method stub
		return this.robot;
	}

}
