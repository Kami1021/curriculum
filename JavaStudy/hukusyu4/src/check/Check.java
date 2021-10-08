package check;
import constants.Constants;

public class Check {
static private String firstName = "HIGUCHI";
static private String lastName = "TOMOYA";

static private void printName(String firstName ,String lastName){
	System.out.println(firstName + lastName);
	}	

public static void main(String[] args) { 
Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	
printName(firstName,lastName);
pet.introduce();
robotpet.introduce();
}	
}
