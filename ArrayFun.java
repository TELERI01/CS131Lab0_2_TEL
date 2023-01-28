/**
*@author Tyler Lericos
*@version 1.0
*Programming Lab 0.1
*Spring Semester/Freshman
*/
public class ArrayFun {
	//Square Array
	Square myArray[] = new Square[6]; // Array with type Square from square class set to an index of 6
	
	/**
	 * 
	 * @param index set to myArray
	 * @param s sets s square 
	 */
	public void setMethodItem(int index, Square s) {
		
		myArray[index] = s;
	}
	/**
	 * 
	 * @param index is set in this method
	 * @return myArray with its index
	 */
	public Square getArrayItem(int index) {
		return myArray[index];
	}
	
	
	int size = myArray.length; // Takes the arrays length and stores it in size
	
	/**
	 * @param size is sent into the method
	 * @return six sqaure objects
	 * **/
	public ArrayFun(int size) {
		for(int i = 0; i <6; i++ ) {
			myArray[i] = new Square(i);	
		}
	}
	
	/**
	 * Takes the array and prints all 
	 */
	public void forward() {
		for (int i = 0 ; i<6; i++) {
			
			System.out.println(myArray[i].area());
		}//Takes an array and iterates through the area of each object
	}
	/**
	 * Takes the array and prints the objects backwards
	 */
	public void backward() {
		
		for (int i = 5; i>= 0 ; i--)
		
		System.out.println(myArray[i].area());
	}// Takes the array and iterates it backwards
	
	/**
	 * Gets the sum of al the areas 
	 */
	public void sum() {
		
		int sum = 0; //declares value array
		for(int i = 0; i<6; i++) {
			sum = sum + myArray[i].area();
			
		} // Adds the areas to value sum
		System.out.println(sum);//Prints sum
	}
	
	
	
	
	
	
	
	
	
	
}
