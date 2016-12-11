import greenfoot.*; 

public class ImageLabel extends Actor
{
public void act() 
{

}    
public ImageLabel(String txt)
{
    GreenfootImage g = new GreenfootImage(txt, 20, null, null);
    setImage(g);
}
}
