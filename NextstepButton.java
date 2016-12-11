import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextstepButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextstepButton extends Button
{
    /**
     * Act - do whatever the NextstepButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    Player p;
    String typeofsort;
    public NextstepButton(World world,String typeofsort,Player p)
    {
        this.world=world;
        this.p=p;
        this.typeofsort=typeofsort;
        GreenfootImage image = getImage(); 
         image.scale(130,70);
    }
    public void act() 
    {
        // Add your action code here.
          if (Greenfoot.mouseClicked(this))
          {
            System.out.println("From next button : "+typeofsort);
            if(typeofsort=="selectionsort")
            {
              NextStepSelectionChain onsss=new NextStepSelectionChain();
              onsss.fromnext(world,typeofsort,(HelpOptions)getWorld());
             }
             if(typeofsort=="quicksort")
            {
              NextStepQuickChain onsqs=new NextStepQuickChain();
              onsqs.fromnext(world,typeofsort,(HelpOptions)getWorld());
             }
          }
    } 
}
