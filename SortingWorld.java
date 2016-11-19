import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class SortingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortingWorld extends World
{

 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SortingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 900, 1); 
        GreenfootImage bg=new GreenfootImage("sorting-background.png");
        bg.scale(800,900);
        setBackground(bg);
        prepare();
    }
    public void prepare()
    {
        for(int i=0;i<8;i++)
        {
              addObject(new Guide(),130,220);
        addObject(new Activity_sheet(),300,220);
        addObject(new Help(),470,220);

            int random = (int )(Math.random() * 100 + 1);
            addObject(new Weight(random),150+i*70,350);
            
             addObject(new Tray(),150,650);  
        addObject(new Tray(),220,650); 
        addObject(new Tray(),290,650); 
        addObject(new Tray(),360,650); 
        addObject(new Tray(),430,650); 
        addObject(new Tray(),500,650); 
        addObject(new Tray(),570,650); 
        addObject(new Tray(),640,650); 
        }
     
    }
}


