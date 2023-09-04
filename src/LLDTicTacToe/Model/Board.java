package LLDTicTacToe.Model;

import LLDTicTacToe.PieceType;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int boardSiz;
    public PlayingPiece[][] board;
    public Board (int siz) {
        this.boardSiz = siz;
        this.board = new PlayingPiece[siz][siz];
    }
    void addPiece (int x, int y, PlayingPiece pieceType) {
        this.board[x][y] = pieceType;
    }
    public boolean checkWin (int x, int y) {
        // First check the row
        // Then check the column
        // Now check both of the diagonals
        return checkRow(x, y) || checkCol(x, y) || checkDiagonals(x, y);
    }
    boolean checkRow(int x, int y) {
        for (int i = 0; i < this.boardSiz; i++) {
            if (this.board[x][i] == null || this.board[x][i] != board[x][y]) return false;
        }
        return true;
    }
    boolean checkCol(int x, int y) {
        for (int i = 0; i < this.boardSiz; i++) {
            if (this.board[i][y] == null || this.board[i][y] != board[x][y]) return false;
        }
        return true;
    }
    boolean checkDiagonals(int x, int y) {
        boolean diagonal = true;
        for(int i = 0, j = 0; i < this.boardSiz; i++,j++) {
            if (this.board[i][j] == null || this.board[i][j] != board[x][y]) {
                diagonal = false;
                break;
            }
        }
        if (diagonal) return true;
        //need to check anti-diagonals
        diagonal = true;
        for(int i = 0, j = boardSiz - 1; i < this.boardSiz; i++ , j--) {
            if (this.board[i][j] == null || this.board[i][j] != board[x][y]) {
                diagonal = false;
                break;
            }
        }
        return diagonal;
    }
    public void printBoard() {
        for (int i = 0; i < boardSiz; i++) {
            for (int j = 0; j < boardSiz; j++) {
                if (null != this.board[i][j])
                    System.out.print(this.board[i][j].pieceType.name() + "  ");
                else
                    System.out.print("   ");
                System.out.print(" |  ");
            }
            System.out.println();
        }
    }
    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < boardSiz; i++) {
            for (int j = 0; j < boardSiz; j++) {
                if (board[i][j] == null) {
                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }
    public boolean assignCell (int x, int y, PlayingPiece piece) {
        if (board[x][y] != null) return false;
        board[x][y] = piece;
        return true;
    }
}














