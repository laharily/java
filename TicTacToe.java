import java.util.Scanner;

public class TicTacToe {
	
	private char[][] board;
	private char player; // 'X' or 'O'
	
	/* 
	 * Instantiate board to be a 3 by 3 char array of spaces.
	 * Set player to be 'X'.
	 */
	public TicTacToe() {
		/*
		* Step 1: create an empty board, with an initial value
		* of a space (' ')
		*/
		board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = ' ';
			}
		}
		player = 'X';
	}
	
	/* 
	 * If s represents a valid move, add the current player's symbol to the board and return true.
	 * Otherwise return false.
	 */
	public boolean play(String s) {
		/* Step 2: Fill in here with your own
		* play logic, and replace the return with your
		* own. s will be like A2 or B3.
		*/ 
		if (s == null || s.length() != 2) {
			// System.out.println("Invalid input");
			return false;
		}
		String rowStr = s.substring(0,1);
		int row;
		if (rowStr.equals("A")) { row = 0; }
		else if (rowStr.equals("B")) { row = 1; }
		else if (rowStr.equals("C")) { row = 2; }
		else { 
			// System.out.println("Invalid row");
			return false; 
		}
		int column;
		try { 
			column = Integer.valueOf(s.substring(1));
		} catch(NumberFormatException ne) {
			// System.out.println("Invalid column");
			return false;
		}
		if (column < 1 || column > 3) { 
			// System.out.println("Invalid column");
			return false; 
		}
		if (board[row][column-1] == ' ') { 
			board[row][column-1] = player;
			return true;
		}
		return false;
	}
	
	/*
	 * Switches the current player from X to O, or O to X.
	 */
	public void switchTurn() {
		// Step 3: Fill in with your code to toggle between
		// 'X' and 'O'
		player = (player == 'X') ? 'O' : 'X';
	}

	/*
	 * Returns true if the current player has won the game.
	 * Three in a row, column or either diagonal.
	 * Otherwise, return false.
	 */
	public boolean won() {
		/* Step 5: Fill in the code for the won method. This method
        * should return true if the current player has 3 in-a-row 
		* in any row, column or diagonal. Otherwise, return false.
		*/
		for (int i = 0; i < board.length; i++) { // checking row
			if (board[i][0] != ' ')  { 
				if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) { 
					// System.out.println(player + " won in a row");
					return true;
				}
			}
		}
		for (int j = 0; j < board.length; j++) { // checking column
			if (board[0][j] != ' ')  { 
				if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) { 
					// System.out.println(player + " won in a column");
					return true;
				}
			}
		}
		// checking diagonals
		if (board[1][1] != ' ') {
			if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) { 
				// System.out.println(player + " won diagonally"); 
				return true; 
			}
			if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) { 
				// System.out.println(player + " won diagonally");
				return true;
			}
		}
		
		return false; 
	}
	
	/*
	 * Returns true if there are no places left to move
	 */
	public boolean stalemate() {
	    /*
		 * Step 4: Fill in the code for the stalemate method. It
         * should return true if there are no more places to move 
		 * on the board. Otherwise, return false. 
		 */
	    for (char[] arr : board) {
	    	for (char element : arr)
	    		if (element == ' ') { 
	    			return false;
	    		}
	    }
		return true;
	}

	public char getPlayer() {
		return player;
	}

	public void print() {
		System.out.println();
		System.out.println("\t  1 2 3");
		System.out.println();
		System.out.println("\tA "+board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
		System.out.println("\t  -----");
		System.out.println("\tB "+board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
		System.out.println("\t  "+"-----");
		System.out.println("\tC "+board[2][0]+"|"+board[2][1]+"|"+board[2][2]);
		System.out.println();
	}
	
	/* 
	 * Step 6: Main Method for Final Step - Delete your main method 
	 * and uncomment this one. 
	 * Runs the game by getting input from the user, making the 
	 * appropriate moves, and prints who won or if it was a stalemate. 
	*/ 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		System.out.println("\nWelcome to tic-tac-toe!");
		System.out.println("Enter coordinates for your move following the X and O prompts (eg. A1):");
		
		while(!game.stalemate()) {
			game.print();
			
			//Prompt player for their move
			System.out.print(game.getPlayer() + ": ");
			
			//Loop while the method play does not return true when given their move.
			//Body of loop should ask for a different move
			while(!game.play(in.next())) {
				System.out.println("Illegal move. Enter a different move.");
				System.out.print(game.getPlayer() + ": ");
			}
						
			//If the game is won, call break; 
			if (game.won()) { break; }
						
			//Switch the turn
			game.switchTurn();
		}
		game.print();
		if (game.won()) {
			System.out.println("Player " + game.getPlayer() + " Wins!!!!\n");
		} 
		else {
			System.out.println("Stalemate");
		}
	} 
}
