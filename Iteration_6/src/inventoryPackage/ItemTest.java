package inventoryPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {
	
	//create a concrete class that inherits all methods from abstract class Item
	//for testing purposes only
	public static class ItemConcrete extends Item {
		private int quantitySold;
	}
	
	ItemConcrete itemConcrete = new ItemConcrete();
	

	@Test (expected = Exception.class)
	public void testSetMarginTest() {
		ItemConcrete.setMargin(-0.1);
	}

	@Test (expected = Exception.class)
	public void testSetCost() {
		itemConcrete.setCost(-10.12);
	}

	@Test (expected = Exception.class)
	public void testSetDiscount() {
		itemConcrete.setDiscount(.4);
	}

	@Test
	public void testSellItem() {
		itemConcrete.setQuantity(0);
		try {
			itemConcrete.sellItem();
		}
		catch (ZeroStockException e) {
			System.out.println("ZeroStockException thrown: success!");
		}
	}
	
	@Test
	public void testIncrementQuantitySold() {
		itemConcrete.getQuantitySold();
		itemConcrete.incrementQuantitySold();
		assertEquals(1, itemConcrete.getQuantitySold());
	}
	
	@Test
	public void testSetQuantitySoldToZero() {
		itemConcrete.incrementQuantitySold();
		itemConcrete.setQuantitySoldToZero();
		assertEquals(0, itemConcrete.getQuantitySold());
	}
	
	
}

