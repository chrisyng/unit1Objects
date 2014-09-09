import java.awt.Color;

public class TurtleWorld
{
    public static void main (String[] args)
    {
        World pokemonWorld = new World(633, 497);
        Turtle torkoal = new Turtle(pokemonWorld);        
        Picture background = new Picture("tallgrass.png");
        Thread waiter = new Thread();
        pokemonWorld.setPicture(background);
        pokemonWorld.repaint();
        torkoal.setColor(Color.RED);
        torkoal.setShellColor(Color.GREEN);
        Thread.sleep(100);
        torkoal.forward(230);
        torkoal.turnLeft();
        waiter.sleep(100);
        torkoal.forward(150);
    }
}
