package check;

import constants.Constants;

public class Check {
	
	private static String firstName = "樋口";
	private static String lastName = "知也";
	
	private static void printName(String firstName,String lastName){
		System.out.println("printNameメソッド → " + firstName + lastName);
	}



	public static void main(String[] args) { 
	
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		printName(firstName,lastName);
		pet.introduce();
		robot.introduce();
		
	}
}
