import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * title screen
 * 
 * @author Brian Wang
 * @version may 2023
 */
public class TitleScreen extends World
{
    Label titleLable = new Label("Hungry Polar Bear", 75);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        
        addObject(titleLable, getWidth()/2, getHeight()/2);
    }
    
}







