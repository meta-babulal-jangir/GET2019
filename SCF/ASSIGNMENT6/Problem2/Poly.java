package Problem2;

/**
 * @author Babulal Jangir class to perform operation on polynomial equations
 */
public class Poly {
	private int[] polyExpression;
	private int counter;

	/**
	 * @param polyExpression is equation in string form
	 */
	public Poly(String polyExpression) {
		this.polyExpression = toArrayPoly(polyExpression);
	}

	/**
	 * Method converts poly equation into array
	 * @param polyExpression is equation in string form
	 * @return array of poly equation 
	 */
	private int[] toArrayPoly(String polyExpression) {
		String[] splitedArray = polyExpression.split(" ");
		this.polyExpression = new int[2 * splitedArray.length];
		for (int i = 0; i < splitedArray.length; i++) {
			evaluateTerm(splitedArray[i]);
		}
		return this.polyExpression;
	}

	/**
	 * @param term is term of poly Equation in string form
	 */
	private void evaluateTerm(String term) {
		boolean flgToVariable = false;
		char symbol = term.charAt(0);
		int digit = 0;
		boolean flgEqual = false;
		for (int i = 0; i < term.length(); i++) {
			if (Character.isDigit(term.charAt(i)) && !flgToVariable)
				digit = digit * 10 + Character.digit(term.charAt(i), 15);
			else if (Character.isLetter(term.charAt(i))) {
				flgToVariable = true;
				if (digit == 0)
					digit = 1;
				if (symbol == '-')
					this.polyExpression[counter] = -digit;
				else
					this.polyExpression[counter] = digit;
				digit = 0;
			} else if (Character.isDigit(term.charAt(i)) && flgToVariable) {
				digit = digit * 10 + Character.digit(term.charAt(i), 15);
			} else if ('=' == term.charAt(i)) {
				if (!flgToVariable) {
					if (symbol == '-')
						this.polyExpression[counter] = -digit;
					else
						this.polyExpression[counter] = digit;
					digit = 0;

				}
				counter++;
				flgEqual = true;
				if (symbol == '-')
					this.polyExpression[counter] = -digit;
				else
					this.polyExpression[counter] = digit;
				digit = 0;
				break;
			}

		}
		if (Character.isLetter(term.charAt(term.length() - 1)))
			digit = 1;
		if (counter < polyExpression.length && !flgEqual) {
			counter++;
			this.polyExpression[counter] = digit;
		}
		if (counter < polyExpression.length && !flgEqual)
			counter++;

	}

	/**
	 * @param variableValue is value of variable
	 * @return result of Poly equation after applying variable value in double
	 */
	public double evaluate(double variableValue) {
		double result = 0.0;
		double termResult = 0.0;
		for (int i = 1; i < polyExpression.length; i += 2) {
			termResult = 0.0;
			termResult = Math.pow(variableValue, polyExpression[i]);
			if (polyExpression[i] != 0)
				termResult *= polyExpression[i - 1];
			else
				termResult = polyExpression[i - 1];
			result += termResult;
		}
		return result;
	}

	/**
	 * @return degree of poly Equation in integer
	 */
	public int degree() {
		int degree = polyExpression[1];
		for (int i = 3; i < polyExpression.length; i += 2) {
			if (degree < polyExpression[i])
				degree = polyExpression[i];
		}
		return degree;
	}

	/**
	 * Method perform addition operation between two Poly equation 
	 * @param equation1 is equation in string form 
	 * @param equation2 is equation in string form 
	 * @return addition of both equation in array form
	 */
	public int[] addPoly(Poly equation1, Poly equation2) {
		int[] eqationArray1 = equation1.getEquationArray();
		int[] eqationArray2 = equation2.getEquationArray();
		eqationArray1 = sort(eqationArray1);
		eqationArray2 = sort(eqationArray2);
		int[] addOfPoly = new int[eqationArray1.length + eqationArray2.length];
		for (int i = 0; i < eqationArray1.length; i++)
			addOfPoly[i] = eqationArray1[i];
		int indexToJoin = eqationArray1.length + 1;
		boolean added = false; // flag to check term added
		for (int i = 1; i < eqationArray2.length; i += 2) {
			added = false;
			for (int j = 1; j < eqationArray1.length; j += 2) {
				if (eqationArray2[i] == addOfPoly[j]) {
					addOfPoly[j - 1] += eqationArray2[i - 1];
					added = true;
					break;
				}
			}
			if (!added) {
				addOfPoly[indexToJoin - 1] = eqationArray2[i - 1];
				addOfPoly[indexToJoin] = eqationArray2[i];
				indexToJoin += 2;
			}
		}
		int[] newAddOfPoly = new int[indexToJoin - 1];
		for (int i = 0; i < newAddOfPoly.length; i++)
			newAddOfPoly[i] = addOfPoly[i];
		newAddOfPoly = sort(newAddOfPoly);
		return newAddOfPoly;

	}

