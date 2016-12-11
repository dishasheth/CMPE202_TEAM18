import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Button
{
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Player p=null;
    public BackButton(Player p)
    {
        this.p=p;
        GreenfootImage image = getImage(); 
         image.scale(130,70);
        }
    public void act() 
    {
        // Add your action code here.
          if (Greenfoot.mouseClicked(this)) {
              ActivitySheetWorld w=(ActivitySheetWorld)getWorld();
              w.setSortWorld();
            }
    }    
}
