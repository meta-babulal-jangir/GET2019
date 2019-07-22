import java.io.*;
import java.util.*;
public class Cart{
	    Item item=null;
        Catalogue myCatalogue=null;
        ListIterator accessItemList=null;
        Set setOfCartItem=null;
        Iterator accessSetOfCartItem=null; 
        Map.Entry accessCartItem=null;
        Map<Item,Integer> cartItem=new HashMap<Item,Integer>();
        int itemQuantity=1;
        Console con=System.console();
        boolean itemFound=false;
        public Cart(Catalogue catalogue)
        {
            myCatalogue=catalogue; 
        } 
        public void addItemToCart(int itemId)
        {    			
            if(itemFoundInCatalogue(itemId))
            {    
                if(itemNotFoundInCart(itemId))
                { 
                    System.out.println("Enter Item Quantity(Remember it must Be More than 0) :");
                    itemQuantity=Integer.parseInt(con.readLine());
                    if(cartItem.put(item,new Integer(itemQuantity))==null)
                        System.out.println("Item Added Successfully ");
                    else
                       System.out.println("Item Not Added in Cart Please try again");
                }
                else
                    System.out.println("Item Already in Cart :");
            }
            else                           
                System.out.println("Invalid Item Id ");	  
        } 
	
	    public boolean itemFoundInCatalogue(int itemId)
        {           
            itemFound=false;
            accessItemList=myCatalogue.itemList.listIterator();
            while(accessItemList.hasNext())
            {     
                item=(Item)accessItemList.next();
                if(item.getItemId()==itemId)
                {
                    itemFound=true; 
                    break; 
                }
                else
                    item=null;                   
            } 
            return itemFound;    
        }
        public boolean itemNotFoundInCart(int itemId)
        {       
            if(!(cartItem.containsKey(item)))
            {
                return true;
            }
            else
            {
                return false;             
            }                 
                 
        }
                
		public void updateItemInCart(int itemId)
		{
			if(itemFoundInCatalogue(itemId)&&!(itemNotFoundInCart(itemId)))
			{
				System.out.println("Enter new Quantity :");
				itemQuantity=Integer.parseInt(con.readLine());
				if((cartItem.put(item,new Integer(itemQuantity)))!=null)
					System.out.println("Quantity Updated :");
				else
					System.out.println("You Entered wrong Entry:");
			}
            else
                System.out.println("Item Not Found in Cart :");  
		}
		public void removeItemFromCart(int itemId)
		{	  
		    if(itemFoundInCatalogue(itemId)&&!(itemNotFoundInCart(itemId)))
		    {
				cartItem.remove(item);
			}	 
		}
		public double showCart()
		{       
            setOfCartItem=cartItem.entrySet();
            accessSetOfCartItem=setOfCartItem.iterator();
            double sum=0;
            if(accessSetOfCartItem.hasNext())
            {
                System.out.println("Item ID      Item Name                Item Price          Item Quantity          Total Price");
                while(accessSetOfCartItem.hasNext())
                {
                    accessCartItem=(Map.Entry)accessSetOfCartItem.next();
                    item=(Item)accessCartItem.getKey();
                    System.out.print(item.getItemId()+"           ");
                    System.out.print(item.getItemName()+"               ");
                    System.out.print(item.getItemPrice()+"               ");
                    System.out.print(accessCartItem.getValue()+"                 ");
                    System.out.print(item.getItemPrice()*(int)(accessCartItem.getValue())+"                 ");
                    System.out.println("\n------------------------------------------------------------------------------------");
                    sum+=(item.getItemPrice()*(int)accessCartItem.getValue());                       
                }
                return sum;
            }
            else   
            {
			    System.out.println("Your Cart is Empty");
                return 0;
            }
		}
		public void generateBill()
		{      
	            System.out.println("Your Bill Deatils are Following :\n\n");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("     Total Amount is : "+showCart());
        }
                              
        public void showItem()
	    {	
	        accessItemList=myCatalogue.itemList.listIterator();
		    System.out.println("Item ID      Item Name                Item Price");
		    while(accessItemList.hasNext())
		    {	
			    item=(Item)accessItemList.next();
			    System.out.println(item.getItemId()+"        "+item.getItemName()+"        "+item.getItemPrice());
		    }	
	    }
}
