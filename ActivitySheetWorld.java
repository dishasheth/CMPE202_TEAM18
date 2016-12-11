import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ActivitySheetWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActivitySheetWorld extends World
{

    /**
     * Constructor for objects of class ActivitySheetWorld.
     * 
     */
    World world;
    private Player p;
    public ActivitySheetWorld(String sortType,Player p)
    {    
        // Create a new world with 800x900 cells with a cell size of 1x1 pixels.
        super(800, 900, 1); 
        this.p=p;
      // GetSortingActivity getsa = new GetSortingActivity();
        //String sort=getsa.getSortType();
         System.out.println(p.playerName);
        GreenfootImage sortingbg=null;
        if(sortType=="quicksort"){
            
         sortingbg=new GreenfootImage("qsactivitysheet.png");
        }
        else if(sortType=="selectionsort")
        {
         sortingbg=new GreenfootImage("ssactivitysheet.png");
        }  
        prepareActivitySheet(sortType);
        sortingbg.scale(800,900);
        setBackground(sortingbg);
    
    }
    public ActivitySheetWorld(String sortType,World world,Player p)
        {    
            // Create a new world with 800x900 cells with a cell size of 1x1 pixels.
            super(800, 900, 1);
            this.p=p;
          // GetSortingActivity getsa = new GetSortingActivity();
            //String sort=getsa.getSortType();
            this.world=world;
            GreenfootImage sortingbg=null;
            if(sortType=="quicksort"){
             sortingbg=new GreenfootImage("qsactivitysheet.png");
            }
            else if(sortType=="selectionsort")
            {
             sortingbg=new GreenfootImage("ssactivitysheet.png");
            }  
             addObject( new BackButton(p), 400, 850 ) ;
            sortingbg.scale(800,900);
            setBackground(sortingbg);
        
        }    
  
    
     private void prepareActivitySheet(String sortType)
    {
                    System.out.println(p.playerName);
        addObject( new PlayNowButton(sortType,p), 400, 850 ) ;
        }
    public void setSortWorld()
    {
    Greenfoot.setWorld(this.world);
    }
    
}
