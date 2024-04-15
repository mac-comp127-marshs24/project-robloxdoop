import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Image;

public class TheMotherBoard {

    private static Image runwayBackground;

    public TheMotherBoard(){

    CanvasWindow canvas = new CanvasWindow("Project Runway",800, 600);

    runwayBackground = new Image(0,0);
    runwayBackground.setScale(1.5,1.5);
    runwayBackground.setImagePath("RunwayBackground.jpeg");

    canvas.add(runwayBackground);
    }



    public static void main(String[] args) {
        new TheMotherBoard();
        
    }

    
}
