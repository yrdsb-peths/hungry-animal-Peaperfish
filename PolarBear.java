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
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    GreenfootImage[] idleRight = new GreenfootImage[8];
    
    
    // direction the polar bear is facing
    String facing = "right";
    
    
    // facing direction when started
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * constructor
     */
    public PolarBear() {
        for(int i = 0; i < idleLeft.length; i++) {
            idleLeft[i] = new GreenfootImage("images/polarBear_Idle_sprite/idle_" + i + ".png");
        }
        
        for(int i = 0; i < idleRight.length; i++) {
            idleRight[i] = new GreenfootImage("images/polarBear_Idle_sprite/idle_" + i + ".png");
            idleLeft[i].mirrorHorizontally();
        }
        
        animationTimer.mark();
        
        // initial polar bear image
        setImage(idleLeft[0]);
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
        
        if(facing.equals("right")) {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        else {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }    
    }
    
    public void act()
    {
        // polar bear able to move left and right with the arrow keys 
        if(Greenfoot.isKeyDown("left")) {
            move(-2);
            facing = "left";
        }
        else if (Greenfoot.isKeyDown("right")) {
            move(2);
            facing = "right";
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
