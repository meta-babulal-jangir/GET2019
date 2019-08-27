
/**
 * @author Babulal Jangir
 * Class contains information about an Element of Sparse Matrix
 */
public class Element {
	private int rowNumber;
	private int columnNumber;
	private int value;
	/**
	 * Constructor to initial Element information 
	 * @param row
	 * @param column
	 * @param value
	 */
	public Element(int row,int column,int value){
		this.rowNumber=row;
		this.columnNumber=column;
		this.value=value;
	}
	/**
	 * @return row of Element
	 */
	public int getRow(){
		return this.rowNumber;
	}
	/**
	 * @return column of Element
	 */
	public int getColumn(){
		return this.columnNumber;
	}
	/**
	 * @return value of Element
	 */
	public int getValue(){
		return this.value;
	}
}