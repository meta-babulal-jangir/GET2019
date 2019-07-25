class Zone{
	private int count=0;
	private String zoneName;
	private int zoneId;
	private final int MAXCAGE;
	private String category;
    private boolean hasPark;
	private boolean hasCanteen;
	private ArrayList<Cage> cageList=new ArrayList();
	
	public Zone(Sting ZoneName,String category,int maxCage,boolean hasCanteen,boolean hasPark)
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
	public boolean addCage()
	{   
	    if(maxCage==cageList.size())
			return false;
		else
		{	
	        // it will create a new cage the capacity is in integer form and animalType type is in String like Lion
		    cageList.add(new Cage(capacity,animalType));
			return true;
		}	
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