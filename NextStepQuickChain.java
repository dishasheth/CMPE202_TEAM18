import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextStepQuickChain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextStepQuickChain extends Actor
{
    /**
     * Act - do whatever the NextStepQuickChain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void fromnext(World world,String typeofsort,World helpworld)
    {
        System.out.println("NextStepQuickChain : "+world+"    "+typeofsort);
        Scale scale=((SortingWorld)world).getScale();
        System.out.println(scale.getLeft()+"---------------"+scale.getRight());
              if(scale.getLeft()==null && scale.getRight()==null)
              {
                display("00.PNG",helpworld);
              }
              else if(scale.getLeft()!=null && scale.getRight()!=null)
              {
                display("11.PNG",helpworld);                
              }
              else if(scale.getLeft()!=null || scale.getRight()!=null)
              {
                display("10.PNG",helpworld);                
              }
            
    }
    public void display(String text,World helpworld)
      {
          GreenfootImage baseImg = new GreenfootImage(text);
            // to scale, adjust x and y to new width and height, then
            GreenfootImage image = new GreenfootImage(baseImg);
            image.scale(230,200); // scaling the original image
             Message m=new Message();
              m.setImage(image);
            HelpOptions w=(HelpOptions)helpworld;
            w.setSortWorld(m);
            //System.out.println(mouseX+" "+mouseY+" "+m);
           
     }
}
