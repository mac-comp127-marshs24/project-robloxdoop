
import java.util.ArrayList;
import java.util.List;

import ThemesOutfit.School;
import ThemesOutfit.Winter;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;
import edu.macalester.graphics.ui.Button;


/*
 * Manages all the screens the game goes through, Homescreen, Instructions, Closet,
 * Runway, and Podium
 */


public class ScreenManager {
    private Button runwayButton = new Button("Enter the Runway!");
    private Button closetButton = new Button("Let's get dressed!");
    private Button podiumButton = new Button("Winner or Loser?");
    GraphicsGroup runwayReady = new GraphicsGroup();
    Image rightPinkButton = new Image("assets/RightButton.png");
    Image closetBackground;
    Image characterBase;
    Rectangle accessoriesBox = new Rectangle(20, 40, 200, 200);
    Rectangle bottomManager = new Rectangle(20, 290, 200, 200);
    Rectangle shoeManager = new Rectangle(20, 540, 200, 200);
    Button accessoriesLeftButton = new Button ("Left");
    Button accessoriesRightButton = new Button ("Right");
    Winter winter = new Winter();
    School school = new School();
    GraphicsText Instructions = new GraphicsText("Hello Welcome to Fashion Famous!");
    int dx = 5;
    CanvasWindow canvas = new CanvasWindow("Project Runway",1920, 1080);
    TheMotherBoard motherBoard = new TheMotherBoard();



public ScreenManager(){
mainMenu();
}

public void mainMenu(){
    Image homeScreen;
    homeScreen = new Image(0,0);
    homeScreen.setScale(0.75,0.75);
    homeScreen.setImagePath("assets/mainMenu.png");
    canvas.add(homeScreen);
    rightPinkButton.setCenter(700, 700);
    rightPinkButton.setScale(0.09);
    canvas.add(rightPinkButton);


    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == rightPinkButton){
                canvas.removeAll();
                theInstructionsScreen();
            }

        }
    );

}

public void moveableText(GraphicsText Instructions, double dx, double dy){
    canvas.animate( 
        () -> {
            if(Instructions.getX() + Instructions.getWidth() + 50 < canvas.getWidth()){
            Instructions.moveBy(dx,dy);
            }
        }
    );

    closetButton.setPosition(600,50);
    canvas.add(closetButton);
}

public void theInstructionsScreen(){
    Image instructionsScreen;
    Instructions.setPosition(250, 250);
    moveableText(Instructions, dx, 0);
    Instructions.setFontSize(60);

    instructionsScreen = new Image(0,0);
    instructionsScreen.setScale(0.75,0.75);
    instructionsScreen.setImagePath("assets/mainMenu2.png");

    canvas.add(instructionsScreen);
    canvas.add(Instructions);

    closetButton.onClick(() -> {
        canvas.removeAll();
        theCloset();
        
    });

}

public void theCloset(){


    accessoriesBox.setStrokeWidth(10);
    accessoriesBox.setCenter(685, 135);
    accessoriesLeftButton.setPosition(accessoriesBox.getX() - 100,accessoriesBox.getY());
    accessoriesRightButton.setPosition(accessoriesBox.getX() + accessoriesBox.getWidth(),accessoriesBox.getY());

    bottomManager.setStrokeWidth(10);
    bottomManager.setCenter(685, 375);
    shoeManager.setStrokeWidth(10);
    shoeManager.setCenter(685, 690);
    closetBackground = new Image(0,0);
    closetBackground.setScale(0.75,0.75);
    closetBackground.setImagePath("assets/closet.png");

    characterBase = new Image(0,0);
    characterBase.setScale(0.9,0.9);
    characterBase.setPosition(540,25);
    characterBase.setImagePath("assets/model.png");
    runwayReady.add(characterBase);
    
    canvas.add(closetBackground);
    canvas.add(characterBase);

    canvas.add(accessoriesBox);
    canvas.add(bottomManager);
    canvas.add(shoeManager);
    canvas.add(accessoriesLeftButton);
    canvas.add(accessoriesRightButton);

    winter.getwinterAccessories().get(0).setCenter(accessoriesBox.getCenter());
    winter.getwinterAccessories().get(0).setScale(0.4);
    canvas.add(winter.getwinterAccessories().get(0));
    runwayReady.add(winter.getwinterAccessories().get(0));
    playerChoices.add(winter.getwinterAccessories().get(0));

    canvas.onClick(e -> {
        System.out.println(e.getPosition());
    });


    accessoriesLeftButton.onClick(
        () -> {
        changeAccessories(false);
        });

    accessoriesRightButton.onClick(
            () -> {
            changeAccessories(true);   
            });


    runwayButton.setPosition(65,65);
    canvas.add(runwayButton);

    runwayButton.onClick(
        () -> theRunway());

    runwayButton.onClick(
        () -> canvas.removeAll()
    );
}



