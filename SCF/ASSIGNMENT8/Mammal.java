abstract class Mammal extends Animal{
    public static final String CATEGORY="mammal";
	public Mammal(String name,int age,float weight)
	{
		super(name,age,weight);
	}
	abstract public String getSound();
	/**
     * Returns Category of Animal like mammal	 
	 */
	public String getCategory()
	{
		return CATEGORY;
	}
	abstract public String getType();
}