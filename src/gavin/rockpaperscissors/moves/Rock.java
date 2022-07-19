package gavin.rockpaperscissors.moves;

import gavin.rockpaperscissors.moves.Moves;

public class Rock extends Moves {
    public Rock(String opposing) {
        super("Rock", opposing);
    }

    @Override
    public boolean checkWin() {
        if (opposing.equals("Lizard")) {
            return true;
        } else if (opposing.equals("Scissors")) {
            return true;
        }
        return false;
    }
}
