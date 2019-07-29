public class Lion extends Mammal{
	public static final String TYPE="Lion";
	public Lion(String name,int age,float weight)
	{
		super(name,age,weight);
	}
	/**
     * Returns Sound of Animal  
	 */
    public String getSound()
	{
	    return "Roars";
	}
	/**
     * Returns Type of Animal 	 
	 */
	public String getType()
	{
		return TYPE;
	}
}