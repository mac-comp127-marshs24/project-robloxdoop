
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import ThemesOutfit.School;
import ThemesOutfit.Winter;
import ThemesOutfit.Beach;
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
    private Button closetButton = new Button("Ready?");
    private Button podiumButton = new Button("Winner or Loser?");
    private Button closetButton2 = new Button("Let's get Dressed!");
    GraphicsGroup runwayReady = new GraphicsGroup();
    Image rightPinkButton = new Image("assets/RightButton.png");
    Image closetBackground;
    Image characterBase;


    Winter winter = new Winter();
    School school = new School();
    Beach beach = new Beach();
    GraphicsText Instructions = new GraphicsText("Hello Welcome to Fashion Famous!");
    GraphicsText Instructions1 = new GraphicsText("In this Game you will be given, ");
    int dx = 5;
    CanvasWindow canvas = new CanvasWindow("Project Runway",1920, 1080);
    TheMotherBoard motherBoard = new TheMotherBoard();



public ScreenManager(){
    theCloset();
    System.out.println("THE THEME!!!!" + TheMotherBoard.getTheme());
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
            Instructions.moveBy(dx,dy);}
            else if((Instructions1.getX() + Instructions1.getWidth() + 50 < canvas.getWidth())) {
                Instructions1.moveBy(dx,dy);} 
            
            
            
        }
    );
    closetButton.setPosition(600,50);
    canvas.add(closetButton);
}

public void theInstructionsScreen(){
    Image instructionsScreen;
    Instructions.setPosition(0, 250);
    Instructions1.setPosition(-100, 350);
    Instructions1.setFontSize(60);
    moveableText(Instructions, dx, 0);
    Instructions.setFontSize(60);

    instructionsScreen = new Image(0,0);
    instructionsScreen.setScale(0.75,0.75);
    instructionsScreen.setImagePath("assets/mainMenu2.png");

    canvas.add(instructionsScreen);
    canvas.add(Instructions);
    canvas.add(Instructions1);

    closetButton.onClick(() -> {
        System.out.println(TheMotherBoard.getTheme());
        canvas.removeAll();
        if(TheMotherBoard.getTheme().equals(winter.getWinningOutfit())){
            winterTheme();
        }if(TheMotherBoard.getTheme().equals(school.getWinningOutfit())){
            schoolTheme();
        }
        if(TheMotherBoard.getTheme().equals(beach.getWinningOutfit())){
           beachTheme();
        }
        
    });

}

public void winterTheme(){
    Image winterTheme = new Image(0,0);
    winterTheme.setImagePath("assets/winter2.png");
    canvas.add(winterTheme);
    closetButton2.setPosition(600,50);
    canvas.add(closetButton2);
    closetButton2.onClick(() -> {
        canvas.removeAll();
        theCloset();});
}

public void schoolTheme(){
    Image schoolTheme = new Image(0,0);
    schoolTheme.setImagePath("assets/school2.png");
    canvas.add(schoolTheme);
    closetButton2.setPosition(600,50);
    canvas.add(closetButton2);
    closetButton2.onClick(() -> {
        canvas.removeAll();
        theCloset();});
}


public void beachTheme(){
    Image beachTheme = new Image(0,0);
    beachTheme.setImagePath("assets/beach2.png");
    canvas.add(beachTheme);
    closetButton2.setPosition(600,50);
    canvas.add(closetButton2);
    closetButton2.onClick(() -> {
        canvas.removeAll();
        theCloset();});
}

 //FULL BODY BOXES
 Rectangle hatsBox = new Rectangle(0, 0, 100, 70);
 Rectangle neckBox = new Rectangle(0, 0, 100, 25);
 Rectangle topsBox = new Rectangle(0, 0, 150, 100);
 Rectangle bottomsBox = new Rectangle(0, 0, 150, 300);
 Rectangle shoesBox = new Rectangle(0, 0, 200, 70);


