import java.util.List;
public class Factory {

    public static AssertionError incorrectShape = new AssertionError(" Enter correct shape type !!");
    
    /*
     * Method to return the object of the shape created
     * Parameter type,type of the shape such as rectangle, square
     * Parameter point, origin of the shape
     * Parameter parameters,list of parameters of the shape such as its length, width
       depends upon the type of the shape
     * Returns shape, object of the created shape
     */
    public static Shape createShape(int id, Shape.ShapeType type, Point point, List<Double> parameters) 
    {
        Shape shape = null;
        switch (type) 
        {
            case RECTANGLE:
                shape = new Rectangle(id, type, point, parameters);
                break;
            case CIRCLE:
                shape = new Circle(id, type, point, parameters);
                break;
            case SQUARE:
                shape = new Square(id, type, point, parameters);
                break;
            case TRIANGLE:
                shape = new Triangle(id, type, point, parameters);
                break;
            default:
                throw incorrectShape;
        }
        return shape;
    }

}
