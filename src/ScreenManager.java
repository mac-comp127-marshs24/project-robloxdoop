import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.ui.Button;


/*
 * Manages all the screens the game goes through, Homescreen, Instructions, Closet,
 * Runway, and Podium
 */


public class ScreenManager {
    private static Button podiumButton = new Button("Winner or Loser?");
    static GraphicsGroup runwayReady = new GraphicsGroup();

    Image homeScreenPinkButton = new Image("assets/StartButton.png");
    Image InstructScreenReadyButton = new Image("assets/ReadyButton.png");

    Image themeDressUpButton = new Image ("assets/DressupButton.png");
    Image closetRunwayButton = new Image ("assets/RunwayButton.png");
    
    
    int dx = 5;
    static CanvasWindow canvas = new CanvasWindow("Fashion Famous",1920, 1080);
    TheMotherBoard motherBoard = new TheMotherBoard();



public ScreenManager(){
    ClosetManager.theCloset(canvas);
}

public void mainMenu(){
    Image homeScreen;
    homeScreen = new Image(0,0);
    homeScreen.setScale(0.75,0.75);
    homeScreen.setImagePath("assets/mainMenu.png");
    canvas.add(homeScreen);
    homeScreenPinkButton.setCenter(700, 700);
    homeScreenPinkButton.setScale(0.09);
    canvas.add(homeScreenPinkButton);

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == homeScreenPinkButton){
                canvas.removeAll();
            InstructionsManager.theInstructionsScreen(canvas, InstructScreenReadyButton);
            }

        }
    );

}


// public static String decision(){
//     for (GraphicsObject item: ClosetManager.getPlayerChoices()){
//         if(Winter.getWinningOutfit().contains(item)){
//             System.out.println("THE PLAYER OUTFIT" + playerChoices);
//             System.out.println("THE WINTER WINNER" + winter.getWinningOutfit());
//             score += 20;
//         }
//         if(school.getWinningOutfit().contains(item)){
//             System.out.println("THE PLAYER OUTFIT" + playerChoices);
//             System.out.println("THE SCHOOL WINNER" + beach.getWinningOutfit());
//             score += 20;
//         }
//         if(beach.getWinningOutfit().contains(item)){
//             System.out.println("THE PLAYER OUTFIT" + playerChoices);
//             System.out.println("THE BEACH WINNER" + beach.getWinningOutfit());
//             score += 20;
//         }
//     }
//     return "Your Score: " + score + "\n out of 100";
   
// }


public static void theRunway(){

    new Thread(() -> {
        AudioFilePlayer applause = new AudioFilePlayer();
        applause.play("res/applause.wav");
    }).start();

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
    canvas.add(ClosetManager.getRunwayReady());
}



public static void thePodium(){

    System.out.println("ScreenManger thinkings " + TheMotherBoard.getTheme());
    // GraphicsText scoreTally = new GraphicsText(decision());
    
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/WinterBeigeScarf.png"))){
        Image winterBackground = new Image(0,0);
        winterBackground.setScale(.75);
        winterBackground.setImagePath("assets/winter2.png");
        winterBackground.setPosition(-240, -150);
        canvas.add(winterBackground);
        // int padding = 25;
        //Displays the winning outfit
        // GraphicsGroup winningClothes = new GraphicsGroup();
        // for(Image cloth: winter.getWinningOutfit()){
        //     winningClothes.add(cloth);
        // }
        

    }else if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/SchoolScarf.png"))){
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

    ClosetManager.getRunwayReady().setScale(0.75);
    canvas.add(ClosetManager.getRunwayReady());
    runwayReady.setScale(0.75);
    runwayReady.setPosition(75 ,0);

    // decision();
    // scoreTally.setPosition(250, 350);
    // scoreTally.setFontSize(60);
    // canvas.add(scoreTally);

    Button quitButton = new Button("Quit?");
    quitButton.setPosition(400, 50);
    canvas.add(quitButton);

    quitButton.onClick(
        () ->  canvas.closeWindow()
    );

}

}
