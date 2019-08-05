import java.util.Date;
public interface Shape {

    /**
     * Enum class to store the type of the shapes 
     */
    public enum ShapeType { RECTANGLE, SQUARE, TRIANGLE, CIRCLE }    
	   /**
     * Method to calculate the area enclosed by the shape
     * Returns area, enclosed by the shape
     */
    public double getArea();    
    /**
     * Method to calculate the perimeter of the shape
     * Returns perimeter of the shape
     */
    public double getPerimeter();    
    /**
    * Method to return the origin of the shape i.e., the leftmost point of the
      shape
    * Returns origin, coordinates of the leftmost point
    */
    public Point getOrigin();
    /**
     * Method to find if a point is enclosed by the shape or not
     * Parameter point,point for which to check
     * Returns true if the given point lies inside the shape else false
     */
    public boolean isPointEnclosed(Point point);
    /**
     * Method to return the type of the shape such as rectangle, square etc
     * Returns type of the shape
     */
    public ShapeType getType();
    /**
     * Method to return the unique id of the object
     * Returns id of the object
     */
    public int getId();
    /**
     * Method to return the timeStamp of the object created     
     * Returns the copy of the date object
     */
    public Date getTimeStamp();
    /**
     * Method to calculate the distance between the origin of the screen and
       origin of the shape 
     * Returns distance between the two points
     */
    public double getDistance();
}
