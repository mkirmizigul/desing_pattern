package desing_pattern.structural.adapter;

public class TestEnemyAttackers {

	public static void main(String[] args) {
		
		EnemyTank rx7Tank=new EnemyTank();
		
		EnemyRobot fredTheRobot=new EnemyRobot();
		
		EnemyAttacker robotAdapter=new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("The Robot");
		
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHands();
		
		System.out.println("The EnemyTank");
		
		rx7Tank.assingDriver("Frank");
		rx7Tank.driveForward();
		rx7Tank.fireWeapon();
		
		
		
		System.out.println("The robot with Adapter");
		
		robotAdapter.assingDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}
	
}