public void theCloset(){
    //CLOSET BACKGROUND
    closetBackground = new Image(0,0);
    closetBackground.setScale(0.75,0.75);
    closetBackground.setImagePath("assets/closet.png");
    canvas.add(closetBackground);

    //THE MODEL BODY
    characterBase = new Image(0,0);
    characterBase.setScale(0.9,0.9);
    characterBase.setPosition(540,25);
    characterBase.setImagePath("assets/model.png");
    canvas.add(characterBase);
    runwayReady.add(characterBase);

    //FULL BODY BUTTONS
    Button hatsLeftButton = new Button ("Left");
    Button hatsRightButton = new Button ("Right");

    Button neckLeftButton = new Button ("Left");
    Button neckRightButton = new Button ("Right");

    Button topsLeftButton = new Button("Left");
    Button topsRightButton = new Button("Right");

    Button bottomsLeftButton = new Button("Left");
    Button bottomsRightButton = new Button("Right");

    Button shoesLeftButton = new Button("Left");
    Button shoesRightButton = new Button("Right");

    //MANAGES THE HATS
    hatsBox.setStrokeWidth(10);
    hatsBox.setCenter(685, 70);
    hatsLeftButton.setPosition(hatsBox.getX() - 100,hatsBox.getY());
    hatsRightButton.setPosition(hatsBox.getX() + hatsBox.getWidth(),hatsBox.getY());
    canvas.add(hatsLeftButton);
    canvas.add(hatsRightButton);
    canvas.add(hatsBox);
    hatsLeftButton.onClick(
        () -> {
        changeHats(false);
        });

    hatsRightButton.onClick(
            () -> {
            changeHats(true);   
            });


     //MANAGES THE NECK
    neckBox.setStrokeWidth(10);
    neckBox.setCenter(685, 190);
    neckLeftButton.setPosition(neckBox.getX() - 100,neckBox.getY());
    neckRightButton.setPosition(neckBox.getX() + neckBox.getWidth(),neckBox.getY());
    canvas.add(neckLeftButton);
    canvas.add(neckRightButton);
    canvas.add(neckBox);
    neckLeftButton.onClick(
        () -> {
        changeNeck(false);
        });

    neckRightButton.onClick(
            () -> {
            changeNeck(true);   
            });

     //MANAGES THE TOPS
    topsBox.setStrokeWidth(10);
    topsBox.setCenter(675, 275);
    topsLeftButton.setPosition(topsBox.getX()- 100, topsBox.getY());
    topsRightButton.setPosition(topsBox.getX() + topsBox.getWidth(),topsBox.getY());
    canvas.add(topsLeftButton);
    canvas.add(topsRightButton);
    canvas.add(topsBox);
    topsLeftButton.onClick(
        () -> {
        changeTops(false);
        });

    topsRightButton.onClick(
            () -> {
            changeTops(true);   
            });

    //MANAGES THE BOTTOMS
    bottomsBox.setStrokeWidth(10);
    bottomsBox.setCenter(675, 490);
    bottomsLeftButton.setPosition(bottomsBox.getX()- 100, bottomsBox.getY());
    bottomsRightButton.setPosition(bottomsBox.getX() + bottomsBox.getWidth(),bottomsBox.getY());
    canvas.add(bottomsLeftButton);
    canvas.add(bottomsRightButton);
    canvas.add(bottomsBox);
    bottomsLeftButton.onClick(
        () -> {
        changeBottoms(false);
        });

    bottomsRightButton.onClick(
            () -> {
            changeBottoms(true);   
            });

     //MANAGES THE SHOES
    shoesBox.setStrokeWidth(10);
    shoesBox.setCenter(640, 720);
    shoesLeftButton.setPosition(shoesBox.getX()- 100, shoesBox.getY());
    shoesRightButton.setPosition(shoesBox.getX() + shoesBox.getWidth(),shoesBox.getY());
    canvas.add(shoesLeftButton);
    canvas.add(shoesRightButton);
    canvas.add(shoesBox);
    shoesLeftButton.onClick(
        () -> {
        changeShoes(false);
        });

    shoesRightButton.onClick(
            () -> {
            changeShoes(true);   
            });

    

    //MANAGES THE THEMES ADD THE CLOTHES ITEMS WITH THE SHOES
    if(TheMotherBoard.getTheme().equals(winter.getWinningOutfit())){
    // winter.getwinterHats().get(0).setPosition(0,0); FOR TESTINGGNGNGN
    winter.getwinterHats().get(0).setCenter(hatsBox.getCenter());
    winter.getwinterHats().get(0).setScale(0.4);
    canvas.add(winter.getwinterHats().get(0));
    runwayReady.add(winter.getwinterHats().get(0));
    playerChoices.add(winter.getwinterHats().get(0));

    winter.getwinterNeck().get(0).setCenter(neckBox.getCenter());
    winter.getwinterNeck().get(0).setScale(0.4);
    canvas.add(winter.getwinterNeck().get(0));
    runwayReady.add(winter.getwinterNeck().get(0));
    playerChoices.add(winter.getwinterNeck().get(0));


    winter.getwinterTops().get(0).setCenter(topsBox.getCenter());
    winter.getwinterTops().get(0).setScale(0.3);
    canvas.add(winter.getwinterTops().get(0));
    runwayReady.add(winter.getwinterTops().get(0));
    playerChoices.add(winter.getwinterTops().get(0));


    winter.getwinterBottoms().get(0).setCenter(bottomsBox.getCenter());
    winter.getwinterBottoms().get(0).setScale(0.4);
    canvas.add(winter.getwinterBottoms().get(0));
    runwayReady.add(winter.getwinterBottoms().get(0));
    playerChoices.add(winter.getwinterBottoms().get(0));

    winter.getwinterShoes().get(0).setCenter(shoesBox.getCenter());
    winter.getwinterShoes().get(0).setScale(0.4);
    canvas.add(winter.getwinterShoes().get(0));
    runwayReady.add(winter.getwinterShoes().get(0));
    playerChoices.add(winter.getwinterShoes().get(0));


    
    } else if(TheMotherBoard.getTheme().equals(school.getWinningOutfit())){
        school.getschoolHats().get(0).setCenter(hatsBox.getCenter());
        school.getschoolHats().get(0).setScale(0.4);
        canvas.add(school.getschoolHats().get(0));
        runwayReady.add(school.getschoolHats().get(0));
        playerChoices.add(school.getschoolHats().get(0));

        school.getschoolNeck().get(0).setCenter(neckBox.getCenter());
        school.getschoolNeck().get(0).setScale(0.4);
        canvas.add(school.getschoolNeck().get(0));
        runwayReady.add(school.getschoolNeck().get(0));
        playerChoices.add(school.getschoolNeck().get(0));
    
        school.getschoolTops().get(0).setCenter(topsBox.getCenter());
        school.getschoolTops().get(0).setScale(0.4);
        canvas.add(school.getschoolTops().get(0));
        runwayReady.add(school.getschoolTops().get(0));
        playerChoices.add(school.getschoolTops().get(0));

        school.getschoolBottoms().get(0).setCenter(bottomsBox.getCenter());
        school.getschoolBottoms().get(0).setScale(0.4);
        canvas.add(school.getschoolBottoms().get(0));
        runwayReady.add(school.getschoolBottoms().get(0));
        playerChoices.add(school.getschoolBottoms().get(0));
    
        school.getschoolShoes().get(0).setCenter(shoesBox.getCenter());
        school.getschoolShoes().get(0).setScale(0.4);
        canvas.add(school.getschoolShoes().get(0));
        runwayReady.add(school.getschoolShoes().get(0));
        playerChoices.add(school.getschoolShoes().get(0));
    
    }
    else{
        beach.getBeachHats().get(0).setCenter(hatsBox.getCenter());
        beach.getBeachHats().get(0).setScale(0.4);
        canvas.add(beach.getBeachHats().get(0));
        runwayReady.add(beach.getBeachHats().get(0));
        playerChoices.add(beach.getBeachHats().get(0));
    
        beach.getBeachNeck().get(0).setCenter(neckBox.getCenter());
        beach.getBeachNeck().get(0).setScale(0.4);
        canvas.add(beach.getBeachNeck().get(0));
        runwayReady.add(beach.getBeachNeck().get(0));
        playerChoices.add(beach.getBeachNeck().get(0));
    
        beach.getBeachTops().get(0).setCenter(topsBox.getCenter());
        beach.getBeachTops().get(0).setScale(0.4);
        canvas.add(beach.getBeachTops().get(0));
        runwayReady.add(beach.getBeachTops().get(0));
        playerChoices.add(beach.getBeachTops().get(0));

        beach.getBeachBottoms().get(0).setCenter(bottomsBox.getCenter());
        beach.getBeachBottoms().get(0).setScale(0.4);
        canvas.add(beach.getBeachBottoms().get(0));
        runwayReady.add(beach.getBeachBottoms().get(0));
        playerChoices.add(beach.getBeachBottoms().get(0));
    
        beach.getBeachShoes().get(0).setCenter(shoesBox.getCenter());
        beach.getBeachShoes().get(0).setScale(0.4);
        canvas.add(beach.getBeachShoes().get(0));
        runwayReady.add(beach.getBeachShoes().get(0));
        playerChoices.add(beach.getBeachShoes().get(0));
      
    }





    canvas.onClick(e -> {
        System.out.println(e.getPosition());
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
int score = 0;

    int indexofHats = 0;
    int indexofNeck = 0;
    int indexofTops = 0;
    int indexofBottoms = 0;
    int indexofShoes = 0;

public String decision(){
    for (GraphicsObject item: playerChoices){
        if(winter.getWinningOutfit().contains(item)){
            System.out.println("THE PLAYER OUTFIT" + playerChoices);
            System.out.println("THE WINTER WINNER" + winter.getWinningOutfit());
            score += 20;
        }
    }
    return "Your Score: " + score + "\n out of 100";
   
}

public void changeHats(boolean moveForward){
    //WINTER HATS
    if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/WinterBeigeScarf.png"))){
    canvas.remove(winter.getwinterHats().get(indexofHats));
    runwayReady.remove(winter.getwinterHats().get(indexofHats));
    playerChoices.remove(winter.getwinterHats().get(indexofHats));

    if(moveForward){
        indexofHats ++;
    }
    else{
    indexofHats --;
    }

    if(indexofHats  > winter.getwinterHats().size() - 1){
        indexofHats  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = winter.getwinterHats().size() - 1;
    }

    // winter.getwinterHats().get(0).setPosition(0,0); FOR TESTING
    winter.getwinterHats().get(indexofHats).setCenter(hatsBox.getCenter());
    winter.getwinterHats().get(indexofHats).setScale(0.4);
    canvas.add(winter.getwinterHats().get(indexofHats));
    runwayReady.add(winter.getwinterHats().get(indexofHats));
    playerChoices.add(winter.getwinterHats().get(indexofHats));
}

    //SCHOOL HATS
    if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/SchoolScarf.png"))){
    canvas.remove(school.getschoolHats().get(indexofHats));
    runwayReady.remove(school.getschoolHats().get(indexofHats));
    playerChoices.remove(school.getschoolHats().get(indexofHats));

    if(moveForward){
        indexofHats ++;
    }
    else{
    indexofHats --;
    }

    if(indexofHats  > school.getschoolHats().size() - 1){
        indexofHats  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = school.getschoolHats().size() - 1;
    }

    // winter.getwinterHats().get(0).setPosition(0,0); FOR TESTING
    school.getschoolHats().get(indexofHats).setCenter(hatsBox.getCenter());
    school.getschoolHats().get(indexofHats).setScale(0.4);
    canvas.add(school.getschoolHats().get(indexofHats));
    runwayReady.add(school.getschoolHats().get(indexofHats));
    playerChoices.add(school.getschoolHats().get(indexofHats));

    }

    //BEACH HATS
    if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/TwoStackedPinkNecklace.png"))){
    canvas.remove(beach.getBeachHats().get(indexofHats));
    runwayReady.remove(beach.getBeachHats().get(indexofHats));
    playerChoices.remove(beach.getBeachHats().get(indexofHats));

    if(moveForward){
        indexofHats ++;
    }
    else{
    indexofHats --;
    }

    if(indexofHats  > beach.getBeachHats().size() - 1){
        indexofHats  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = beach.getBeachHats().size() - 1;
    }

    // winter.getwinterHats().get(0).setPosition(0,0); FOR TESTING
    beach.getBeachHats().get(indexofHats).setCenter(hatsBox.getCenter());
    beach.getBeachHats().get(indexofHats).setScale(0.4);
    canvas.add(beach.getBeachHats().get(indexofHats));
    runwayReady.add(beach.getBeachHats().get(indexofHats));
    playerChoices.add(beach.getBeachHats().get(indexofHats));

    }
}

