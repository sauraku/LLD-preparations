import java.util.List;

public class Board {
    List<Snake> snakes;
    List<Ladder> ladders;
    int size = 100;
    List<Dice> dices;

    public Board() {
    }

    public Board setSize(int n){
        this.size = n;
        return this;
    }


    public int validateLocation(Player player, int diceOutput){
        int currentLocation = player.getPosition();
        int newPosition = currentLocation + diceOutput;
        if(newPosition > size){
            System.out.println("New Position outside the board!");
            return currentLocation;
        } else if( newPosition == size){
            System.out.println(player.getId() + " has won!, with position: " + GameManager.getInstance().getWinningCounter() );
            return 101;
        }

        for(Ladder l: ladders){
            if(l.getBottom()== newPosition){
                newPosition = l.getTop();
                System.out.println("ladder:" + l.getBottom() + "->" + l.getTop());
            }
        }

        for(Snake l: snakes){
            if(l.getHead()== newPosition){
                newPosition = l.getTail();
                System.out.println("snake:" + l.getHead() + "->" + l.getTail());
            }
        }

        System.out.println(currentLocation + ":" + newPosition);
        return newPosition;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public Board setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
        return this;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public Board setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
        return this;
    }

    public int getSize() {
        return size;
    }

    public List<Dice> getDices() {
        return dices;
    }

    public Board setDices(List<Dice> dices) {
        this.dices = dices;
        return this;
    }
}
