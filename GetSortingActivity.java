import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GetSortingActivity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GetSortingActivity extends World
{

    /**
     * Constructor for objects of class GetSortingActivity.
     * 
     */
     public static String sortType;
    public static String getSortType(){
       return sortType;
    }
     public static void setSortType(String s){
        sortType=s;
     }
   
    public GetSortingActivity()
    {      
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 900, 1); 
        prepare();
        GreenfootImage getSortingActivityBg=new GreenfootImage("sorting-background.png");
        getSortingActivityBg.scale(800,900);
        setBackground(getSortingActivityBg);
       try{
           getRandomSorting();
        }
        catch(Exception e){
        System.out.println("thread error");
        }
    }
    
     private void prepare()
    {
        addObject( new Instruction(),500, 220 ) ;
        addObject( new Guide(), 80, 300 ) ;
        addObject( new TakeDemoButton(), 380, 450 ) ;
        addObject( new GetSortingButton(), 380, 550 ) ;
        
        addObject( new QuickSortButton(), 411, 625) ;

         addObject( new StartSortingButton(), 411, 825) ;
         addObject( new SelectionSortButton(), 405, 717) ;
    }
    
    public void getRandomSorting() throws Exception{
    int activity=Greenfoot.getRandomNumber(20);
      Guide guide=getObjects(Guide.class).get(0);
      
      Instruction in=getObjects(Instruction.class).get(0);
      in.getImage().setTransparency(0);
          
    for(int i=0;i<100;i++){
        if((i%2)==0){
        guide.setLocation(100, 625);
        }
        else{
        guide.setLocation(600,717);
          }
    }
    
    if((activity%2)==0){
        
        guide.setLocation(100, 625);
         setSortType("quicksort");        
    }
    else{
        
        guide.setLocation(100,717);
        setSortType("selectionsort");
     
    }
}
}
