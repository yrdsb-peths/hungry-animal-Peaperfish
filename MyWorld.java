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
        
        PolarBear polarbear = new PolarBear();
        addObject(polarbear, 300, 300);
        
        Pizza pizza = new Pizza();
        addObject(pizza, 300, 0);
    }
}
