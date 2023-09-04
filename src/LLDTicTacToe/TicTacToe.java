package LLDTicTacToe;

import LLDTicTacToe.Model.*;
import com.sun.tools.javac.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public Board gameBoard;
    Deque <Player> players;
    public TicTacToe () {

    }
    public void initialise () {
        // Take input from here of no of players and board;
        players = new LinkedList<>();
        PlayingPiece crossPiece = new PlayingPieceX();
        PlayingPiece noughtPiece = new PlayingPieceO();
        Player player1 = new Player(crossPiece, "reaped");
        Player player2 = new Player(noughtPiece, "sudo");
        players.addLast(player1);
        players.addLast(player2);
        this.gameBoard = new Board(3);
    }
    String playGame () {
        String winner;
        while (true) {
            // Take input of the cell where the player is placing his piece;
            gameBoard.printBoard();
            Player playerTurn = players.removeFirst();
            List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                winner = "DRAW";
                break;
            }
            System.out.print("Player:" + playerTurn.getPlayerName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            if (!gameBoard.assignCell(inputRow, inputColumn, playerTurn.pieceType)) {
                players.addFirst(playerTurn);
                System.out.println("The selected cell is an occupied cell, Please retry\n");
                continue;
            }
            if (gameBoard.checkWin(inputRow, inputColumn)) {
                winner = playerTurn.getPlayerName();
                break;
            }
            players.addLast(playerTurn);
        }
        return winner;
    }
}
