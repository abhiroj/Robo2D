package core.src.main.java.core.controller;

import core.src.main.java.core.game.Rover;

public interface GameController {

    void deploy(Rover rover);

    void demobilze(Rover rover);

    boolean shouldMove(Rover rover);

}
