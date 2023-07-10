import java.util.Queue;

public class GameManager {
    private static GameManager gamemanager;
    private Board board;
    private Queue<Player> players;

    int winningCounter = 1;

    private GameManager(){

    }

    public static GameManager getInstance(){
        if(gamemanager== null){
            gamemanager = new GameManager();
        }
        return gamemanager;
    }

    public GameManager setBoard(Board board){
        this.board = board;
        return gamemanager;
    }

    public GameManager setPlayers(Queue<Player> players){
        this.players = players;
        return gamemanager;
    }

    public int getWinningCounter() {
        int c = winningCounter;
        winningCounter++;
        return c;
    }


    public Board getBoard() {
        return board;
    }

    public Queue<Player> getPlayers() {
        return players;
    }

    public void play(){
        while (players.size()>1){
            Player currentPlayer = players.remove();
            int diceResult = currentPlayer.rollTheDices();
            System.out.println("Current Player : ***** " + currentPlayer.id + " with dice output: " + diceResult);
            int finalPosition = board.validateLocation(currentPlayer, diceResult);
            if(finalPosition== 101){
                continue;
            } else {
                currentPlayer.setPosition(finalPosition);
                players.add(currentPlayer);
            }
        }
    }

}
