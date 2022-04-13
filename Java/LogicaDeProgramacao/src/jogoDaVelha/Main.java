package jogoDaVelha;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Criar um jogo da velha

		String player = "X";
		boolean winner = false;

		String[][] table = { { "0", "1", "2" }, { "3", "4", "5" }, { "6", "7", "8" } };

		do {
			String local = mountTable(table, player);

			String var = putPlayerInTable(table, player, local);

			if (var == "null") {
				JOptionPane.showMessageDialog(null, "Alguém já jogou nesse lugar ou não pertence ao tabuleiro.");
			} else {
				verifyWinner(table, player);
				verifyDraw(table);
				if (player == "X") {
					player = "O";
				}
				else {
					player =  "X";
				}
			}

		} while (!winner);

	}

	private static String mountTable(String[][] table, String player) {
		return JOptionPane.showInputDialog(null,
				"É a vez de " + player + "\n" 
						+ table[0][0] + " | " + table[0][1] + " | " + table[0][2] + "\n"
						+ table[1][0] + " | " + table[1][1] + " | " + table[1][2] + "\n" 
						+ table[2][0] + " | " + table[2][1] + " | " + table[2][2]);
	}

	private static String changePlayer(String player) {
		if (player == "X") {
			return "O";
		}
		else {
			return "X";
		}
	}

	private static String putPlayerInTable(String[][] table, String player, String local) {
		switch (local) {
		case "0": {
			if (table[0][0] == "X" || table[0][0] == "O")
				return "null";
			return table[0][0] = player;
		}
		case "1": {
			if (table[0][1] == "X" || table[0][1] == "O")
				return "null";
			return table[0][1] = player;
		}
		case "2": {
			if (table[0][2] == "X" || table[0][2] == "O")
				return "null";
			return table[0][2] = player;
		}
		case "3": {
			if (table[1][0] == "X" || table[1][0] == "O")
				return "null";
			return table[1][0] = player;
		}
		case "4": {
			if (table[1][1] == "X" || table[1][1] == "O")
				return "null";
			return table[1][1] = player;
		}
		case "5": {
			if (table[1][2] == "X" || table[1][2] == "O")
				return "null";
			return table[1][2] = player;
		}
		case "6": {
			if (table[2][0] == "X" || table[2][0] == "O")
				return "null";
			return table[2][0] = player;
		}
		case "7": {
			if (table[2][1] == "X" || table[2][1] == "O")
				return "null";
			return table[2][1] = player;
		}
		case "8": {
			if (table[2][2] == "X" || table[2][2] == "O")
				return "null";
			return table[2][2] = player;
		}
		default:
			return "null";
		}

	}

	private static void verifyWinner(String[][] table, String player) {
		// Possibles ways to win:
		// * Horizontally 	- 0 = 1 = 2 | 3 = 4 = 5 | 6 = 7 = 8
		// * Vertically 	- 0 = 3 = 6 | 1 = 4 = 7 | 2 = 5 = 8
		// * Diagonal 		- 0 = 4 = 8 | 2 = 4 = 6		
		
		if(	
			// Horizontal
			table[0][0] == table[0][1] && table[0][1] == table[0][2]||
			table[1][0] == table[1][1] && table[1][1] == table[1][2]||
			table[2][0] == table[2][1] && table[2][1] == table[2][2]||
			// Vertical
			table[0][0] == table[1][0] && table[1][0] == table[2][0]||
			table[0][1] == table[1][1] && table[1][1] == table[2][1]||
			table[0][2] == table[1][2] && table[1][2] == table[2][2]||
			// Diagonal
			table[0][0] == table[1][1] && table[1][1] == table[2][2] ||
			table[0][2] == table[1][1] && table[1][1] == table[2][0]) {
		
			JOptionPane.showMessageDialog(null, "Parabéns o jogador " + player + " ganhou!" + "\n"
				+ table[0][0] + " | " + table[0][1] + " | " + table[0][2] + "\n"
				+ table[1][0] + " | " + table[1][1] + " | " + table[1][2] + "\n" 
				+ table[2][0] + " | " + table[2][1] + " | " + table[2][2]);
			System.exit(0);
		} 
	}
	
	private static void verifyDraw(String[][] table) {
		if( // Verify draw
				table[0][0] != "0" && table[0][1] != "1" && table[0][2] != "2" &&
				table[1][0] != "3" && table[1][1] != "4" && table[1][2] != "5" &&
				table[2][0] != "6" && table[2][1] != "7" && table[2][2] != "8") {
				JOptionPane.showMessageDialog(null, "Deu velha!" + "\n"
					+ table[0][0] + " | " + table[0][1] + " | " + table[0][2] + "\n"
					+ table[1][0] + " | " + table[1][1] + " | " + table[1][2] + "\n" 
					+ table[2][0] + " | " + table[2][1] + " | " + table[2][2]);
				System.exit(0);
			}
	}
}
