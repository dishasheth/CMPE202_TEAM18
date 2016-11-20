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
    public ActivitySheetWorld(String sortType)
    {    
        // Create a new world with 800x900 cells with a cell size of 1x1 pixels.
        super(800, 900, 1); 
      // GetSortingActivity getsa = new GetSortingActivity();
        //String sort=getsa.getSortType();
        GreenfootImage sortingbg=null;
        if(sortType=="quicksort"){
         sortingbg=new GreenfootImage("qsactivitysheet.png");
        }
        else if(sortType=="selectionsort")
        {
         sortingbg=new GreenfootImage("ssactivitysheet.png");
        }  
        prepareActivitySheet();
        sortingbg.scale(800,900);
        setBackground(sortingbg);
    
    }
    
  
    
     private void prepareActivitySheet()
    {

        addObject( new PlayNowButton(), 400, 850 ) ;
        }
}
