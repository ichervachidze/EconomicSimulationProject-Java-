/**MET CS 622
 * Assignment 2
 * class ZeroStockException
 * by Iryna Chervachidze
 * May 23, 2020
 */

package inventoryPackage;


/** User-defined exception to notify about zero stock event*/
public class ZeroStockException extends Exception {
	static String message = "\nZero Stock Warning: Need to re-Stock first!";
	private static final long serialVersionUID = 1L;
	
	public ZeroStockException() {
		super(message);
	}
	public ZeroStockException(String message) {super (message);}
}
