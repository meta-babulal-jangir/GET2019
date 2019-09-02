/**
 * @author Babulal Jangir
 * This is utility class to store queries.

 */
public class Query {
    
    /**
     * Returns query to fetch all order details of a user which are in shipped state.
     * @param userId contains Id of user whose order to be fetched. 
     * @return query
     */
    public static String getOrderDetailQuery(int userId)
    {
        String query="select order_id,order_date,total_price From orders where order_id IN"
        	    + "(select orderedproducts.order_id from orderedProducts Where orderedproducts.status='shipped')"
        	    + " And user_id=" + userId + " order by orders.order_date ASC";
        return query;
    }
    
    /**
     * Returns query to insert five or more images of a product using batch insert technique.
     * @return query
     */
    public static String getInsertImageQuery()
    {
        String query="INSERT INTO Product_image(product_id,image_url) values(?, ?)";
        return query;
    }
    
    /**
     * Returns query to mark inactive status for all products which were not ordered by any Shopper in last 1 year.
     * @return query
     */
    public static String getUpdateProductStatusQuery()
    {
        String query="UPDATE Product "
                + "SET product.status='inactive' "
                + "WHERE product.product_id NOT IN( "
                + "SELECT orderedproducts.product_id  FROM orderedProducts,orders WHERE orders.order_id=orderedproducts.order_id  "
                                + "AND TIMESTAMPDIFF(YEAR,orders.order_date,CURDATE())<=1) ";
        return query;
    }
    
    /**
     * Returns query to select the category title of all top parent categories sorted alphabetically and the count of their child categories.
     * @return query
     */
    public static String getTopCategoryDetails()
    {
        String query="select c.category_name,COUNT(c.category_id) AS numberOfChildren  "
        	    + "FROM category c LEFT JOIN category cat ON c.category_id=cat.parent_id WHERE c.parent_id=0 "
        	    + "GROUP BY c.category_name ORDER BY c.category_name";
        return query;
    }

}