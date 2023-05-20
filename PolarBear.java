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
        // polar bear able to move left and right with the arrow keys 
        if(Greenfoot.isKeyDown("left")) {
            move(-2);
        }
        else if (Greenfoot.isKeyDown("right")) {
            move(2);
        }
        
        // removes the pizza after the polar bear touchs/eats it
        eat();
    }
    
    public void eat() {
        if(isTouching(Pizza.class)) {
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.createPizza();
            world.increaseScore();
        }
    }
}
