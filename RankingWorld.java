import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import org.restlet.data.Form;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;
import org.json.JSONArray;
import org.json.JSONObject ;
import org.restlet.resource.*;
import org.restlet.ext.json.* ;
import java.text.*;

/**
 * Write a description of class RankingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RankingWorld extends World
{
     private static String service_url = "http://localhost:8088/restlet/sortit/database";
    private int moves;
    private Player p;
    private String playerName;

    /**
     * Constructor for objects of class RankingWorld.
     * 
     */
    public RankingWorld(Player p)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 900, 1); 
        this.p=p;
        
        GreenfootImage bg = new GreenfootImage("ranking.png");
        bg.scale(800,900);
        setBackground(bg);
        
        
            
            showText("Player----------------------Moves",300,300);
            
    
        try
          {
              ClientResource guessDatabaseResource = new ClientResource(service_url);
              
              System.out.println("Player moves ........."+p.moves);

              System.out.println("Player moves ........."+p.getPlayerName());
              
            Representation newResult2 = guessDatabaseResource.get();
		System.out.println(newResult2);
		
		
		String order_string = newResult2.getText(); 
	  	
		  System.out.println("INPUT"+order_string);
		  
		  
		      JSONObject json = new JSONObject(order_string) ;
		      JSONArray json_arr = json.getJSONArray("items");
		      int y=300;
		      for (int i=0;i<json_arr.length();i++)
		      {
		          y=y+100;
		    	  JSONObject jsonPlayer=((JSONObject)json_arr.getJSONObject(i).get("PlayerName"));
		    	    JSONObject jsonPlayer2=((JSONObject)json_arr.getJSONObject(i).get("Moves"));
		    	    showText(""+jsonPlayer.get("s"),200,y);
            
            
                    showText(""+jsonPlayer2.get("s"),400,y);
		    	 }
        
            
            
             }
          
          catch(Exception e)
          {
              System.out.println(e);
          }
    
        
        
        
        
        
        }    
          
          
          
          
          
          
          
          
          
          
    
    
}
