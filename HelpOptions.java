import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpOptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpOptions extends World
{

    /**
     * Constructor for objects of class HelpOptions.
     * 
     */
    World world;
    private Player p;
    public HelpOptions(String typeofsort,World world,Player p)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(800, 900, 1);
      this.world=world;
      this.p=p;
        prepare();
        GreenfootImage bg = new GreenfootImage("sorting-background.png");
        bg.scale(800,900);
        setBackground(bg);
        addObject(new ActivitySheetButton(typeofsort,p),getWidth()/2-60,250);
        addObject(new NextstepButton(world,typeofsort,p),getWidth()/2-60,350);
        addObject(new ContinueButton(),getWidth()/2-60,450);
        // addObject( new BackButton(), 300, 280 ) ;
    }
    public void setSortWorld()
    {
     Greenfoot.setWorld(this.world);
    }
    public void setSortWorld(Message m)
    {
     world.addObject(m,120,225);   
     Greenfoot.setWorld(this.world);
    }
    private void prepare()
    {
       
    }
}
