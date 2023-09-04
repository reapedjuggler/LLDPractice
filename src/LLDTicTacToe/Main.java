package LLDTicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToeGame = new TicTacToe();
        ticTacToeGame.initialise();
        String result = ticTacToeGame.playGame();
        System.out.println("The winner of the game is: " + result);
    }
}
