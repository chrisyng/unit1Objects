import java.awt.Color;
public class TurtleLab
{
    public static void main(String args[])
    throws InterruptedException
    {
        World pokemonWorld = new World(636, 503);
        Turtle torkoal = new Turtle(pokemonWorld);        
        Picture tallGrass = new Picture("tallgrass.png");
        pokemonWorld.setPicture(tallGrass);
        pokemonWorld.repaint();
        torkoal.setColor(Color.RED);
        torkoal.setShellColor(Color.GREEN);
        torkoal.setPenColor(Color.BLUE);
        torkoal.setPenWidth(8);
        torkoal.forward(100);
        Thread.sleep(1000);
        torkoal.turnLeft();
        Thread.sleep(500);
        torkoal.forward(100);
        Thread.sleep(200);
        Picture battleScene = new Picture("battlescene.png");
        
    }
}
