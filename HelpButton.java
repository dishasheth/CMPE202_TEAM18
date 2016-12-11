import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpButton extends Button
{
    private Player p=null;
    String sortType="";
    public HelpButton(String sortType,Player p)
    {
        this.sortType=sortType;
        this.p=p;
        GreenfootImage image = getImage(); 
         image.scale(130,70);
        }
    /**
     * Act - do whatever the HelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       if (Greenfoot.mouseClicked(this))
       {
           System.out.println("SORTING TYPE : "+sortType);
           Greenfoot.setWorld(new HelpOptions(sortType,this.getWorld(),p));
       }
    }    
}
