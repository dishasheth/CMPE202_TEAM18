import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ActivitySheetWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActivitySheetWorld extends World
{

    /**
     * Constructor for objects of class ActivitySheetWorld.
     * 
     */
    public ActivitySheetWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 900, 1); 
        GreenfootImage image=new GreenfootImage("qsactivitysheet.png");
        prepareActivitySheet();
        image.setTransparency(0);
        image.scale(800,900);
        setBackground(image);
        
        GreenfootImage image2=new GreenfootImage("ssactivitysheet.png");
         prepareActivitySheet();
        image2.scale(800,900);
        setBackground(image2);
       
        
    }
    
  
    
     private void prepareActivitySheet()
    {

        addObject( new PlayNowButton(), 400, 850 ) ;
        }
}
