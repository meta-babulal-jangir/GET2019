import java.util.ArrayList;


public class UseSparseMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Element> elementsOfSparseMatrix=new ArrayList<Element>();
		elementsOfSparseMatrix.add(new Element(0,0,1));
		elementsOfSparseMatrix.add(new Element(0,2,2));
		elementsOfSparseMatrix.add(new Element(1,2,3));
		SparseMat matrix1=new SparseMat(2,3,elementsOfSparseMatrix);
		matrix1.getSparse();
		for(int i=0;i<matrix1.getSparse().size();i++){
			System.out.print(matrix1.getSparse().get(i).getRow()+"	");
			System.out.print(matrix1.getSparse().get(i).getColumn()+"	");
			System.out.println(matrix1.getSparse().get(i).getValue());
		}
		System.out.println("\n\n");
		SparseMat matrix2=matrix1.getTranspose();
		for(int i=0;i<matrix2.getSparse().size();i++){
			System.out.print(matrix2.getSparse().get(i).getRow()+"	");
			System.out.print(matrix2.getSparse().get(i).getColumn()+"	");
			System.out.println(matrix2.getSparse().get(i).getValue());
	     }
		
		
		
		elementsOfSparseMatrix=new ArrayList<Element>();
		elementsOfSparseMatrix.add(new Element(0,2,2));
		elementsOfSparseMatrix.add(new Element(1,0,1));
		elementsOfSparseMatrix.add(new Element(1,1,1));
		SparseMat matrix3=new SparseMat(2,3,elementsOfSparseMatrix);
		System.out.println("\n\n");
		System.out.println(matrix3.isSymmetric());
		
		
		
		System.out.println("Addition check");
		matrix1=matrix1.add(matrix1,matrix3);
		for(int i=0;i<matrix1.getSparse().size();i++){
			System.out.print(matrix1.getSparse().get(i).getRow()+"	");
			System.out.print(matrix1.getSparse().get(i).getColumn()+"	");
			System.out.println(matrix1.getSparse().get(i).getValue());
		}
		
		
		
		System.out.println("Geting Normal matrix");
		int[][] norMatrix=matrix1.getMatrix(matrix2);
		for(int i=0;i<norMatrix.length;i++){
			for(int j=0;j<norMatrix[0].length;j++)
				System.out.print(norMatrix[i][j]+"	");
			System.out.println();
		}
		
		
		
		System.out.println("Getting sparse Matrix ");
		matrix1=matrix1.toSparseMatrix(norMatrix);
		System.out.println("Size Matrix1 "+matrix1.getTotalRow()+"   "+matrix1.getTotalColumn());
		System.out.println("Size Matrix3 "+matrix3.getTotalRow()+"   "+matrix3.getTotalColumn());
		for(int i=0;i<matrix1.getSparse().size();i++){
			System.out.print(matrix1.getSparse().get(i).getRow()+"	");
			System.out.print(matrix1.getSparse().get(i).getColumn()+"	");
			System.out.println(matrix1.getSparse().get(i).getValue());
		}
		
		
		
		System.out.println("Multiplication check");
		matrix1=matrix1.multiply(matrix1,matrix3);
		for(int i=0;i<matrix1.getSparse().size();i++){
			System.out.print(matrix1.getSparse().get(i).getRow()+"	");
			System.out.print(matrix1.getSparse().get(i).getColumn()+"	");
			System.out.println(matrix1.getSparse().get(i).getValue());
		}
}
}