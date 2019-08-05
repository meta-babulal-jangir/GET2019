public class UseNQueen{
    public static void main(String[] args) 
    {
		int[][] board = new int[4][4];
		if (!NQueen.nQueen(board, 0,4)) {
			System.out.println("Solution not found.");
		}
		NQueen.printBoard(board,4);
    }
}
