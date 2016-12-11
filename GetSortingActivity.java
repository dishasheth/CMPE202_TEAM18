import greenfoot.*;  
public class GetSortingActivity extends World
{
    private Player p;

    public static String sortType;
     public static String getSortType(){
     return sortType;
    }
   
    public GetSortingActivity(Player p)
    {      
        super(800, 900, 1); 
        this.p=p;
        prepare(p);
        GreenfootImage getSortingActivityBg=new GreenfootImage("sorting-background.png");
        getSortingActivityBg.scale(800,900);
        setBackground(getSortingActivityBg);
    }
    
     private void prepare(Player p)
    {
        addObject( new Instruction(),500, 220 ) ;
        addObject( new Guide(), 80, 300 ) ;
        addObject( new QuickSortDemoButton(p), 210, 450 ) ;
        addObject( new SelectionSortDemoButton(p), 510, 450 ) ;
        addObject(new ImageLabel("Type of Sort"), 380, 800);
        System.out.println(p.playerName);
        
        addObject( new GetSortingButton(p), 380, 550 ) ;
        
        addObject( new StartSortingButton(p), 380, 675) ;
    }
 
   public void getSortRandomly(){
    
 int i = Greenfoot.getRandomNumber(20);
 SortButtonStrategyContext sortButtonStrategyContext=null;
 if((i%2)==0){
     addObject(new ImageLabel("Selection Sort"), 380, 800);
     sortButtonStrategyContext = new SortButtonStrategyContext(new SelectionSortButtonStrategy());
     sortButtonStrategyContext.executeStrategy();
 }
 else
  {
     showText("You got Quick Sort", 300, 620);
     addObject(new ImageLabel("Quick Sort"), 380, 800);
     sortButtonStrategyContext = new SortButtonStrategyContext(new QuickSortButtonStrategy());
     sortButtonStrategyContext.executeStrategy();
     
  }
 }
}
