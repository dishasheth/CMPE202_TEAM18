import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GetSorting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GetSortingButton extends Button
{
    private Player p;
    public GetSortingButton(Player p)
    {
    GreenfootImage image = getImage() ;
        image.scale( 600, 80 ) ;
    this.p=p;
    }
    /**
     * Act - do whatever the GetSorting wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        
            if (Greenfoot.mouseClicked(this)) {
                  
                    System.out.println("...try me 1");
                    System.out.println(p.playerName);
                GetSortingActivity gsa=new GetSortingActivity(p);
                try{
                    System.out.println("...try me 2");
                    gsa.getSortRandomly();
                }
                catch(Exception e){
                }
                
            
    }    
}
}