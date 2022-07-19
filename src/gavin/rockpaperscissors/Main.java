package gavin.rockpaperscissors;
import gavin.rockpaperscissors.commands.UserCommands;

public class Main {
    public static void main(String[] args) {
        UserCommands play = new UserCommands();
        play.run();
    }
}
