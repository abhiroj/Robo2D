package core.factory;

import core.elements.playground.Playground;
import core.elements.playground.PlaygroundImpl;
import core.elements.shape.Shape;

/**
 * Singleton Playground Factory
 */
public class PlaygroundFactory {

    private static PlaygroundFactory playgroundFactory = null;

    private PlaygroundFactory() {

    }

    public Playground get2DPlayground(Shape[][] shape2D) {
        return new PlaygroundImpl(shape2D);
    }

    public static PlaygroundFactory getInstance() {
        if (playgroundFactory == null) {
            playgroundFactory = new PlaygroundFactory();
        }
        return playgroundFactory;
    }

}