	/**
	 Method perform multiplication operation between two Poly equation 
	 * @param equation1 is equation in string form 
	 * @param equation2 is equation in string form 
	 * @return  multiplication of both equation in array form
	 */
	public int[] multiplyPoly(Poly equation1, Poly equation2) {
		int[] eqationArray1 = equation1.getEquationArray();
		int[] eqationArray2 = equation2.getEquationArray();
		eqationArray1 = sort(eqationArray1);
		eqationArray2 = sort(eqationArray2);
		int[] multiplyOfPoly = new int[(eqationArray1.length * eqationArray2.length) / 2];
		for (int j = 1; j < eqationArray2.length; j += 2) {
			multiplyOfPoly[j - 1] = eqationArray1[0] * eqationArray2[j - 1];
			multiplyOfPoly[j] = eqationArray1[1] + eqationArray2[j];
		}
		int[] term2 = new int[eqationArray2.length];
		for (int i = 3; i < eqationArray1.length; i += 2) {
			for (int j = 1; j < eqationArray2.length; j += 2) {
				term2[j - 1] = eqationArray1[i - 1] * eqationArray2[j - 1];
				term2[j] = eqationArray1[i] + eqationArray2[j];
			}
			multiplyOfPoly = addPoly(multiplyOfPoly, term2);

		}
		int sizeOfMultiplyPoly = 0;
		for (int i = 0; i < multiplyOfPoly.length; i++) {
			if (multiplyOfPoly[i] != 0)
				sizeOfMultiplyPoly++;
		}
		if (sizeOfMultiplyPoly % 2 != 0) {
			sizeOfMultiplyPoly++;
		}
		int[] newMultiplyOfPoly = new int[sizeOfMultiplyPoly];
		int counterToFillTerm = 0;
		for (int i = 0; i < multiplyOfPoly.length; i++) {
			if (multiplyOfPoly[i] != 0) {
				newMultiplyOfPoly[counterToFillTerm] = multiplyOfPoly[i];
				counterToFillTerm++;
			}
		}
		return newMultiplyOfPoly;

	}

	/**
	 * @return equation array
	 */
	public int[] getEquationArray() {
		return this.polyExpression;
	}

	/**
	 * Method sorts an equation in descending form 
	 * @param equationToSort is equation array
	 * @return sorted  equation in array form
	 */
	public int[] sort(int[] equationToSort) {
		int tempCofficient = 0;
		int tempPower = 0;
		for (int i = 1; i < equationToSort.length - 2; i += 2) {
			if (equationToSort[i] < equationToSort[i + 2]) {
				tempCofficient = equationToSort[i - 1];
				tempPower = equationToSort[i];
				equationToSort[i - 1] = equationToSort[i + 1];
				equationToSort[i] = equationToSort[i + 2];
				equationToSort[i + 1] = tempCofficient;
				equationToSort[i + 2] = tempPower;
			}
		}
		return equationToSort;
	}

	/**
	 * Method perform addition operation between two Poly equation 
	 * @param equation1 is equation array
	 * @param equation2 is equation array
	 * @return addition of both equation in array form
	 */
	private int[] addPoly(int[] eqationArray1, int[] eqationArray2) {
		eqationArray1 = sort(eqationArray1);
		eqationArray2 = sort(eqationArray2);
		int[] addOfPoly = new int[eqationArray1.length + eqationArray2.length];
		for (int i = 0; i < eqationArray1.length; i++)
			addOfPoly[i] = eqationArray1[i];
		int indexToJoin = eqationArray1.length + 1;
		boolean added = false; // flag to check term added
		for (int i = 1; i < eqationArray2.length; i += 2) {
			added = false;
			for (int j = 1; j < eqationArray1.length; j += 2) {
				if (eqationArray2[i] == addOfPoly[j]) {
					addOfPoly[j - 1] += eqationArray2[i - 1];
					added = true;
					break;
				}
			}
			if (!added) {
				addOfPoly[indexToJoin - 1] = eqationArray2[i - 1];
				addOfPoly[indexToJoin] = eqationArray2[i];
				indexToJoin += 2;
			}
		}
		int[] newAddOfPoly = new int[indexToJoin - 1];
		for (int i = 0; i < newAddOfPoly.length; i++)
			newAddOfPoly[i] = addOfPoly[i];
		newAddOfPoly = sort(newAddOfPoly);
		return addOfPoly;

	}
}