package desing_pattern.creator.factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnemyShip theEnemyShip=null;
		
		Scanner userInput=new Scanner(System.in);
		
		EnemyShipFactory esf=new EnemyShipFactory();
		
		System.out.println("What type of ship? (U / R / B)");
		
		String enemyString="";
		
		if (userInput.hasNextLine()) {
			enemyString=userInput.nextLine();
			theEnemyShip=esf.makeEnemyShip(enemyString);
		}
		
		if(theEnemyShip!=null) {
			doStuffEnemy(theEnemyShip);	
		}else {
			System.out.println("Enter a U,R, or B next time");
		}
		
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayHeroShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
