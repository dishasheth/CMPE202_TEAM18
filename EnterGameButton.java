import greenfoot.*; 
import javax.swing.JOptionPane;

public class EnterGameButton extends Button
{
    boolean flag=false;
    public String playerName; 
    Player p=null;
    public void act() 
    {
        
        
        if(((MyWorld)getWorld()).showbox == true){
            playerName = JOptionPane.showInputDialog("Enter your name");
            System.out.println(playerName);
        
            p=new Player(playerName);
            p.setPlayerName(playerName);
        
            System.out.println("player Name is "+p.getPlayerName());
            ((MyWorld)getWorld()).showbox = false;
            flag=true;
        }
        if(flag)
        {
        Button b1=getWorld().getObjects(EnterGameButton.class).get(0);
  
         if(Greenfoot.mouseClicked(b1))
        {
            GetSortingActivity m=new GetSortingActivity(p);
            Greenfoot.setWorld(m);
        }
        }
        
    }    
}
