package gavin.rockpaperscissors.moves;

public class Paper extends Moves{
    public Paper(String opposing) {
        super("Paper", opposing);
    }

    @Override
    public boolean checkWin() {
        if (opposing.equals("Rock")) {
            return true;
        } else if (opposing.equals("Spock")) {
            return true;
        }
        return false;
    }
}
