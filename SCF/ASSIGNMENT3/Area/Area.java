public class Area{
    private double area;
    public Area()
    {
        area=0.0; 
    }
    /**
	 * Takes two parameter as argument of double type
	 * First parameter is height of triangle
	 * Second parameter is width of triangle
     * Returns area of a triangle	 
	 */
    public double triangleArea(double height,double width)
    {
        area=height*width/2;
        return area; 
    }
	/**
	 * Takes two parameter as argument of double type
	 * First parameter is length of Rectangle
	 * Second parameter is width of Rectangle
     * Returns area of a Rectangle	 
	 */
    public double rectangleArea(double length,double width)
    {
        area=length*width;
        return area; 
    }
	/**
	 * Takes one parameter as argument of double type
	 * The parameter is a side of Square
     * Returns area of a Square	 
	 */
    public double squareArea(double side)
    {
        area=side*side;
        return area; 
    }
	/**
	 * Takes one parameter as argument of double type
	 * The parameter is radius of Circle
     * Returns area of a Circle	 
	 */
    public double circleArea(double radius)
    {
        area=Math.PI*radius*radius;
        return area; 
    } 
}