public void changeNeck(boolean moveForward){

    //WINTER NECKS
    if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/WinterBeigeScarf.png"))){
    canvas.remove(winter.getwinterNeck().get(indexofNeck));
    runwayReady.remove(winter.getwinterNeck().get(indexofNeck));
    playerChoices.remove(winter.getwinterNeck().get(indexofNeck));

    if(moveForward){
        indexofNeck ++;
    }
    else{
    indexofNeck --;
    }


    if(indexofNeck  > winter.getwinterNeck().size() - 1){
        indexofNeck  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = winter.getwinterNeck().size() - 1;
    }

    // winter.getwinterNeck().get(0).setPosition(0,0);
    winter.getwinterNeck().get(indexofNeck).setCenter(neckBox.getCenter());
    winter.getwinterNeck().get(indexofNeck).setScale(0.4);
    canvas.add(winter.getwinterNeck().get(indexofNeck));
    runwayReady.add(winter.getwinterNeck().get(indexofNeck));
    playerChoices.add(winter.getwinterNeck().get(indexofNeck));


}

    //SCHOOL NECKS
    if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/SchoolScarf.png"))){
    canvas.remove(school.getschoolNeck().get(indexofNeck));
    runwayReady.remove(school.getschoolNeck().get(indexofNeck));
    playerChoices.remove(school.getschoolNeck().get(indexofNeck));

    if(moveForward){
        indexofNeck ++;
    }
    else{
    indexofNeck --;
    }


    if(indexofNeck  > school.getschoolNeck().size() - 1){
        indexofNeck  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = school.getschoolNeck().size() - 1;
    }

    // winter.getwinterNeck().get(0).setPosition(0,0);
    school.getschoolNeck().get(indexofNeck).setCenter(neckBox.getCenter());
    school.getschoolNeck().get(indexofNeck).setScale(0.4);
    canvas.add(school.getschoolNeck().get(indexofNeck));
    runwayReady.add(school.getschoolNeck().get(indexofNeck));
    playerChoices.add(school.getschoolNeck().get(indexofNeck));
}

    //BEACH NECKS
