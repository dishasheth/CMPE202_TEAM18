import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class QuickSortButtonStrategy implements SortButtonStrategy
{
   @Override
    public void setSortType(){
        
        System.out.println("quick set");
     GetSortingActivity.sortType="quicksort";
    }  
}
