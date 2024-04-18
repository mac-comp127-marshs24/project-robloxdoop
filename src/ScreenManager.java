import ThemesOutfit.School;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Line;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.Rectangle;
import edu.macalester.graphics.ui.Button;


/*
 * Manages all the screens the game goes through, Homescreen, Instructions, Closet,
 * Runway, and Podium
 */

 /*
  * 4/16/2024: Problem Encounter: The Pages glitches when going to new screen, could
  * it have something to do with 'canvas.remove()'

  04/16/2024 4:58PM: I know it works because I saw the video's destiny sent, 
  but for me it shows none of the Images when I run it here or in motherboard - Samira
  */

public class ScreenManager {
    private Button runwayButton = new Button("Enter the Runway!");
    private Button closetButton = new Button("Let's get dressed!");
    private Button podiumButton = new Button("Winner or Loser?");
    private Button homeScreeButton = new Button("Play Again");
    private Button instructionsButton = new Button("Ready to play?");
    CanvasWindow canvas = new CanvasWindow("Project Runway",800, 600);


public ScreenManager(){
theHomeScreen();
}

public void theHomeScreen(){
    Image homeScreen;
    homeScreen = new Image(0,0);
    homeScreen.setScale(0.5,0.5);
    homeScreen.setImagePath("Backgrounds/PilotBackground.jpeg");
    canvas.add(homeScreen);

    instructionsButton.setPosition(600,50);
    canvas.add(instructionsButton);

    instructionsButton.onClick(
        () -> theInstructionsScreen());

    instructionsButton.onClick(
        () -> canvas.removeAll()
    );

}

public void theInstructionsScreen(){
    Image instructionsScreen;
    instructionsScreen = new Image(0,0);
    instructionsScreen.setScale(1.5,1.67);
    instructionsScreen.setImagePath("Backgrounds/InstructionsScreen.jpeg");
    canvas.add(instructionsScreen);

    closetButton.setPosition(600,50);
    canvas.add(closetButton);

    closetButton.onClick(
        () -> theCloset());

    closetButton.onClick(
        () -> canvas.removeAll()
    );

}

public void theCloset(){
    Image closetBackground;
    Image characterBase;
    closetBackground = new Image(0,0);
    closetBackground.setScale(0.48,0.62);
    closetBackground.setImagePath("Backgrounds/dungeonCloset.jpeg");

    characterBase = new Image(0,0);
    characterBase.setScale(0.3125,0.135);
    characterBase.setCenter(400, 300);
    characterBase.setImagePath("whiteSkinBase.png");
    System.err.println(characterBase.getPosition());

    canvas.add(closetBackground);
    canvas.add(characterBase);
    School dressBase = new School();
    GraphicsObject testDress = dressBase.top();
    canvas.add(testDress);

    runwayButton.setPosition(600,50);
    canvas.add(runwayButton);

    Button undo = new Button("Undo");
    undo.setPosition(0, 0);
    canvas.add(undo);

    undo.onClick(
        () -> testDress.setPosition(250, 0)
    );




    canvas.onClick(
        event -> {event.getPosition();
            System.out.println("charcter pos" + characterBase.getPosition());
            System.out.println("Dress pos" + dressBase.getPosition());
            System.out.println(canvas.getElementAt(event.getPosition()));

            if(canvas.getElementAt(event.getPosition()) == testDress){
                testDress.setCenter(characterBase.getPosition()); //Ok so it moves that all the matter for now
                
            }

            
        
        }
    );
    runwayButton.onClick(
        () -> theRunway());

    runwayButton.onClick(
        () -> canvas.removeAll()
    );
}

public void theRunway(){
    Image runwayBackground;
    runwayBackground = new Image(0,0);
    runwayBackground.setScale(1.31,1.58);
    runwayBackground.setImagePath("Backgrounds/RunwayBackground.jpeg");
    canvas.add(runwayBackground);

    podiumButton.setPosition(600,50);
    canvas.add(podiumButton);

    podiumButton.onClick(
        () -> thePodium());

    podiumButton.onClick(
        () -> canvas.removeAll()
    );
}

public void thePodium(){
    Image podiumBackground;
    podiumBackground = new Image(0,0);
    podiumBackground.setScale(0.67,0.96);
    podiumBackground.setImagePath("Backgrounds/PodiumMetal.png");
    canvas.add(podiumBackground);

    homeScreeButton.setPosition(600,50);
    canvas.add(homeScreeButton);

    homeScreeButton.onClick(
        () -> theHomeScreen());

    homeScreeButton.onClick(
        () -> canvas.removeAll()
    );

}


}
