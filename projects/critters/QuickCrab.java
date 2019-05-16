import java.util.ArrayList;
import java.lang.Math;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Critter;

/**
 * Write a description of class QuickCrab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickCrab extends CrabCritter
{
    public void makeMove(Location loc)
    {
        if (loc.equals(getLocation()))
        {
            double r = Math.random();
            int angle;
            if (r < 0.5)
            {
                angle = -90;
            }
            
            else
            {
                angle = 90;
            }
            setDirection(getDirection() + angle);
        }
        
        else
        {
             super.makeMove(loc);
        }
    }
}
