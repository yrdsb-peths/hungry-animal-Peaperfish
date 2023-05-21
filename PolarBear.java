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
    
    GreenfootSound polarBearSound = new GreenfootSound("bear_sound.wav");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    // facing direction when started
    SimpleTimer animationTimer = new SimpleTimer();
    
    public PolarBear() {
        for(int i = 0; i < idle.length; i++) {
            idle[i] = new GreenfootImage("images/polarBear_Idle_sprite/idle_" + i + ".png");
        }
        setImage(idle[0]);
        
        animationTimer.mark();
        
        // initial polar bear image
        setImage(idle[0]);
    }
    
    /**
     * animate the polar bear
     */
    int imageIndex = 0;
    
    public void animatePolarBear() {
        if(animationTimer.millisElapsed() < 90) {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
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
        
        // animate the polar bear
        animatePolarBear();
    }
    
    public void eat() {
        if(isTouching(Pizza.class)) {
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.createPizza();
            world.increaseScore();
            polarBearSound.play();
        }
    }
}
