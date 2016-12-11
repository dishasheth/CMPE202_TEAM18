import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContinueGameButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContinueGameButton extends Button
{
    private Player p;
    /**
     * Act - do whatever the ContinueGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String sortType="selectionsort";
    /**
     * Act - do whatever the PlayNowButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ContinueGameButton(Player p)
    {
        this.sortType=sortType;
        this.p=p;
    }
    public void act() 
    {
          if (Greenfoot.mouseClicked(this)) {
               Greenfoot.setWorld(new GetSortingActivity(p));
   }
    }   
}
