/**
*@author Tyler Lericos
*@version 1.0
*Programming Lab 0.1
*Spring Semester/Freshman
*/
public class Square {

	int side;
	/**
	 * 
	 * The empty-argument constuctor should initialize the instance variable side
	 * **/
		public Square() {
			side = 0;
		}
	/**
	 * 
	 * @param side gets the integer side and initializes it
	 */
		public Square(int side) {
			this.side = side;
		}
	/**
	 * 
	 * @return integer side
	 */
		public int getSide() {
			return side;
		
		}
	/**
	 * 
	 * @param newSide variable where side is saved to
	 */
		public void setSide(int newSide) {
			side = newSide;
		}
	/**
	 * 
	 * @return an integer area in which contains an equation for area of square
	 */
		public int area() {
			int area;//Variable for area
			return area = side *side; //Get area and multiply
			
		}
	
	
}
