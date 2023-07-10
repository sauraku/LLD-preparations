import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Dice> dices = Arrays.asList(new Dice(6), new Dice(6));
        List<Snake> snakes = Arrays.asList(
                new Snake(12, 3),
                new Snake(20, 13),
                new Snake(30, 23),
                new Snake(40, 33),
                new Snake(50, 43),
                new Snake(55, 43),
                new Snake(60, 44),
                new Snake(65, 44),
                new Snake(70, 23),
                new Snake(99, 10),
                new Snake(95, 56)
        );

        List<Ladder> ladders = Arrays.asList(
                new Ladder(6, 16),
                new Ladder(17, 26),
                new Ladder(27, 36),
                new Ladder(37, 46),
                new Ladder(47, 56),
                new Ladder(57, 66)
        );

        Board board = new Board();
        board.setSize(100)
                .setDices(dices)
                .setSnakes(snakes)
                .setLadders(ladders);

        Queue<Player> players = new LinkedList<>();
        players.add(new Player(0, 0, false));
        players.add(new Player(0, 1, false));
        players.add(new Player(0, 2, false));
        players.add(new Player(0, 3, false));

        GameManager.getInstance()
                .setBoard(board)
                .setPlayers(players);

        GameManager.getInstance().play();

    }

}