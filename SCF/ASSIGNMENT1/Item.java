public class Item{
	private int itemId;
	private String itemName;
	private double itemPrice;
	public Item(int itemId,String itemName,double itemPrice )
	{
		this.itemId=itemId;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
	}
        public int getItemId()
	{
		return this.itemId;
	}
        public String getItemName()
	{
		return this.itemName;
	}
        public double getItemPrice()
	{
		return this.itemPrice;
	}  	
}
