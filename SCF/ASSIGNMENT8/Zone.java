import java.util.ArrayList;
class Zone{
	private int count=0;
	private String zoneName;
	private int zoneId;
	private final int MAXCAGE;
	private String category;
    private boolean hasPark;
	private boolean hasCanteen;
	private ArrayList<Cage> cageList=new ArrayList();
	
	public Zone(String ZoneName,String category,int maxCage,boolean hasCanteen,boolean hasPark)
	{
		zoneId=++count;
		this.zoneName=zoneName;
		this.category=category;
		MAXCAGE=maxCage;
		this.hasCanteen=hasCanteen;
		this.hasPark=hasPark;
	}
	/**
     * This method added the cage into zone 
     * If it ctreated Cage then return true otherwise false	 
	 */
	public boolean addCage(int capacity,String animalType)
	{   
	    if(MAXCAGE==cageList.size())
			return false;
		else
		{	
	        // it will create a new cage the capacity is in integer form and animalType type is in String like Lion
		    cageList.add(new Cage(capacity,animalType));
			return true;
		}	
	}
	/**
     * This method added the Animal to cage  
     * If it ctreated Cage then return true otherwise false	 
	 */
	public boolean addAnimalToCage(Animal animal)
	{   
	    int noOfCage=cageList.size();
		Cage alReadyCage=null;
        for(int i=0;i<noOfCage;i++)
        {
			if(cageList.get(i).getAnimalType()==animal.getType() && cageList.get(i).getNoOfAnimal()<cageList.get(i).getCapacity())
			{    
		        alReadyCage=cageList.get(i);
				break;
            }				
		} 			
	    if(alReadyCage!=null)
		{
			alReadyCage.addAnimal(animal);
			return true;	
		}
		else
			return false;
    }
	/**
     * Returns Zone Id  int integer .
	 */
	 
	public int zoneId()
	{
		return zoneId;
	}
	/**
     * Returns Zone Name in String 
	 */
	public String zoneName()
	{
		return zoneName;
	}
	/**
     * The method Returns the maximum number of cage in zone in Integer. 
	 */
	public int maxCage()
	{
		return MAXCAGE;
	}
	/**
     * The method Returns the category of zone in String. 
	 */
	public String category()
	{
		return category;
	}
	/**
     * The method Returns true if  zone has Canteen otherwise false. 
	 */
	public boolean hasCanteen()
	{
		return hasCanteen;
	}
	/**
     * The method Returns true if  zone has Park otherwise false. 
	 */
	public boolean hasPark()
	{
		return hasPark;
	}
}