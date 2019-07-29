import java.io.*;
public class ZooManagement{
    public static void main(String args[])
	{   
	    Console con=System.console();
	    int choice;
		System.out.println("1. Lion\n2. Crocodile\n3. Peacock");
		choice=Integer.parseInt(con.readLine());
		switch(choice)
		{
	        case 1:
			    Mammal.addAnimal();
			    Animal animal=new Lion("Lion1",10,20.2f);
				break;
			case 2:
                Animal animal=new Crocodile("crocodile1",10,20.2f);
				break;
            case 3:
                Animal animal=new Peacock("Peacock1",10,20.2f);
                break;				
            
 		
	}
}