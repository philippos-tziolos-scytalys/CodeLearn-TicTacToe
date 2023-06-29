package com.scytalys.codelearn.exersices;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Board {
    private final char[][] board = {{' ', '1', ' ', '|', ' ', '2', ' ', '|', ' ', '3', ' '},
            {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
            {' ', '4', ' ', '|', ' ', '5', ' ', '|', ' ', '6', ' '},
            {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
            {' ', '7', ' ', '|', ' ', '8', ' ', '|', ' ', '9', ' '}};

    private final Set<Integer> availableMoves = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public void printBoard() {
        System.out.println("\nThe available moves are: " + availableMoves);
        for (char[] row : board) {
            System.out.println(row);
        }
    }

    public void makeMove(char mark, int move) throws NotAvailableMoveException {
        if (availableMoves.contains(move)) {
            switch (move) {
                case 1 -> board[0][1] = mark;
                case 2 -> board[0][5] = mark;
                case 3 -> board[0][9] = mark;
                case 4 -> board[2][1] = mark;
                case 5 -> board[2][5] = mark;
                case 6 -> board[2][9] = mark;
                case 7 -> board[4][1] = mark;
                case 8 -> board[4][5] = mark;
                case 9 -> board[4][9] = mark;
            }
            availableMoves.remove(move);
        } else {
            throw new NotAvailableMoveException();
        }
    }

    public boolean isTicTacToe() {
        if (board[0][1] == board[0][5] && board[0][1] == board[0][9]) {
            return true;
        } else if (board[2][1] == board[2][5] && board[2][1] == board[2][9]) {
            return true;
        } else if (board[4][1] == board[4][5] && board[4][1] == board[4][9]) {
            return true;
        } else if (board[0][1] == board[2][1] && board[0][1] == board[4][1]) {
            return true;
        } else if (board[0][5] == board[2][5] && board[0][5] == board[4][5]) {
            return true;
        } else if (board[0][9] == board[2][9] && board[0][9] == board[4][9]) {
            return true;
        } else if (board[0][1] == board[2][5] && board[0][1] == board[4][5]) {
            return true;
        } else if (board[4][1] == board[2][5] && board[4][1] == board[0][9]) {
            return true;
        } else if (availableMoves.isEmpty()) {
            return false;
        } else {
            return false;
        }
    }

    public boolean isTicTacToe(char currentPlayer) {
        if (board[0][1] == board[0][5] && board[0][1] == board[0][9]) {
            System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
            return true;
        } else if (board[2][1] == board[2][5] && board[2][1] == board[2][9]) {
            System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
            return true;
        } else if (board[4][1] == board[4][5] && board[4][1] == board[4][9]) {
            System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
            return true;
        } else if (board[0][1] == board[2][1] && board[0][1] == board[4][1]) {
            System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
            return true;
        } else if (board[0][5] == board[2][5] && board[0][5] == board[4][5]) {
            System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
            return true;
        } else if (board[0][9] == board[2][9] && board[0][9] == board[4][9]) {
            System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
            return true;
        } else if (board[0][1] == board[2][5] && board[0][1] == board[4][9]) {
            System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
            return true;
        } else if (board[4][1] == board[2][5] && board[4][1] == board[0][9]) {
            System.out.println("Player " + currentPlayer + " Congratulations, you won!!!");
            return true;
        } else if (availableMoves.isEmpty()) {
            System.out.println("Wow it's a tie!");
            return true;
        } else {
            return false;
        }
    }

}
