/**MET CS 622
 * Assignment 1
 * class Equipment
 * by Iryna Chervachidze
 * May 19, 2020
 */
package inventoryPackage;


public class Equipment extends Item {
	private static int REORDER_THRESHOLD_DEFAULT = 2;
	private static int REORDER_QUANTITY_DEFAULT = 5;
	private String category;//such as math, literature, grammar, science, etc.
	
	//constructor
	public Equipment(String name, int quantity, int idNumber, 
			double cost, String category) { 
		super(name, quantity, idNumber, cost);
		this.category = category;
		this.minAllowable = REORDER_THRESHOLD_DEFAULT;
		this.reOrderQuantity = REORDER_QUANTITY_DEFAULT;
	}
	
	//getters
	 public String getCategory() {return this.category;}
	 public int getMinAllowable() {return this.minAllowable;}
	 
	 
	 //setters
	public void setCategory(String category) {this.category = category;}
	public void setMinAllowable(int numberOfItems) {
		if (numberOfItems < 0) throw new IllegalArgumentException();
		else this.minAllowable = numberOfItems;	
	}
	
		
	public String toString() {
		 return super.toString() +
				 "\nCategory: " + category;
	}

}
