/**
 * @author Babulal Jangir POJO class represents Image for a product.
 */
public class ProductImage {
	private int productId;
	private String imageUrl;

	/**
	 * @param productId
	 * @param imageUrl
	 */
	public ProductImage(int productId, String imageUrl) {
		this.productId = productId;
		this.imageUrl = imageUrl;
	}

	/**
	 * @return productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * Method to set product Id
	 * @param productId
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * Method to set image URl
	 * @param imageUrl
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}