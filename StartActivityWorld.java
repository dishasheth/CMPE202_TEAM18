import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartActivityWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartActivityWorld extends World
{

    /**
     * Constructor for objects of class StartActivityWorld.
     * 
     */
    public StartActivityWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 900, 1); 
        prepare();
        GreenfootImage bg = new GreenfootImage("frontpage1.png");
        bg.scale(800,900);
        setBackground(bg);
        
        
    }
    
    private void prepare()
    {
        EnterGameButton b1 = new EnterGameButton();
        GreenfootImage button=b1.getImage();
        button.scale(600,200);
        addObject(b1 , 400, 750);
    }
}
