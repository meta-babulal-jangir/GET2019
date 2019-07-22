import java.io.*;
public class SoppingCart{
	  	public static void main(String args[])
        {	
	            int itemId; 
	            Console con=System.console();
                Catalogue catalogue=new Catalogue();
		        Cart myCart=new Cart(catalogue);
				int choice,userChoice;
				do
				{
					System.out.print(" Enter Your Choice :\n1. Press 1 For Admin Panel :");
					System.out.print("\n2. Press 2 For User Panel   :");
					System.out.print("\n3. Press 0 to exit   :");
					choice=Integer.parseInt(con.readLine());
					switch(choice)
					{ 
                        default:
					        System.out.println("Wrong Input");
                            break; 							
                        case 0:
                            System.out.println("Thank You");
                            break;							
						case 1:
							System.out.println("Want to Add Item(Y/N)");
							String choiceAdmin=con.readLine();
							Item item=null;
							while("y".equals(choiceAdmin)||"Y".equals(choiceAdmin))
							{	
								System.out.print("Enter Item ID in Integer form :");
								itemId=Integer.parseInt(con.readLine());
								System.out.print("Enter Item Name :");
								String itemName=con.readLine();
								System.out.println("Enter Item Price :");
								double itemPrice=Double.parseDouble(con.readLine());
								catalogue.addItem(itemId,itemName,itemPrice);
								System.out.println("Want to Add More Item(Y/N)");
								choiceAdmin=con.readLine();
							}
							break;
							
						case 2:
						    do
							{
							    System.out.println("Welcome Select Your Choice :");
							    System.out.print("\n1. To Show All Items :");
							    System.out.print("\n2. To Add  Item to Your Cart :");
							    System.out.print("\n3. To Remove  Item from Your Cart :");
							    System.out.print("\n4. To Show Your Cart :");
							    System.out.print("\n5. Update Item in Cart :");
							    System.out.print("\n6. Generate Bill :");
							    System.out.print("\n0  To Exit :");
							    userChoice=Integer.parseInt(con.readLine());
							    switch(userChoice)
							    {   
                                    case 0:
                                        System.out.println("Thank You");
										choice=userChoice;
                                        break;									
								    case 1:
									    myCart.showItem();
									    break;
								    case 2: 
                                                                            myCart.showItem();
									    System.out.println("Enter Item Id");
									    itemId=Integer.parseInt(con.readLine());
									    myCart.addItemToCart(itemId);
									    break;
								    case 3: 
									    System.out.println("Enter Item Id");
									    itemId=Integer.parseInt(con.readLine()); 
									    myCart.removeItemFromCart(itemId);
									    break;
								    case 4:
									    myCart.showCart();
									    break;
								    case 5:
									    System.out.println("Enter Item Id");
									    itemId=Integer.parseInt(con.readLine());
									    myCart.updateItemInCart(itemId);
									    break;                      
								    case 6:
									    myCart.generateBill();
							  		    break;
                                    default:
									    System.out.print("\n  Wrong Input :");
                                                                            break;
								}
                            }while(userChoice!=0);								
				      
					    
					}		
				}while(choice!=0);  
			     
	    }
}
