import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.ui.Button;

public class HomeScreen {

    private Image homeScreen;
    private Button runwayButton;
    CanvasWindow canvas = new CanvasWindow("Project Runway",800, 600);


    public HomeScreen(){
    Button runwayButton = new Button("Enter the Runway!");

    homeScreen = new Image(0,0);
    homeScreen.setScale(0.5,0.5);
    homeScreen.setImagePath("PilotBackground.jpeg");

    runwayButton.setPosition(600,50);

    canvas.add(runwayButton);
    canvas.add(homeScreen);

    runwayButton.onClick(
        () -> theRunway());

    runwayButton.onClick(
            () -> canvas.remove(runwayButton));

    
}

public void theRunway(){
    Image runwayBackground;

    runwayBackground = new Image(0,0);
    runwayBackground.setScale(1.31,1.58);
    runwayBackground.setImagePath("RunwayBackground.jpeg");

    canvas.add(runwayBackground);
}

}
