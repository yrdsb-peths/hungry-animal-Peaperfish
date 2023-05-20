import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world where the polar bear is moved by the player
 * 
 * @author Brian Wang
 * @version May 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        // creating polarbear
        PolarBear polarbear = new PolarBear();
        addObject(polarbear, 300, 300);
        
        // creating a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createPizza();
    }
    
    /**
     * end the game and write "gameover"
     */
    public void gameOver() {
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * inscrease score
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * create a new pizza at a random place on the at of the screen
     */
    public void createPizza() {
        Pizza pizza = new Pizza();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(pizza, x, y);
    }
}
