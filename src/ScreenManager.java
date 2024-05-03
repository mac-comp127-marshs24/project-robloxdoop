import java.awt.Color;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;


/*
 * Manages all the screens the game goes through, Homescreen, Instructions, Closet,
 * Runway, and Podium
 */

public class ScreenManager {
    private static Image podiumButton = new Image("assets/102.png");


    private static Image homeScreenPinkButton = new Image("assets/StartButton.png");
    private static Image InstructScreenReadyButton = new Image("assets/ReadyButton.png");


    private static Image quitButton = new Image ("assets/QuitButton.png");
    private static GraphicsText winningOutfitText = new GraphicsText("The Judges' Pick!");
 
    private static CanvasWindow canvas = new CanvasWindow("Fashion Famous",1920, 1080);
    private static TheMotherBoard motherBoard = new TheMotherBoard(); //Not used but the program will not run without it
    static int padding = 25;



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

static double de = 0.75;
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
   

    canvas.animate( 
        () -> {
            if(ClosetManager.getRunwayReady().getScaleX() < 1.1){
                ClosetManager.getRunwayReady().setScale(de);
                de += 0.001;
            }
        }
    );

    podiumButton.setPosition(-830,-475);
    podiumButton.setScale(0.25);
    canvas.add(podiumButton);

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == podiumButton){
                canvas.removeAll();
                thePodium();
                canvas.add(ClosetManager.getRunwayReady());
            }

        }
    );
}



public static void thePodium(){
    Rectangle topPickBox = new Rectangle(1050, 100,350,600);

    
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/WinterBeigeScarf.png"))){
        Image winterBackground = new Image(0,0);
        winterBackground.setScale(.75);
        winterBackground.setImagePath("assets/winter2.png");
        winterBackground.setPosition(-240, -150);
        canvas.add(winterBackground);
        topPickBox.setFillColor(Color.PINK);
        topPickBox.setFilled(true);
        canvas.add(topPickBox);
        // Displays the winning outfit
        for(Image cloth: Winter.getWinningOutfit()){
            canvas.add(cloth);
            cloth.setCenter(1200,100+padding);
            cloth.setScale(0.15);
            padding += 100;
        }
        

    }else if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/SchoolScarf.png"))){
        Image schoolBackground = new Image(0,0);
        schoolBackground.setScale(.75);
        schoolBackground .setImagePath("assets/school2.png");
        schoolBackground.setPosition(-240, -150);
        canvas.add(schoolBackground);
        topPickBox.setFillColor(Color.PINK);
        topPickBox.setFilled(true);
        canvas.add(topPickBox);

        for(Image cloth: School.getWinningOutfit()){
            canvas.add(cloth);
            cloth.setCenter(1200,100+padding);
            cloth.setScale(0.15);
            padding += 100;
        }
    }
    else{
        Image beachBackground = new Image(0,0);
        beachBackground.setImagePath("assets/beach2.png");
        beachBackground.setScale(.75);
        beachBackground.setPosition(-240, -150);
        canvas.add(beachBackground);
        topPickBox.setFillColor(Color.PINK);
        topPickBox.setFilled(true);
        canvas.add(topPickBox);

        for(Image cloth: Beach.getWinningOutfit()){
            canvas.add(cloth);
            cloth.setCenter(1200,100+padding);
            cloth.setScale(0.15);
            padding += 100;
        }
    }

    ClosetManager.getRunwayReady().setScale(0.75);
    canvas.add(ClosetManager.getRunwayReady());
    ClosetManager.getRunwayReady().setScale(0.75);
    ClosetManager.getRunwayReady().setPosition(75 ,0);

    quitButton.setPosition(-830,-475);
    quitButton.setScale(0.25);
    canvas.add(quitButton);

    winningOutfitText.setCenter(1200,650);
    winningOutfitText.setFontStyle(FontStyle.BOLD);
    winningOutfitText.setScale(2);
    canvas.add(winningOutfitText);
    

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == quitButton){
                canvas.closeWindow();
            }

        }
    );

}

}
