import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Write a description of class CopyOfChameleonKid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlusterCritter extends Critter
{
    private int courage;
    public BlusterCritter (int c)
    {
        super();
        this.courage = c;
    }
    
    public void processActors(ArrayList<Actor> actors)
    {
        int no = -1;
        for (int i = -2; i <= 2; i++)
        {
            for (int j = -2; j <= 2; j++)
            {
                Location check = new Location (this.getLocation().getRow() + i, this.getLocation().getCol() + i);
                if (this.getGrid().isValid(check))
                {
                    no++;
                }
            }
        }
        
        if (no < courage)
        {
            setColor(getColor().brighter());
        }
        
        else
        {
            setColor(getColor().darker());
        }
    }
}
