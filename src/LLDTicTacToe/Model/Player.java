package LLDTicTacToe.Model;

import LLDTicTacToe.PieceType;

public class Player {
    public PlayingPiece pieceType;
    public Board board;
    String playerName;
    public Player(PlayingPiece pieceType, String name) {
        this.pieceType = pieceType;
        this.playerName = name;
    }
    public String getPlayerName () {
        return playerName;
    }
    // Player will give the row and the column where he wants to add a piece
    public boolean addPiece (int x, int y) {
        board.addPiece(x, y, this.pieceType);
        boolean resp = board.checkWin(x, y);
        if (resp) {
            String result = "Player: " + this.playerName + " won the game";
            System.out.println(result);
            return true;
        }
        return false;
    }
}










