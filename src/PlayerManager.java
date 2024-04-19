import java.util.List;

import ThemesOutfit.School;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Rectangle;
import edu.macalester.graphics.GraphicsGroup;

public class PlayerManager {
    //Add the player items to a graphics group so that we can translate the whole outfit to the 
    //runway

    //also add the items to a list so that we can check for accurancy
    GraphicsGroup playerOneItems;
    GraphicsGroup playerTwoItems;
    School testDress = new School();
    List<GraphicsObject> outfit1;
    List<GraphicsObject> outfit2;
    List<GraphicsObject> winningOutfit;    
    Rectangle rectangle;
    
    int score = 0; 
    int score2 = 0;

    public PlayerManager() {

    // winningOutfit.add(testDress.top()); 
    // System.out.println(testDress.top());
    // outfit1.add(testDress.top());

    // outfit2.add(rectangle = new Rectangle(0, 0,0,0));

        
    }

    public void decision() {

        for (GraphicsObject item : outfit1) {
            
            if (winningOutfit.contains(item)) {
                score++;
            }
        }
        for (GraphicsObject item : outfit2) {
           
            if (winningOutfit.contains(item)) {
                score2++;
            }
        }
        if (score > score2) {
            System.out.println("Player 1 wins!");

        }
        else if (score == score2 ) {
            System.out.println("Tie!");
        }
        else {
            System.out.println("Player 2 wins!");
        }
    }



    
}
