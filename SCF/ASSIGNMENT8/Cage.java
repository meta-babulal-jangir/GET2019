import java.util.ArrayList;
class Cage{
	private int count=0;
    private int cageId;
	private final int  capacity;
	private String animalType;
	private int noOfAnimalInCage;
	private ArrayList<Animal> animalList=new ArrayList<Animal>();
	public Cage(int capacity,String animalType)
	{
		cageId=++count;
		this.capacity=capacity;
		this.animalType=animalType;
		noOfAnimalInCage=0;
	}
	/**
     * The method checks cage if full or not 
     * Returns true if full otherwise false	 
	 */
	public boolean isFull()
	{
		if(capacity==noOfAnimalInCage)
		    return true;
        else
            return false;			
	}
	/**
     * This method added the Animal into cage 
     * Takes one Argument of type Animal in parameter
     * Returns true if Animal added to cage otherwise false 	 
	 */
	public boolean addAnimal(Animal animal)
	{
		if(capacity!=noOfAnimalInCage&& animalType==animal.getType())
		{
			getAnimalList().add(animal);
			noOfAnimalInCage++;
			return true;
		}
        else
            return false;		
	}
	/**
     * This method Removes the Animal from cage 
     * Takes one Argument of type integer in parameter which is animal Id
     * Returns true if Animal removed from cage otherwise false 	 
	 */
	public boolean removeAnimalFromCage(int animalId)
	{
		int listSize=animalList.size();
		boolean removed=false;
		for(int i=0;i<listSize;i++)
		{
			if(animalId==animalList.get(i).getId())
			{
				animalList.remove(i);
				removed=true;
				break;
			}
		}
		if(removed)
			return true;
		else 
			return false;
         		
	}
	/**
     * Returns Cage ID in integer	 
	 */
	public int getCageId()
	{
		return cageId;
	}
	/**
     * Returns type of Animal in String 	 
	 */
	public String getAnimalType()
	{
		return animalType;
	}
	/**
     * Returns capacity of cage in integer	 
	 */
	public int getCapacity()
	{
		return capacity;
	}
	/**
     * Returns number of Animal  in cage	 
	 */
	public int getNoOfAnimal()
	{
		return noOfAnimalInCage;
	}
	/**
     * Returns Animal list as ArrayList	 in cage 
	 */
	public ArrayList<Animal> getAnimalList()
	{
		return animalList;
	}
}