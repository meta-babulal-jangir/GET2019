public class NQueen {
     /** 
      * Method to print Solved n-queen problem
      * Parameter board is array of n*n board 
      * Parameter dimention is size of board array
      * Returns true if item inserted otherwise false
      */
	    static void printBoard(int board[][],int dimention) 
     {
	        int i;
	        for (i = 0; i < dimention; i++)
         {
	            for (int j = 0; j < dimention; j++)
	                if (board[i][j] == 1) 
                 {
		                   System.out.print("1\t");
		               } 
                 else 
                 {
		                   System.out.print("0\t");
		               }
		               System.out.println("\n");
	        }
	    }
     /** 
      * Method to place queen in board array
      * It puts queen as 1 in the board array 
      * Parameter row is row and col is column of board where to place queen
      * Returns true if queen placed in board otherwise false
      */
	    static boolean toPlaceOrNotToPlace(int board[][], int row, int col) 
     {
		       int i, j;
		       for (i = 0; i < col; i++) 
         {
             if (board[row][i] == 1)
			             	return false;
		       }
		      for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
        {
			          if (board[i][j] == 1)
				             return false;
		      }
		     for (i = row, j = col; j >= 0 && i < board.length; i++, j--) 
       {
			         if (board[i][j] == 1)
				            return false;
		     }
		     return true;
	    }
     /** 
      * Method to place queen in board array
      * It puts queen as 1 in the board array 
      * Parameter col is column of board where to place queen column starts from 0
      * Returns true if queen placed in board otherwise false
      */
	     static boolean nQueen(int board[][], int col,int dimention) 
      {
		        if (col >= dimention)
			           return true;
		        for (int i = 0; i < dimention; i++) 
          {
			           if (toPlaceOrNotToPlace(board, i, col)) 
              {
				              board[i][col] = 1;
				              if (nQueen(board, col + 1,dimention))
					                 return true;
				              board[i][col] = 0;
			           }
		        }
		        return false;
	     }
}
