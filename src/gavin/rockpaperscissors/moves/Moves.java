package gavin.rockpaperscissors.moves;

public class Moves {
    String move;
    String opposing;

    public Moves (String move, String opposing) {
        this.move = move;
        this.opposing = opposing;
    }

    public boolean checkWin () {
        return false;
    }

    public String printUserMove () {
        return "You played " + move + "!";
    }

}
