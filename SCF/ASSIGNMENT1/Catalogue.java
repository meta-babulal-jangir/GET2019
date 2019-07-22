import java.util.*;
public class Catalogue{
	Item item=null;
	static List<Item> itemList=new ArrayList<Item>();
	public Catalogue()
    {
	    itemList.add(new Item(1001,"Jeans",899.00));
	    itemList.add(new Item(1002,"T-Shirt",599.00));
		itemList.add(new Item(1003,"Shirt",499.00));
	}
	public void addItem(int itemId,String itemName,double itemPrice )
	{	
	    itemList.add(new Item(itemId,itemName,itemPrice));
	}
	
}
