package com.scytalys.codelearn.exersices;

import java.util.Scanner;

public class Game {
    private final Scanner scan;
    private final Board board;
    private final char[] player;

    public Game() {
        running = true;
        scan = new Scanner(System.in);
        board = new Board();
        player = new char[2];
    }

    public void start() {
        System.out.println("You are playing TicTacToe");
        board.printBoard();
        player[0] = 'X';
        player[1] = 'O';

        char currentPlayer = player[0];
        while (!board.isTicTacToe(currentPlayer)) {
            System.out.println("Player " + currentPlayer + " your turn!\nEnter your move");
            try {
                int move = Integer.parseInt(scan.next());
                board.makeMove(currentPlayer, move);
                board.printBoard();
                currentPlayer = currentPlayer == player[1] ? player[0] : player[1];
            } catch (NumberFormatException nfe) {
                System.out.println("Not a number");
            } catch (NotAvailableMoveException nam) {
                System.out.println("Can't move there " + nam.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
