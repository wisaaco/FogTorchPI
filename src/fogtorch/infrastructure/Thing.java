package fogtorch.infrastructure;

import fogtorch.utils.Coordinates;

/**
 *
 * @author stefano
 */
public class Thing {
    private final String identifier, type;
    private Coordinates coords;
    
    public Thing(String identifier, String type, double x, double y){
        this.identifier = identifier;
        this.type = type;
        this.coords = new Coordinates(x,y);
    }
    
    public String getId(){
        return this.identifier;
    }
    
    public String getType(){
        return this.type;
    }
    
    public Coordinates getCoordinates(){
        return this.coords;
    }
    
    public void setCoordinates(Coordinates coords){
        this.coords = coords;
    }
    
    
    @Override
    public String toString(){
        String result = "<";
        result = result + this.identifier + ", " + this.type + ", "+ this.getCoordinates();        
        result += ">";
        return result; 
    }

}
