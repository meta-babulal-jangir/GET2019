public class Point {

    private double xCoord;
    private double yCoord;

    Point(double xCoord, double yCoord) 
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    /* to get X coordinate of Point
     * Returns x coordinate
     */
    public double getxCoord() 
    { 
    	   return xCoord;  
    }

    /* to get Y coordinate of Point
     * Returns y coordinate
     */
    public double getyCoord() 
    { 
    	   return yCoord; 
    }

}
