/**MET CS 622
 * Assignment 1
 * class Supplies
 * by Iryna Chervachidze
 * May 19, 2020
 */
package inventoryPackage;


public class Supplies extends Item {
	private static int REORDER_THRESHOLD_DEFAULT = 10;
	private static int REORDER_QUANTITY_DEFAULT = 25;
	
	//constructor
	public Supplies(String name, int quantity, int idNumber, 
			double cost) { 
		super(name, quantity, idNumber, cost);
		this.minAllowable = REORDER_THRESHOLD_DEFAULT;
		this.reOrderQuantity = REORDER_QUANTITY_DEFAULT;
	}
	
	//getters
	 public int getMinAllowable() {return this.minAllowable;}
	 
	 
	 //setters
	public void setMinAllowable(int numberOfItems) {
		if (numberOfItems < 0) throw new IllegalArgumentException();
		else this.minAllowable = numberOfItems;	
	}
	
		
	public String toString() {
		 return super.toString();
	}

}
