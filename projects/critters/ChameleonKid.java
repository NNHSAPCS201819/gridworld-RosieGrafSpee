import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Write a description of class ChameleonKid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChameleonKid extends ChameleonCritter
{
    /**
     * Constructor for objects of class ChameleonKid
     */
    public void processActors(ArrayList<Actor> actors)
    {
        Location cur = super.getLocation();
        Location next = cur.getAdjacentLocation(super.getDirection());
        
        if (super.getGrid().get(next) != null)
        {
            setColor(super.getGrid().get(next).getColor());
            return;
        }
        
        super.setDirection(super.getDirection() + 180);
        Location prev = cur.getAdjacentLocation(super.getDirection());
        super.setDirection(super.getDirection() + 180);
        if (super.getGrid().get(prev) != null)
        {
            setColor(super.getGrid().get(prev).getColor());
            return;
        }
        
        setColor(getColor().darker());
    }
}
