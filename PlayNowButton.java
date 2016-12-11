import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayNowButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayNowButton extends Button
{
    private Player p;
    String sortType="";
    /**
     * Act - do whatever the PlayNowButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayNowButton(String sortType,Player p){
    this.sortType=sortType;
    this.p=p;
    }
    public void act() 
    {
          if (Greenfoot.mouseClicked(this)) {
                            System.out.println(p.playerName);
   
            Greenfoot.setWorld(new SortingWorld(sortType,p));
    }
    }    
}
