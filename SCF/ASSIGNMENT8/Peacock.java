public class Peacock extends Bird{
	public static final String TYPE="Peacock";
	public Peacock(String name,int age,float weight)
	{
		super(name,age,weight);
	}
	/**
     * Returns Sound of Animal  
	 */
    public String getSound()
	{
	    return "Screams";
	}
	/**
     * Returns Type of Animal  
	 */
	public String getType()
	{
		return TYPE;
	}
}