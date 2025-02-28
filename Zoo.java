
import java.util.ArrayList;
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Zoo
{
    private ArrayList<Bird> zooBirds;
    
    public Zoo(){
      zooBirds = new ArrayList<Bird>();//ChatGPT
      
      zooBirds.add(new Bird("blue","short",34)); 
      zooBirds.add(new Bird("blue","short",34));
      zooBirds.add(new Bird("blue","short",34));
      zooBirds.add(new Bird("blue","short",34));
     }
    
    int countBlueBirds(){
        int blueBirds=0;
        for(Bird b:zooBirds){
            if (b.color.equals("blue")){
                blueBirds++;
            }  
            
        }
        return blueBirds;
    }
}

