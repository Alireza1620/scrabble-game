public class ScrabbleBoardPrinter {
	
	
 public static void printBoard(char[][] board) {
	 System.out.println("+"+"-".repeat((board.length*2)+1)+"+");
	
	 for (int i=0; i<board.length ; i++) {
	 System.out.print("|");
		 for(int j=0; j<board.length ; j++) {
			 System.out.print(" "+board[i][j]);
		 }
	 System.out.println(" |");
	 }
	 
	 
	 System.out.println("+"+"-".repeat((board.length*2)+1)+"+");	
 }
}





