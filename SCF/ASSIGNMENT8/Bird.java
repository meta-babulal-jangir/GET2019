abstract class Bird extends Animal{
    public static final String CATEGORY="Bird";
	public Bird(String name,int age,float weight)
	{
		super(name,age,weight);
	}
	abstract public String getSound();
	/**
     * Returns Category of Animal like Bird	 
	 */
	public String getCategory()
	{
		return CATEGORY;
	}
	abstract public String getType();
}