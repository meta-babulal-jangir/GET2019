/**
 * @author Babulal Jangir
 * Class perform operation on sparse Matrix 
 */
import java.util.ArrayList;

public class SparseMat {
	private int totalRow;
	private int totalColumn;
	private ArrayList<Element> elements = null;

	/**
	 * Constructor to initialize Sparse Matrix
	 * 
	 * @param totalRow
	 * @param totalColumn
	 * @param sparse
	 */
	public SparseMat(int totalRow, int totalColumn, ArrayList<Element> elements) {
		this.totalRow = totalRow;
		this.totalColumn = totalColumn;
		this.elements = elements;
	}

	/**
	 * @param sparseMatrix
	 *            is Sparse Matrix
	 * @return Transpose of Sparse Matrix
	 */
	public SparseMat getTranspose() {
		ArrayList<Element> elementsToInsert = new ArrayList<Element>();
		for (int i = 0; i < elements.size(); i++) {
			elementsToInsert.add(new Element(this.getSparse().get(i)
					.getColumn(), this.getSparse().get(i).getRow(), this
					.getSparse().get(i).getValue()));
		}
		return new SparseMat(this.getTotalColumn(), this.getTotalRow(),
				elementsToInsert);
	}

	/**
	 * @param sparseMatrix
	 * @return true if Sparse matrix is symmetric otherwise false
	 */
	public boolean isSymmetric() {
		boolean flgToMatchedValue = false;
		SparseMat transposeOfSparseMatrix = this.getTranspose();
		if (this.getTotalRow() != transposeOfSparseMatrix.getTotalRow()
				|| this.getTotalColumn() != transposeOfSparseMatrix
						.getTotalColumn())
			return false;
		else {
			Element inputElement = null;
			for (int i = 0; i < this.getSparse().size(); i++) {
				inputElement = this.getSparse().get(i);
				for (int j = 0; j < transposeOfSparseMatrix.getSparse().size(); j++) {
					if (inputElement.getRow() == (transposeOfSparseMatrix
							.getSparse().get(j)).getRow()
							&& inputElement.getColumn() == (transposeOfSparseMatrix
									.getSparse().get(j)).getColumn()
							&& inputElement.getValue() == (transposeOfSparseMatrix
									.getSparse().get(j)).getValue())
						flgToMatchedValue = true;
				}
				if (!flgToMatchedValue)
					return false;
			}
			return true;
		}
	}

