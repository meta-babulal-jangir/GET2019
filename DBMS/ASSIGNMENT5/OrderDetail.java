import java.sql.*;

/**
 * @author Babulal Jangir POJO class of order of user
 */
public class OrderDetail {
	private int orderId;
	private Date orderDate;
	private double totalPrice;

	/**
	 * @return id of order
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * Method to set order Id
	 * @param orderId
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * Method to set order Date
	 * @param orderDate
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return totalPrice
	 */
	public double getOrderTotal() {
		return totalPrice;
	}

	/**
	 * Method to set order totalPrice
	 * @param totalPrice
	 */
	public void setOrderTotal(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}