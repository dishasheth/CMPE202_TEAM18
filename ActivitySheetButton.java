import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ActivitySheetButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActivitySheetButton extends Button
{
    Player p=null;
    String sortType="";
    public ActivitySheetButton(String sortType,Player p)
    {
        this.sortType=sortType;
        this.p=p;
        GreenfootImage image = getImage(); 
         image.scale(130,70);
    }
    /**
     * Act - do whatever the ActivitySheetButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if (Greenfoot.mouseClicked(this)) {
   
            Greenfoot.setWorld(new ActivitySheetWorld(sortType,this.getWorld(),p));
    }
    }    
}
