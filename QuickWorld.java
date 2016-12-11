import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickWold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickWorld extends World
{

    /**
     * Constructor for objects of class QuickWold.
     * 
     */
    private Player p;
    public boolean flagu = true;
    public Weight2[] w2array=new Weight2[4];
    public QuickWorld(Player p)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(800, 900, 1); 
       this.p=p;
        prepare();
        GreenfootImage bg = new GreenfootImage("sampleScreen.PNG");
        bg.scale(800,900);
        setBackground(bg);
    }
    
    
    private void prepare()
    {
       
        ReplayDemoButton b4 = new ReplayDemoButton("quick",p);
        GreenfootImage button = b4.getImage();
        button.scale(300,100);
        addObject(b4 , 200, 800);
        
        ContinueGameButton b5 = new ContinueGameButton(p);
        GreenfootImage button1 = b5.getImage();
        button1.scale(300,100);
        addObject(b5 , 600, 800);
        
        int x=-10;
        int y=320;
       
     
            addObject(new Weight2(10),50,320);
             addObject(new Weight2(34),110,320);
              addObject(new Weight2(2),170,320);
               addObject(new Weight2(56),230,320);
               
               for (int i=0; i<4; i++)
               {
                   w2array[i]=getObjects(Weight2.class).get(i);
                }
                
                for(int i=0;i<4;i++)
                {
        
            int j=w2array[i].getValue();
            System.out.println("value is************* "+j);
        
        }
            
        
        
        addObject(new Tray(),150,420);
        addObject(new Tray(),230,420); 
        addObject(new Tray(),310,420); 
        addObject(new Tray(),390,420); 
        
        
         addObject(new Tray(),150,450);
        addObject(new Tray(),230,450); 
        addObject(new Tray(),310,450); 
        addObject(new Tray(),390,450); 
        
        
        
        
        
        
        
        addObject(new WeighingMachine(),415,558);
        
        
    }
    
    
    
}
