package Problem3;

/**
 * @author Babulal Jangir
 *
 */
public class Element {
	private char symbol;
	private int base;

	/**
	 * @param symbol is alphabetic symbol of Element
	 * @param base is base of element
	 */
	public Element(char symbol, int base) {
		this.symbol = symbol;
		this.base = base;
	}

	/**
	 * @return alphabetic symbol of Element
	 */
	public char getSymbol() {
		return symbol;
	}

	/**
	 * Method to update symbol of Element
	 * @param symbol is alphabetic symbol of Element
	 */
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the base of element
	 */
	public int getBase() {
		return base;
	}

	/**
	 * Method update the base of Element
	 * @param base 
	 */
	public void setBase(int base) {
		this.base = base;
	}

}