if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/TwoStackedPinkNecklace.png"))){
    canvas.remove(beach.getBeachNeck().get(indexofNeck));
    runwayReady.remove(beach.getBeachNeck().get(indexofNeck));
    playerChoices.remove(beach.getBeachNeck().get(indexofNeck));

    if(moveForward){
        indexofNeck ++;
    }
    else{
    indexofNeck --;
    }


    if(indexofNeck  > beach.getBeachNeck().size() - 1){
        indexofNeck  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = beach.getBeachNeck().size() - 1;
    }

    // winter.getwinterNeck().get(0).setPosition(0,0);
    beach.getBeachNeck().get(indexofNeck).setCenter(neckBox.getCenter());
    beach.getBeachNeck().get(indexofNeck).setScale(0.4);
    canvas.add(beach.getBeachNeck().get(indexofNeck));
    runwayReady.add(beach.getBeachNeck().get(indexofNeck));
    playerChoices.add(beach.getBeachNeck().get(indexofNeck));
}

}


public void changeTops(boolean moveForward){
    //WINTER TOPS
    if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/WinterBeigeScarf.png"))){
        canvas.remove(winter.getwinterTops().get(indexofTops));
        runwayReady.remove(winter.getwinterTops().get(indexofTops));
        playerChoices.remove(winter.getwinterTops().get(indexofTops));

        if(moveForward){
        System.out.println("HEYYEYEIHF");
        indexofTops ++;
        }
        else{
        indexofTops --;
        }

        if(indexofTops  > winter.getwinterTops().size() - 1){
        indexofTops  = 0;
        }
        if(indexofTops  < 0){
        indexofTops  = winter.getwinterTops().size() - 1;
        }

    // winter.getwinterTops().get(0).setPosition(0,0);
        winter.getwinterTops().get(indexofTops).setCenter(topsBox.getCenter());
        winter.getwinterTops().get(indexofTops).setScale(0.3);
        canvas.add(winter.getwinterTops().get(indexofTops));
        runwayReady.add(winter.getwinterTops().get(indexofTops));
        playerChoices.add(winter.getwinterTops().get(indexofTops));
    }




    //SCHOOL TOPS
    if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/SchoolScarf.png"))){
        canvas.remove(school.getschoolTops().get(indexofTops));
        runwayReady.remove(school.getschoolTops().get(indexofTops));
        playerChoices.remove(school.getschoolTops().get(indexofTops));
    
        if(moveForward){
            indexofTops ++;
        }
        else{
        indexofTops --;
        }
    
        if(indexofTops  > school.getschoolTops().size() - 1){
            indexofTops  = 0;
        }
        if(indexofTops  < 0){
            indexofTops  = school.getschoolTops().size() - 1;
        }
    
        // winter.getwinterTops().get(0).setPosition(0,0);
        school.getschoolTops().get(indexofTops).setCenter(topsBox.getCenter());
        school.getschoolTops().get(indexofTops).setScale(0.3);
        canvas.add(school.getschoolTops().get(indexofTops));
        runwayReady.add(school.getschoolTops().get(indexofTops));
        playerChoices.add(school.getschoolTops().get(indexofTops));
        }



        //BEACH TOPS
        if(TheMotherBoard.getTheme().contains(new Image("assets_Clothes/TwoStackedPinkNecklace.png"))){
            canvas.remove(beach.getBeachTops().get(indexofTops));
            runwayReady.remove(beach.getBeachTops().get(indexofTops));
            playerChoices.remove(beach.getBeachTops().get(indexofTops));
        
            if(moveForward){
                indexofTops ++;
            }
            else{
            indexofTops --;
            }
        
            if(indexofTops  > beach.getBeachTops().size() - 1){
                indexofTops  = 0;
            }
            if(indexofTops  < 0){
                indexofTops  = beach.getBeachTops().size() - 1;
            }
        
            // winter.getwinterTops().get(0).setPosition(0,0);
            beach.getBeachTops().get(indexofTops).setCenter(topsBox.getCenter());
            beach.getBeachTops().get(indexofTops).setScale(0.3);
            canvas.add(beach.getBeachTops().get(indexofTops));
            runwayReady.add(beach.getBeachTops().get(indexofTops));
            playerChoices.add(beach.getBeachTops().get(indexofTops));
            }
}

