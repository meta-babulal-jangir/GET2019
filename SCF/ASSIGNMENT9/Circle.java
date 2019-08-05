import java.util.Date;
import java.util.List;

public class Circle implements Shape {

	    private final Point origin;
	    private final double radius;
	    private final ShapeType type;
	    private final Date timestamp;
	    private int id;

	    public Circle(int id, ShapeType type, Point origin, List<Double> parameters) 
	    {
		       this.type = type;
		       this.origin = origin;
		       this.radius = parameters.get(0);
		       this.timestamp = new Date();
		       this.id = id;
	    }

    /**
     * Method to calculate the area enclosed by the shape
     * Returns area, enclosed by the shape
     */
	    public double getArea() 
	    {  
		       return (Math.PI) * radius * radius; 
	    }

    /**
     * Method to calculate the perimeter of the shape
     * Returns perimeter of the shape
     */
	    public double getPerimeter() 
	    {    
		       return 2 * Math.PI * radius; 
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
	 * to find Centre of circle 
	 * Returns Point of Centre of Circle
	 */
	   private Point getCenter() 
	   {
		      double slope = Math.atan(origin.getyCoord() / origin.getxCoord());
		      //H^2 = B^2 + L^2
		      double distOfOrigin = Math.sqrt(origin.getyCoord() * origin.getyCoord() + origin.getxCoord() * origin.getxCoord());
		      double distOfCenter = radius + distOfOrigin;
		      double xCoord = distOfCenter * Math.cos(slope);
		      double yCoord = distOfCenter * Math.sin(slope);
		      Point center = new Point(xCoord, yCoord);
		      return center;
	   }
	
    /**
     * Method to find if a point is enclosed by the shape or not
     * Parameter point,point for which to check
     * Returns true if the given point lies inside the shape else false
     */
	   public boolean isPointEnclosed(Point point) 
	   {
		      Point center = getCenter();
		      double xCenter = center.getxCoord();
		      double yCenter = center.getyCoord();
		      double pointX = point.getxCoord();
		      double pointY = point.getyCoord();
		      if (Math.sqrt((pointY - yCenter) * (pointY - yCenter) + (pointX - xCenter) * (pointX - xCenter)) < radius) 
		      {
			         return true;
		      }
		      return false;
	   }

    /**
     * Method to calculate the distance between the origin of the screen and origin of the shape 
     * @return distance between the two points
     */
	   public double getDistance() 
   	{
		      return Math.sqrt(origin.getxCoord() * origin.getxCoord() + origin.getyCoord() * origin.getyCoord());
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
