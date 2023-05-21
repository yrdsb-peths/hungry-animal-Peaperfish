import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world where the polar bear loves pizza more then anything
 * 
 * @author Brian Wang
 * @version May 2023
 */
public class MyWorld extends World
{
    // initial values 
    public int score = 0;
    Label scoreLabel;
    int level = 1;

    /**
     * Constructor for objects of class MyWorld
     */
    public MyWorld()
    {    
        // Create a new world with 700 x 500 cells with a cell size of 1x1 pixels.
        super(700, 500, 1, false); 
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        // creating polar bear
        PolarBear polarbear = new PolarBear();
        addObject(polarbear, 300, 450);
        
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
        
        if(score % 5 == 0) {
            level += 1;
        }
    }
    
    /**
     * create a new pizza at a random place on the at of the screen
     */
    public void createPizza() {
        Pizza pizza = new Pizza();
        pizza.setSpeed(level);
        
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(pizza, x, y);
    }
}
