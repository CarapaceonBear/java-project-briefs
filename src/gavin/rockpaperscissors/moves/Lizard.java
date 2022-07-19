package gavin.rockpaperscissors.moves;

public class Lizard extends Moves{
    public Lizard(String opposing) {
        super("Lizard", opposing);
    }

    @Override
    public boolean checkWin() {
        if (opposing.equals("Paper")) {
            return true;
        } else if (opposing.equals("Spock")) {
            return true;
        }
        return false;
    }
}
