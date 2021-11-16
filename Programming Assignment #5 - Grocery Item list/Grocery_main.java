
public class Grocery_main {

	public static void main(String[] args) {
		
	GroceryList2 myList = new GroceryList2();
	
	GroceryItemOrder2 item1 = new GroceryItemOrder1("meat", 1, 12.99);
	GroceryItemOrder2 item2 = new GroceryItemOrder2("rice", 1, 9.55);
	GroceryItemOrder2 item3 = new GroceryItemOrder3("coffee", 3, 15.66);
	GroceryItemOrder2 item4 = new GroceryItemOrder4("milk", 1, 4.99);
	GroceryItemOrder2 item4 = new GroceryItemOrder5("juice", 1, 2.33);
	
	myList.add(item1);
	myList.add(item2);
	myList.add(item3);
	myList.add(item4);
	
	myList.displayItems();
	
	System.out.println("Total = " + "S" + myList.getTotalCost());

	}

}
