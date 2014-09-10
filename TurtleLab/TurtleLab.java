import java.awt.Color;
import java.util.Random;
public class TurtleLab
{
    public static void main(String args[])
    throws InterruptedException
    {
        World pokemonWorld = new World(636, 503);
        Turtle torkoal = new Turtle(pokemonWorld);        
        Picture tallGrass = new Picture("tallgrass.png");
        Picture battleScene = new Picture("battlescene.png");
        pokemonWorld.setPicture(tallGrass);
        pokemonWorld.repaint();
        torkoal.setColor(Color.RED);
        torkoal.setShellColor(Color.GREEN);
        torkoal.setPenColor(Color.BLUE);
        torkoal.setPenWidth(8);
        torkoal.forward(100);
        Thread.sleep(500);
        torkoal.turnLeft();
        Thread.sleep(500);
        torkoal.setPenColor(Color.BLACK);
        torkoal.forward(100);
        Thread.sleep(200);
        torkoal.hide();
        Picture blackBackground = new Picture(636, 503);
        blackBackground.setAllPixelsToAColor(Color.BLACK);
        Picture whiteBackground = new Picture(636, 503);
        whiteBackground.setAllPixelsToAColor(Color.WHITE);
        for (int i = 0; i<3; i++)
        {
            pokemonWorld.setPicture(blackBackground);
            pokemonWorld.repaint();
            Thread.sleep(200);
            pokemonWorld.setPicture(whiteBackground);
            pokemonWorld.repaint();
            Thread.sleep(200);
    }
        pokemonWorld.setPicture(battleScene);        
        pokemonWorld.repaint();
        torkoal.show();        
        Turtle awww = new Turtle(torkoal.getXPos(), torkoal.getYPos(), pokemonWorld);
        torkoal.turnLeft();
        torkoal.setPenColor(Color.GREEN);
        torkoal.forward(100);
        Thread.sleep(200);
        torkoal.turnLeft();
        torkoal.setPenColor(Color.RED);        
        torkoal.forward(100);
        Thread.sleep(200);
        Random randomGen = new Random();
        Color randomColor = new Color (randomGen.nextInt(256), randomGen.nextInt(256), randomGen.nextInt(256));        
        for (int i = 0; i < 500; i++)
        {
            Color multiColored = new Color (randomGen.nextInt(256), randomGen.nextInt(256), randomGen.nextInt(256));
            awww.setPenColor(multiColored);
            awww.setPenWidth(randomGen.nextInt(5));
            awww.forward(3);
            awww.turn(2);
    }
}
}
