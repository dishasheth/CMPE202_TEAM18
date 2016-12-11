import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guide extends Actor
{
   
    public Guide()
    {
    GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }
    /**
     * Act - do whatever the Guide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void pri(){
    System.out.println("in guide");
    
    }
}
