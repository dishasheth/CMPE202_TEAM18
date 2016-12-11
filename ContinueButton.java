import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContinueButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContinueButton extends Button
{
    /**
     * Act - do whatever the ContinueButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ContinueButton()
    {
        GreenfootImage image = getImage(); 
         image.scale(130,70);
    }
    public void act() 
    {
        // Add your action code here.
         if (Greenfoot.mouseClicked(this)) {
              HelpOptions w=(HelpOptions)getWorld();
              w.setSortWorld();
            }
    }    
}
