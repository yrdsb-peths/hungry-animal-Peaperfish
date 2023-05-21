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
        // Create a new world with 700 x 500 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        
        // bg image
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        // title size
        addObject(titleLable, 320, 165);
        prepare();
    }

    /**
     * the main world act loop
     */

    public void act() {
        // starts the game if player presses the space bar
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Pizza pizza = new Pizza();
        addObject(pizza,635,77);
        PolarBear polarBear = new PolarBear();
        addObject(polarBear,637,223);
        Label label = new Label("Press 'SPACE' To Start Game", 40);
        addObject(label,275,279);
        label.setLocation(371,353);
        label.setLocation(361,285);
        Label label2 = new Label("Use ⬅️ And ➡️ To Move", 40);
        addObject(label2,295,395);
        label2.setLocation(349,363);
        label.setLocation(365,313);
        label2.setLocation(373,367);
        removeObject(pizza);
    }
}








