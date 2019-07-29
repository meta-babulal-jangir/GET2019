abstract class Reptile extends Animal{
    public static final String CATEGORY="Reptile";
	public Reptile(String name,int age,float weight)
	{
		super(name,age,weight);
	}
	abstract public String getSound();
	/**
     * Returns Category of Animal like Reptile	 
	 */
	public String getCategory()
	{
		return CATEGORY;
	}
	abstract public String getType();
}