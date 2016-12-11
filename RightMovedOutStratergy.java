/**
 * Write a description of class RightMovedOutStratergy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightMovedOutStratergy  implements MoveOutStratergy
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RightMovedOutStratergy
     */
    public RightMovedOutStratergy()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public boolean ifMovedOut(Weight w)
    {
       
           if(560<w.getX()&&w.getX()<760 && w.getY()>350&&w.getY()<550)
           {
            return true;
        }
    return false;
    }
}
