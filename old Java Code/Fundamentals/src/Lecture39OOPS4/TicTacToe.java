package Lecture39OOPS4;

import java.util.Scanner;

public class TicTacToe {
	
	
	private player player1,player2;
	private Board board;
	private int numPlayers;
	
	public static void main(String[] args) {
		//creating tictactoe object
		TicTacToe t = new TicTacToe();
		t.startGame();
	}
	
	public void startGame() {
		Scanner s = new Scanner(System.in);
		//take player input
		player1 = takePlayerInput(++numPlayers);
		player2 = takePlayerInput(++numPlayers);
		while(player1.getSymbol() == player2.getSymbol()) {
			System.out.println("Symbol already Taken!! please enter the symbol again");
			player2.setSymbol(s.next().charAt(0));
		}
		//create the board
		board = new Board(player1.getSymbol(),player2.getSymbol());
		boolean player1turn = true;
		int status = Board.INVALIDMOVE;
		while(status == Board.INVALIDMOVE || status == Board.INCOMPLETEMOVE) {
			if(player1turn) {
				System.out.println("Player 1 - " + player1.getName()+"'s turn ");
				System.out.println("Enter x:");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				
				status = board.move(player1.getSymbol(),x,y);
				if(status == Board.INVALIDMOVE) {
					System.out.println("Invalid move!! please try again !!");
					continue;
				}
			}else {
				System.out.println("Player 2 - " + player2.getName()+"'s turn ");
				System.out.println("Enter x:");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				
				status = board.move(player2.getSymbol(),x,y);
				
				if(status == Board.INVALIDMOVE) {
					System.out.println("Invalid move!! please try again !!");
					continue;
				}
			}
				player1turn = !player1turn;
				board.print();
		}
		if(status == Board.PLAYER1WIN) {
			System.out.println("player 1 - "+ player1.getName() + " win!! ");
		}else if(status == Board.PLAYER2WIN) {
			System.out.println("player 2 - "+ player2.getName() + " win!! ");
		}else {
			System.out.println("Draw !!");
		}
		//play the game
	}
	
	private player takePlayerInput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter "+num+" name : ");
		String name = s.nextLine();
		System.out.println("Enter "+num+" symbol: ");
		char symbol = s.next().charAt(0);
		player p = new player(name,symbol);
		return p;
	}
	
}