public void changeBottoms(boolean moveForward){
    canvas.remove(winter.getwinterBottoms().get(indexofBottoms));
    runwayReady.remove(winter.getwinterBottoms().get(indexofBottoms));
    playerChoices.remove(winter.getwinterBottoms().get(indexofBottoms));

    if(moveForward){
        indexofBottoms ++;
        System.out.println("HEYYEYEIHF");
        System.out.println("THE THEMMMEEE" + winter.getWinningOutfit());
        System.out.println("THE MOTHER BOATDERR THEME" + TheMotherBoard.getTheme());
    }
    else{
    indexofBottoms --;
    }

    if(indexofBottoms  > winter.getwinterBottoms().size() - 1){
        indexofBottoms  = 0;
    }
    if(indexofBottoms  < 0){
        indexofBottoms  = winter.getwinterBottoms().size() - 1;
    }

    // winter.getwinterTops().get(0).setPosition(0,0);
    winter.getwinterBottoms().get(indexofBottoms).setCenter(bottomsBox.getCenter());
    winter.getwinterBottoms().get(indexofBottoms).setScale(0.3);
    canvas.add(winter.getwinterBottoms().get(indexofBottoms));
    runwayReady.add(winter.getwinterBottoms().get(indexofBottoms));
    playerChoices.add(winter.getwinterBottoms().get(indexofBottoms));

}

