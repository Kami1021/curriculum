package check;

import constants.Constants;

public class Check {
	
	private String firstName = "樋口";
	private String lastName = "知也";
	
	private void printName(String firstName,String lastName){
		System.out.println("printNameメソッド → " + firstName + lastName);
	}



	public static void main(String[] args) { 
	
		Constants con = new Constants();
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		Check ch = new Check();
		
		ch.printName(ch.firstName,ch.lastName);
		pet.introduce();
		robot.introduce();
		
	}
}
