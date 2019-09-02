import java.util.*;
import java.sql.*;
import java.sql.Date;

/**
 * @author Babulal Jangir
 *
 */
public class DatabaseHelper {
	/**
	 * Method to fetch all orders of a particular user
	 * @param userId
	 * @return orderList
	 */
	public static List<OrderDetail> getOrderDetails(int userId) {
		List<OrderDetail> listOfOrders = new ArrayList<OrderDetail>();
		String query = Query.getOrderDetailQuery(userId);
		Connection connection = null;
		try {
			connection = SQLConnection.getConnection("store_front");
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute select query and returns result set
			ResultSet rset = statement.executeQuery();
			while (rset.next()) {
				int orderId = rset.getInt("order_id");
				Date orderDate = rset.getDate("order_date");
				double orderTotal = rset.getDouble("total_price");
				OrderDetail orderDetail = new OrderDetail();
				orderDetail.setOrderId(orderId);
				orderDetail.setOrderDate(orderDate);
				orderDetail.setOrderTotal(orderTotal);
				listOfOrders.add(orderDetail);
				
			}
			connection.close();
			}
			catch (SQLException sqlException) {
			sqlException.printStackTrace();
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return listOfOrders;
	}

	/**
	 * This method is used to execute query to insert images for products.
	 * 
	 * @param listOfImage
	 */
	public static void insertImage(List<ProductImage> listOfImage) {
		String query = Query.getInsertImageQuery();
		Connection connection =null;
		try {
			connection = SQLConnection.getConnection("store_front");

			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query); 
			try {
				connection.setAutoCommit(false);
				int counter;
				for (ProductImage image : listOfImage) {
					counter=1;
					statement.setInt(counter++, image.getProductId());
					statement.setString(counter++, image.getImageUrl());
					statement.addBatch();
				}
				// multiple rows are inserted using batch insert technique
				statement.executeBatch();
				connection.commit();
				connection.close();
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
				connection.rollback();
			}
		} catch (SQLException exception) {
			exception.printStackTrace();
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method is used to execute query to mark inactive status for all
	 * products which were not ordered by any Shopper in last 1 year.
	 * 
	 * @return
	 */
	public static int updateProductStatus() {
		int updatedRows = 0;
		String query = Query.getUpdateProductStatusQuery();
		Connection connection =null;
		try {
			connection = SQLConnection.getConnection("store_front");
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute update query and return updated rows
			updatedRows = statement.executeUpdate();
			connection.close();
		} catch (SQLException sqlException) {
		sqlException.printStackTrace();
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return updatedRows;
	}


	/**
	 * This method is used to execute query to get top category details with
	 * their child count.
	 * 
	 * @return
	 */
	public static List<TopCategoryDetail> getTopCategoryDetails() {
		List<TopCategoryDetail> listOfTopCategoryDetail = new ArrayList<TopCategoryDetail>();
		String query = Query.getTopCategoryDetails();
		System.out.println(query);
		Connection connection =null;
		try {
			connection = SQLConnection.getConnection("store_front");
			// Allocate statement object in connection
			PreparedStatement statement = connection.prepareStatement(query);
			// execute select query and returns result set

			ResultSet rset = statement.executeQuery();
			while (rset.next()) {

				String categoryName = rset.getString("category_name");
				int numberOfChildren = rset.getInt("numberOfChildren");
				TopCategoryDetail topCategoryDetail = new TopCategoryDetail();
				topCategoryDetail.setName(categoryName);
				topCategoryDetail.setNumberOfChildren(numberOfChildren);
				listOfTopCategoryDetail.add(topCategoryDetail);
			}
				connection.close();
			} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listOfTopCategoryDetail;
	}
}