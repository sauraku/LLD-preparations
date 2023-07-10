public class Dice {
    int sides = 6;

    public Dice(int sides) {
        this.sides = sides;
    }

    public Dice() {
    }

    public int roll(){
        int result = (int) (Math.random()*(sides) + 1);
        return result;
    }
}
