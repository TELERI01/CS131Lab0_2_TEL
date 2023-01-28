/**
*@author Tyler Lericos
*@version 1.0
*Programming Lab 0.1
*Spring Semester/Freshman
*/
public class Application {

	
	
	
	public static void main(String[] args) {
		ArrayFun arrayFun = new ArrayFun(6);
		System.out.println("Forwards: \n");
		arrayFun.forward();
		System.out.println("Backwards: \n");
		arrayFun.backward();
		
		System.out.println("Sum: ");
		arrayFun.sum();
		
	}
	
	//Instantiate it and calls the class methods
}
