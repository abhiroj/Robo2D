package core.src.main.java.core.game;

public interface Rover {

    int getId();

    void move();

    void stop();

    void setCoordinates(Coordinate coordinates);

    Coordinate getCoordinate();

}
