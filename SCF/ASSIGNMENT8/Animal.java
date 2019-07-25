abstract class Animal{
    private int counter=0;
	private int animalId;
	private String animalName;
	private int age;
	private float weight;
	public Animal(String name,int age,float weight)
	{   
        animalId=++counter; 		
		animalName=name;
		this.age=age;
		this.weight=weight;
	}
	/**
     * Returns Animal ID in integer	 
	 */

	public int getId()
	{
		return animalId;
	}
	/**
     * Returns Animal's Name in String	 
	 */
    public String getString()
	{
		return animalName;
	}
	/**
     * Returns Animal's Age  in integer	 
	 */
    public int getAge()
	{
		return age;
	}
	/**
     * Returns Animal's Weight in float	 
	 */
    public float getWeight()
    {
		return weight;
	}   	
	abstract public String getSound();
	abstract public String getCategory();
	abstract public String getType();
}