	/**
	 * @param matrix1
	 * @param matrix2
	 * @return addition of matrix1 and matrix2
	 */
	public SparseMat add(SparseMat matrix1, SparseMat matrix2) {
		ArrayList<Element> sparse1 = matrix1.getSparse();
		ArrayList<Element> sparse2 = matrix2.getSparse();
		ArrayList<Element> addedSparse = new ArrayList<Element>();
		if (matrix1.getTotalRow() != matrix2.getTotalRow()
				|| matrix1.getTotalColumn() != matrix2.getTotalColumn())
			throw new AssertionError("Size Must be equal");
		else {
			int rowOfSparse1 = 0, rowOfSparse2 = 0;
			while (rowOfSparse1 < sparse1.size()
					&& rowOfSparse2 < sparse2.size()) {
				if (sparse1.get(rowOfSparse1).getRow() < sparse2.get(
						rowOfSparse2).getRow()) {
					addedSparse.add(new Element(sparse1.get(rowOfSparse1)
							.getRow(), sparse1.get(rowOfSparse1).getColumn(),
							sparse1.get(rowOfSparse1).getValue()));
					rowOfSparse1++;
				} else if (sparse1.get(rowOfSparse1).getRow() > sparse2.get(
						rowOfSparse2).getRow()) {
					addedSparse.add(new Element(sparse2.get(rowOfSparse2)
							.getRow(), sparse2.get(rowOfSparse2).getColumn(),
							sparse2.get(rowOfSparse2).getValue()));
					rowOfSparse2++;
				} else {
					if (sparse1.get(rowOfSparse1).getColumn() < sparse2.get(
							rowOfSparse2).getColumn()) {
						addedSparse.add(new Element(sparse1.get(rowOfSparse1)
								.getRow(), sparse1.get(rowOfSparse1)
								.getColumn(), sparse1.get(rowOfSparse1)
								.getValue()));
						rowOfSparse1++;
					} else if (sparse1.get(rowOfSparse1).getColumn() > sparse2
							.get(rowOfSparse2).getColumn()) {
						addedSparse.add(new Element(sparse2.get(rowOfSparse2)
								.getRow(), sparse2.get(rowOfSparse2)
								.getColumn(), sparse2.get(rowOfSparse2)
								.getValue()));
						rowOfSparse2++;
					} else {
						addedSparse.add(new Element(sparse1.get(rowOfSparse1)
								.getRow(), sparse1.get(rowOfSparse1)
								.getColumn(), (sparse1.get(rowOfSparse1)
								.getValue() + sparse2.get(rowOfSparse2)
								.getValue())));
						rowOfSparse1++;
						rowOfSparse2++;
					}
				}

			}
			for (; rowOfSparse1 < sparse1.size(); rowOfSparse1++) {
				addedSparse.add(new Element(sparse1.get(rowOfSparse1).getRow(),
						sparse1.get(rowOfSparse1).getColumn(), sparse1.get(
								rowOfSparse1).getValue()));
			}
			for (; rowOfSparse2 < sparse2.size(); rowOfSparse2++) {
				addedSparse.add(new Element(sparse2.get(rowOfSparse2).getRow(),
						sparse2.get(rowOfSparse2).getColumn(), sparse2.get(
								rowOfSparse2).getValue()));
			}

		}
		return new SparseMat(matrix1.getTotalRow(), matrix1.getTotalColumn(),
				addedSparse);
	}
	/**
	 * @param matrix1
	 * @param matrix2
	 * @return multiplication of matrix1 and matrix2
	 */
	public SparseMat multiply(SparseMat matrix1,SparseMat matrix2){
		int[][] normMatrix1 = getMatrix(matrix1);
		int[][] normMatrix2 = getMatrix(matrix2);
		if (matrix1.getTotalColumn() != matrix2.getTotalRow())
			throw new AssertionError("Column of Matrix1 and Row of Matrix2 Must be equal");
		int[][] multipliedMtrix = new int[matrix1.getTotalRow()][matrix2.getTotalColumn()];
		for(int i=0;i<multipliedMtrix.length;i++){
			for(int j=0;j<normMatrix2.length;j++){
				if(normMatrix1[i][j]!=0){
					for(int k=0;k<normMatrix2[0].length;k++){
						multipliedMtrix[i][k]+=normMatrix1[i][j]*normMatrix2[j][k];
					}
				}
			}
		}
		return toSparseMatrix(multipliedMtrix);
	}
    /**
     * @param sparseMatrix
     * @return normal matrix
     */
    public int[][] getMatrix(SparseMat sparseMatrix){
    	int counterForElementInSparseMatrix=0;
    	int[][] normalMatrix=new int[sparseMatrix.getTotalRow()][sparseMatrix.getTotalColumn()];
    	for(int i=0;i<sparseMatrix.getTotalRow();i++){
    		for(int j=0;j<sparseMatrix.getTotalColumn();j++){
    			if(counterForElementInSparseMatrix<sparseMatrix.getSparse().size() && sparseMatrix.getSparse().get(counterForElementInSparseMatrix).getRow()==i && sparseMatrix.getSparse().get(counterForElementInSparseMatrix).getColumn()==j){
    				normalMatrix[i][j]=sparseMatrix.getSparse().get(counterForElementInSparseMatrix).getValue();
    				counterForElementInSparseMatrix++;
    			}
    			else{
    				normalMatrix[i][j]=0;
    			}    				
    		}
    	}
    	return normalMatrix;
    }
    /**
     * @param normalMatrix
     * @return sparse Matrix
     */
    public SparseMat toSparseMatrix(int[][] normalMatrix) {
    	ArrayList<Element> sparse=new ArrayList<Element>();
    	for(int i=0;i<normalMatrix.length;i++){
    		for(int j=0;j<normalMatrix[0].length;j++)
    			if(normalMatrix[i][j]!=0){
    				sparse.add(new Element(i,j,normalMatrix[i][j]));
    		}
    	}
    	return new SparseMat(normalMatrix.length,normalMatrix[0].length,sparse); 
    }
	/**
	 * @return total number of row in sparse Matrix
	 */
	public int getTotalRow() {
		return this.totalRow;
	}

	/**
	 * @return total number of column in sparse Matrix
	 */
	public int getTotalColumn() {
		return this.totalColumn;
	}

	/**
	 * @return total number of non zero value in sparse Matrix
	 */
	public ArrayList<Element> getSparse() {
		return this.elements;
	}

}