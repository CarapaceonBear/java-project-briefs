package gavin.rockpaperscissors.moves;

public class Scissors extends Moves{
    public Scissors(String opposing) {
        super("Scissors", opposing);
    }

    @Override
    public boolean checkWin() {
        if (opposing.equals("Lizard")) {
            return true;
        } else if (opposing.equals("Paper")) {
            return true;
        }
        return false;
    }
}
