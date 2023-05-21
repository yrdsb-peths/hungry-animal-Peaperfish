import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the polar bear to eat
 * 
 * @author Brian Wang
 * @version May 2023
 */
public class Pizza extends Actor
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // pizza falls down at 1 unit per second
        setLocation(getX(), getY() + 1);
        
        // remove pizza and write game over when pizza touches the buttom
        MyWorld world = (MyWorld) getWorld();
        //TitleScreen titleScreen = (TitleScreen) getWorld();
        if(getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
