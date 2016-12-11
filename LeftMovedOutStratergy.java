/**
 * Write a description of class LeftMovedOutStratergy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftMovedOutStratergy  implements MoveOutStratergy
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class LeftMovedOutStratergy
     */
    public LeftMovedOutStratergy()
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
       
          // System.out.println(getX()+"...."+getY()+"......"+"scale");
           if(150<w.getX()&&w.getX()<250 && w.getY()>350&&w.getY()<550)
           {
            return true;
        }
    return false;
    }
}
