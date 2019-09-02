
/**
 * @author Babulal Jangir
 *	POJO class represents Top category details with their child count
 */
public class TopCategoryDetail {
    private String name;
    private int numberOfChildren;
    
    /**
     * @return name of category
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method to set category name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return numberOfChildren
     */
    public int getNumberOfChildren() {
        return numberOfChildren;
    }
    
    /** 
     * Method to set numberOfChildren of a category
     * @param numberOfChildren
     */
    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
    

}