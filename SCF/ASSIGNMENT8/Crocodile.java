public class Crocodile extends Reptile{
	public static final String TYPE="Crocodile";
	public Crocodile(String name,int age,float weight)
	{
		super(name,age,weight);
	}
	/**
     * Returns Sound of Animal  
	 */
    public String getSound()
	{
	    return "hiss";
	}
	/**
     * Returns Type of Animal 	 
	 */
	public String getType()
	{
		return TYPE;
	}
}