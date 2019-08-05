import java.util.Date;
import java.util.List;

public class Rectangle implements Shape {

    private Point origin;
	   private double length;
	   private double width;
	   private final ShapeType type;
   	private final Date timestamp;
	   private int id;

	   public Rectangle(int id, ShapeType type, Point origin, List<Double> parameters) 
    {
		      this.origin = origin;
		      this.length = parameters.get(0);
		      this.width = parameters.get(1);
		      this.type = type;
		      this.timestamp = new Date();
		      this.id = id;
	   }

    /**
     * Method to calculate the area enclosed by the shape
     * Returns area, enclosed by the shape
     */
	   public double getArea() 
	   {
		      return length * width;
	   }

    /**
     * Method to calculate the perimeter of the shape
     * Returns perimeter of the shape
     */
	   public double getPerimeter() 
	   {
		      return (2 * length * width);    
	   }

    /**
    * Method to return the origin of the shape i.e., the leftmost point of the
      shape
    * Returns origin, coordinates of the leftmost point
    */
	   public Point getOrigin() 
	   {
		      return origin;
	   }

    /**
     * Method to find if a point is enclosed by the shape or not
     * Parameter point, point for which to check
     * Returns true if the given point lies inside the shape else false
     */
	   public boolean isPointEnclosed(Point point) 
	   {
		      if (point.getxCoord() >= origin.getxCoord() && point.getyCoord() >= origin.getyCoord() && point.getxCoord() < origin.getxCoord() + length && point.getyCoord() < origin.getyCoord() + width)
		      {
			         return true;
		      }
		      return false;
	   }

    /**
     * Method to calculate the distance between the origin of the screen and
       origin of the shape 
     * Returns distance between the two points
     */
	   public double getDistance() 
    {
		      return Math.sqrt(origin.getxCoord() * origin.getxCoord() + origin.getyCoord() * origin.getyCoord());  //the origin of screen is (0,0)
	   }
	
    /**
     * Method to return the type of the shape such as rectangle, square etc 
     * Returns type of the shape
     */
    public ShapeType getType() 
    {   
    	    return type;    
    }
    
    /**
     * Method to return the timestamp of the object created 
     * Returns the copy of the date object
     */
    public Date getTimeStamp() 
    {   
    	   return timestamp;
    }

    /**
     * Method to return the unique id of the object 
     * Returns id of the object
     */
	   public int getId() 
    {   
		      return id; 
	   }
}
