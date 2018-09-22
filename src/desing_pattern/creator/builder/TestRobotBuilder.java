package desing_pattern.creator.builder;

public class TestRobotBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RobotBuilder robotBuilder=new OldRobotBuilder();
		
		RobotEngineer robotEngineer=new RobotEngineer(robotBuilder);
		
		robotEngineer.makeRobot();
		
		Robot firstRobot=robotEngineer.getRobot();
		
		System.out.println("Robot build");
		
		System.out.println("Robot Head Type: "+firstRobot.getRobotHead());
		System.out.println("Robot Torso Type: "+firstRobot.getRobotTorso());
		System.out.println("Robot Arms Type: "+firstRobot.getRobotArms());
		System.out.println("Robot Legs Type: "+firstRobot.getRobotLegs());
		

	}

}