int accessoriesClickCounter = 0;
List<GraphicsObject> playerChoices = new ArrayList<GraphicsObject>();
int indexOfAccessory = 0;

public void changeAccessories(boolean moveForward){
    canvas.remove(winter.getwinterAccessories().get(indexOfAccessory));
    runwayReady.remove(winter.getwinterAccessories().get(indexOfAccessory));
    playerChoices.remove(winter.getwinterAccessories().get(indexOfAccessory));

    if(moveForward){
        indexOfAccessory ++;
    }
    else{
    indexOfAccessory --;
    }


    if(indexOfAccessory  > winter.getwinterAccessories().size() - 1){
        indexOfAccessory  = 0;
    }
    if(indexOfAccessory  < 0){
        indexOfAccessory  = winter.getwinterAccessories().size() - 1;
    }

    winter.getwinterAccessories().get(indexOfAccessory).setCenter(accessoriesBox.getCenter());
    winter.getwinterAccessories().get(indexOfAccessory).setScale(0.4);
    canvas.add(winter.getwinterAccessories().get(indexOfAccessory));
    runwayReady.add(winter.getwinterAccessories().get(indexOfAccessory));
    playerChoices.add(winter.getwinterAccessories().get(indexOfAccessory));
    System.out.println(playerChoices);
}


public void theRunway(){
    Image runwayBackground;
    runwayBackground = new Image(0,0);
    runwayBackground.setScale(0.75,0.75);
    runwayBackground.setImagePath("assets/stage.png");
    canvas.add(runwayBackground);

    podiumButton.setPosition(600,50);
    canvas.add(podiumButton);

    podiumButton.onClick(
        () -> thePodium());

    podiumButton.onClick(
        () -> canvas.removeAll()
    );
    canvas.add(runwayReady);
}



public void thePodium(){


    System.out.println("ScreenManger thinkings " + TheMotherBoard.getTheme());
    
    if(TheMotherBoard.getTheme().equals(winter.getWinningOutfit())){
        Image winterBackground = new Image(0,0);
        winterBackground.setScale(.75);
        winterBackground.setImagePath("assets/winter2.png");
        winterBackground.setPosition(-240, -150);
        canvas.add(winterBackground);
    }else if(TheMotherBoard.getTheme().equals(school.getWinningOutfit())){
        Image schoolBackground = new Image(0,0);
        schoolBackground.setScale(.75);
        schoolBackground .setImagePath("assets/school2.png");
        schoolBackground.setPosition(-240, -150);
        canvas.add(schoolBackground);
    }
    else{
        Image beachBackground = new Image(0,0);
        beachBackground.setImagePath("assets/beach2.png");
        beachBackground.setScale(.75);
        beachBackground.setPosition(-240, -150);
        canvas.add(beachBackground);

}

    canvas.add(runwayReady);
    runwayReady.setScale(0.75);
    runwayReady.setPosition(75 ,0);

    Button quitButton = new Button("Quit?");
    quitButton.setPosition(400, 50);
    canvas.add(quitButton);


    quitButton.onClick(
        () ->  canvas.closeWindow()
    );

}


}
