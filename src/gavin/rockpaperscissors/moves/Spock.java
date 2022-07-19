package gavin.rockpaperscissors.moves;

public class Spock extends Moves{
    public Spock(String opposing) {
        super("Spock", opposing);
    }

    @Override
    public boolean checkWin() {
        if (opposing.equals("Rock")) {
            return true;
        } else if (opposing.equals("Scissors")) {
            return true;
        }
        return false;
    }
}
