import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import org.restlet.data.Form;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

/**
 * Write a description of class DoneSortingButon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoneSortingButon extends Button
{
  private static String service_url = "http://localhost:8088/restlet/sortit/database";
    private int moves;
    private Player p;
    private String playerName;
    
    public DoneSortingButon(Player p)
    {
     GreenfootImage image = getImage(); 
         image.scale(360,50);
         this.p=p;
    }
    /**
     * Act - do whatever the DoneSortingButon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setMoves(int moves)
    {
    this.moves=moves;
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
              List<Tray> trays=((SortingWorld)getWorld()).getTrays();
              if(isSorted(trays))
              {
                getWorld().showText("Good Job you have sorted the weights correctly", getX(), 450);
                Greenfoot.delay(200);
                
                try
                {
                  ClientResource guessDatabaseResource = new ClientResource(service_url);
                  Form form = new Form();
                  
                  System.out.println("Player moves ........."+p.moves);
    
                  System.out.println("Player moves ........."+p.getPlayerName());
                  form.add("moves", ""+p.moves);
                 form.add("playerName", ""+p.getPlayerName());
            
                  Representation result = guessDatabaseResource.post(form);
                  JsonRepresentation newResult = new JsonRepresentation(result);
                  System.out.println(newResult);
                  Greenfoot.setWorld(new RankingWorld(p));
             }
                catch(Exception e)
                {
                  System.out.println(e);
                }
              
                        
            
            }
             else
              {
                getWorld().showText("Sorry you did not sort well", getX(), 450);
                
            }
              
              
              
            }
      
    } 
    public boolean isSorted(List<Tray> trays)
{
    boolean sorted = true; 
    
    for (int i = 1; i < trays.size(); i++) {
        Tray t=trays.get(i-1);
        Tray t1=trays.get(i);
        System.out.println(t.weight+"...."+t1.weight);
        if (t.compareTo(t1) > 0) sorted = false;
    }
    

    return sorted;
}
}
