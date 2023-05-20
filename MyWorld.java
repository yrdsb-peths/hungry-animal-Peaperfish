import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world where the polar bear is moved by the player
 * 
 * @author Brian Wang
 * @version May 2023
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // creating polarbear
        PolarBear polarbear = new PolarBear();
        addObject(polarbear, 300, 300);
        
        // creating a label
        
        Label scoreLabel1 = new Label(0, 80);
        addObject(scoreLabel1, 50, 50);
        
        
        createPizza();
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
