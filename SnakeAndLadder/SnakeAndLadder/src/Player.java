import java.util.List;

public class Player {
    int position = 0;
    int id;

    int winningPosition = 0;
    boolean hasWon = false;


    public int getId() {
        return id;
    }
    public Player(int position, int id, boolean hasWon) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getWinningPosition() {
        return winningPosition;
    }

    public void setWinningPosition(int winningPosition) {
        this.winningPosition = winningPosition;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public int rollTheDices(){
        List<Dice> dices = GameManager.getInstance().getBoard().getDices();
        int total = 0;
        for(Dice d : dices){
            total += d.roll();
        }
        return total;
    }
}
