package Workshops.WP6;
import Workshops.WP6.Program.*;
import java.io.IOException;

public class StartGame {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Engine<Game, TerminalPrint> Round1 = new Engine<Game,TerminalPrint>(new Game(), new TerminalPrint());
        Round1.startGame();

        Engine<Game, TerminalPrint> Round2 = new Engine<Game,TerminalPrint>(new Game(), new TerminalPrint());
        Round2.startGame();
    }
}
