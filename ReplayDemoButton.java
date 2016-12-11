import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReplayDemoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReplayDemoButton extends Button
{
    private Player p;
    private String sortingType ="";
    public ReplayDemoButton(String sortingType,Player p)
    {
         this.sortingType=sortingType;
        this.p=p;
    }
    /**
     * Act - do whatever the ReplayDemoButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            if(sortingType=="selection")
            {
                
                sortingFactoryWorld s=new sortingFactoryWorld(p);
                World w=s.getSortingWorld("selection");
                Greenfoot.setWorld(w);
            }
            
            else
            {
                sortingFactoryWorld s=new sortingFactoryWorld(p);
                World w=s.getSortingWorld("quick");
                Greenfoot.setWorld(w);
            }
            
            
        }  
    }    
}
