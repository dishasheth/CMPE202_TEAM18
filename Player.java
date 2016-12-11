import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String playerName;
    int rank;
    int moves;
    
    public String getPlayerName(){
            return playerName;
    }
    
    public int getRank(){
            return rank;
    }
    public void setPlayerName(String p){
    
               playerName=p;
    
    }

    public void setRank(String p){
    
               playerName=p;
    
    }    
    public Player(String p){
     
     
        
        String playername=p;
        
       
    
    }
    
    public void setMoves(int moves)
    {
            this.moves=moves;
    }
    
    
     public int getMoves()
    {
          return moves;
    }
    public void act() 
    {
        // Add your action code here.
       
        
    }    
}
