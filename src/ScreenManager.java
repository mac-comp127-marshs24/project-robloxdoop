
import ThemesOutfit.School;
import ThemesOutfit.Winter;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
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
    private Button homeScreeButton = new Button("Play Again");
    GraphicsGroup runwayReady = new GraphicsGroup();
    Image rightPinkButton = new Image("assets/RightButton.png");
    Image closetBackground;
    Image characterBase;
    Rectangle shirtManager = new Rectangle(20, 40, 200, 200);
    Rectangle bottomManager = new Rectangle(20, 290, 200, 200);
    Rectangle shoeManager = new Rectangle(20, 540, 200, 200);
    Button shirtLeftButton = new Button ("Left");
    Button shirtRightButton = new Button ("Right");
    Winter winterGloves = new Winter();
    GraphicsText Instructions = new GraphicsText("Hello Welcome to Fashion Famous!");
    int igloves = 0;
    int dx = 5;
    CanvasWindow canvas = new CanvasWindow("Project Runway",1920, 1080);
    TheMotherBoard motherBoard = new TheMotherBoard();



public ScreenManager(){
theCloset();
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
    shirtLeftButton.setPosition(10, 40);
    shirtRightButton.setPosition(160, 40);

    shirtManager.setStrokeWidth(10);
    bottomManager.setStrokeWidth(10);
    shoeManager.setStrokeWidth(10);
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

    canvas.add(shirtManager);
    canvas.add(bottomManager);
    canvas.add(shoeManager);
    canvas.add(shirtLeftButton);
    canvas.add(shirtRightButton);

    for (Image gloves : winterGloves.getwinterGloves()){
        canvas.add(gloves);
        gloves.setCenter(shirtManager.getCenter());
        gloves.setScale(0.4);
    }

    shirtLeftButton.onClick(
        () -> {
        changeGloves(true);
        });

    shirtRightButton.onClick(
            () -> {
            changeGloves(false);   
            });


    runwayButton.setPosition(600,50);
    canvas.add(runwayButton);

    // Button undo = new Button("Undo");
    // undo.setPosition(0, 0);
    // canvas.add(undo);

    // undo.onClick(
    //     () -> testDress.setPosition(250, 0)
    // );


    // canvas.onClick(
    //     event -> {event.getPosition();
    //         if(canvas.getElementAt(event.getPosition()) == ){
    //             testDress.setCenter(characterBase.getPosition()); 
                
    //         }

    //     }
    // );
    placeScarf();

    runwayButton.onClick(
        () -> theRunway());

    runwayButton.onClick(
        () -> canvas.removeAll()
    );
}



public void placeScarf(){
    canvas.onClick(
        event -> {
            Image scarf = (Image)canvas.getElementAt(event.getPosition());
            if(scarf != null){
                if(scarf.toString().equals("Image at position (-840.0,-400.0) with file assets_Clothes/BlueScarf.png"))
                System.out.println("THIS IS THE POSITON OF SCARF BEFORE" + scarf.getPosition()); //if the scarf is there but if we move it then we have to change the coordinates
                scarf.setPosition(-300,-400);
                System.out.println("THIS IS THE POSITON OF SCARF AF?TER" + scarf.getPosition());
                runwayReady.add(scarf);

            }

        }
    );
   

}

public void changeGloves(boolean RL){
    canvas.remove(winterGloves.getwinterGloves().get(igloves));

    if(RL){
    igloves ++;}
    else{
    igloves --;
    }

    if(igloves > winterGloves.getwinterGloves().size() - 1){
        igloves = 0;
    }
    if(igloves < 0){
        igloves = winterGloves.getwinterGloves().size() - 1;
    }
    canvas.add(winterGloves.getwinterGloves().get(igloves));
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
    Winter winter = new Winter();
    School school = new School();


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



    homeScreeButton.setPosition(600,50);
    canvas.add(homeScreeButton);

    Button quitButton = new Button("Quit?");
    quitButton.setPosition(400, 50);
    canvas.add(quitButton);


    homeScreeButton.onClick(
        () -> {
            canvas.removeAll();
            motherBoard.setTheme();
            mainMenu();
        
});

    quitButton.onClick(
        () ->  canvas.closeWindow()
    );

}


}
