import java.util.List;

import ThemesOutfit.School;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Rectangle;
import edu.macalester.graphics.GraphicsGroup;

public class PlayerManager {
    List<GraphicsObject> playersOutfitChoices;
    List<GraphicsObject> winningOutfit;    
    Rectangle rectangle;
    
    int score = 0; 
    int score2 = 0;

    public PlayerManager() {}

    public void decision() {

        for (GraphicsObject item : playersOutfitChoices) {
            
            if (winningOutfit.contains(item)) {
                score++;
            }
        }
    }

}