public void changeShoes(boolean moveForward){
    canvas.remove(winter.getwinterShoes().get(indexofShoes));
    runwayReady.remove(winter.getwinterShoes().get(indexofShoes));
    playerChoices.remove(winter.getwinterShoes().get(indexofShoes));

    if(moveForward){
        indexofShoes ++;
    }
    else{
    indexofShoes --;
    }
    if(indexofShoes  > winter.getwinterShoes().size() - 1){
        indexofShoes  = 0;
    }
    if(indexofShoes  < 0){
        indexofShoes  = winter.getwinterShoes().size() - 1;
    }

    // winter.getwinterTops().get(0).setPosition(0,0);
    winter.getwinterShoes().get(indexofShoes).setCenter(shoesBox.getCenter());
    winter.getwinterShoes().get(indexofShoes).setScale(0.3);
    canvas.add(winter.getwinterShoes().get(indexofShoes));
    runwayReady.add(winter.getwinterShoes().get(indexofShoes));
    playerChoices.add(winter.getwinterShoes().get(indexofShoes));

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
    GraphicsText scoreTally = new GraphicsText(decision());
    
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

    decision();
    scoreTally.setPosition(250, 350);
    scoreTally.setFontSize(60);
    canvas.add(scoreTally);

    Button quitButton = new Button("Quit?");
    quitButton.setPosition(400, 50);
    canvas.add(quitButton);


    quitButton.onClick(
        () ->  canvas.closeWindow()
    );

}


}
