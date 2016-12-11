import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickSortDemoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortDemoButton extends Button
{
    /**
     * Act - do whatever the QuickSortDemoButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Player p;
    public void act() 
    {
        // Add your action code here.
        
        if (Greenfoot.mouseClicked(this)) 
        {
            sortingFactoryWorld s=new sortingFactoryWorld(p);
            World w=s.getSortingWorld("quick");
            Greenfoot.setWorld(w);
        } 
    }    
    
    public QuickSortDemoButton(Player p)
    {
        this.p=p;
          GreenfootImage image = getImage(); 
         image.scale(300,100);
        }
}
