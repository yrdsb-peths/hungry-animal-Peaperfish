import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PolarBear here.
 * 
 * @author Brian Wang 
 * @version May 2023
 */
public class PolarBear extends Actor
{
    /**
     * Act - do whatever the PolarBear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")) {
            move(-1);
        }
        else if (Greenfoot.isKeyDown("right")) {
            move(1);
        }
    }
}
