import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;

public class ClosetManager {
    static Image closetBackground;
    static Image characterBase;
    static Image proTip = new Image("assets/ProTip.png");

    static GraphicsText hatsSign = new GraphicsText("Hats");
    static GraphicsText neckSign = new GraphicsText("Necks");
    static GraphicsText topsSign = new GraphicsText("Tops");
    static GraphicsText bottomsSign = new GraphicsText("Bottoms");
    static GraphicsText shoesSign = new GraphicsText("Shoes");

    static GraphicsGroup runwayReady = new GraphicsGroup();
    static Rectangle hatsBox = new Rectangle(0, 0, 100, 70);
    static Rectangle neckBox = new Rectangle(0, 0, 100, 25);
    static Rectangle topsBox = new Rectangle(0, 0, 150, 100);
    static Rectangle bottomsBox = new Rectangle(0, 0, 150, 300);
    static Rectangle shoesBox = new Rectangle(0, 0, 200, 70);

    static double hatScale = 0.3;
    static double neckScale = 0.27;
    static double topsScale = 0.25;
    static double bottomScale = .55;
    static double shoeScale = .15;
    static int score = 0;

    static int indexofHats = 0;
    static int indexofNeck = 0;
    static int indexofTops = 0;
    static int indexofBottoms = 0;
    static int indexofShoes = 0;

    private static Image runwayButton =  new Image("assets/RunwayButton.png");

    static List<Image> playerChoices = new ArrayList<Image>();

    public static GraphicsGroup getRunwayReady(){
        return runwayReady;
    }

    public static List<Image> getPlayerChoices(){
        return playerChoices;
    }

    public static void theCloset(CanvasWindow canvas){

    
    //CLOSET BACKGROUND
    closetBackground = new Image(0,0);
    closetBackground.setScale(0.75,0.75);
    closetBackground.setImagePath("assets/closet.png");
    canvas.add(closetBackground);

    //PRO TIP WORDS
    canvas.add(proTip);
    proTip.setPosition(300,100);
    proTip.setScale(0.15);

    //CATORGOTRIC LABEL SIGNS
    canvas.add(hatsSign);
    hatsSign.setPosition(1310,100);
    hatsSign.setScale(1);

    canvas.add(neckSign);
    neckSign.setPosition(1305,200);
    neckSign.setScale(1);

    canvas.add(topsSign);
    topsSign.setPosition(1305,300);
    topsSign.setScale(1);

    canvas.add(bottomsSign);
    bottomsSign.setPosition(1300,400);
    bottomsSign.setScale(1);

    canvas.add(shoesSign);
    shoesSign.setPosition(1300,500);
    shoesSign.setScale(1);

    //THE MODEL BODY
    characterBase = new Image(0,0);
    characterBase.setScale(0.9,0.9);
    characterBase.setPosition(540,25);
    characterBase.setImagePath("assets/model.png");
    canvas.add(characterBase);
    runwayReady.add(characterBase);


    Image hatsRightButton = new Image("assets/RightButton2.png");
    Image hatsLeftButton = new Image("assets/LeftButton2.png");

    Image neckRightButton = new Image("assets/RightButton2.png");
    Image neckLeftButton = new Image("assets/LeftButton2.png");

    Image topsRightButton = new Image("assets/RightButton2.png");
    Image topsLeftButton = new Image("assets/LeftButton2.png");

    Image bottomsRightButton = new Image("assets/RightButton2.png");
    Image bottomsLeftButton = new Image("assets/LeftButton2.png");

    Image shoesRightButton = new Image("assets/RightButton2.png");
    Image shoesLeftButton = new Image("assets/LeftButton2.png");

    double buttonScale = 0.15;

    //MANAGES THE HATS
    hatsBox.setStrokeWidth(10);
    hatsBox.setStroked(false); //USE ONCE ALL THE OBJECT ARE SET PROPERLY
    hatsBox.setCenter(650, 105);

    hatsLeftButton.setCenter(1275,90);
    hatsRightButton.setCenter(1375,85);

    hatsLeftButton.setScale(buttonScale);
    hatsRightButton.setScale(buttonScale);

    canvas.add(hatsLeftButton);
    canvas.add(hatsRightButton);
    canvas.add(hatsBox);

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == hatsLeftButton){
                changeHats(false, canvas);
            }

        }
    );

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == hatsRightButton){
                changeHats(true, canvas);
            }

        }
    );


     //MANAGES THE NECK
    neckBox.setStrokeWidth(10);
    neckBox.setStroked(false);
    neckBox.setCenter(680, 230);

    neckLeftButton.setCenter(1275,190);
    neckRightButton.setCenter(1375,185);

    neckLeftButton.setScale(buttonScale);
    neckRightButton.setScale(buttonScale);

    canvas.add(neckLeftButton);
    canvas.add(neckRightButton);
    canvas.add(neckBox);

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == neckLeftButton){
                changeNeck(false, canvas);
            }

        }
    );

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == neckRightButton){
                changeNeck(true, canvas);
            }

        }
    );

     //MANAGES THE TOPS
    topsBox.setStrokeWidth(10);
    topsBox.setCenter(670, 280);
    topsBox.setStroked(false);

    topsLeftButton.setCenter(1275,290);
    topsRightButton.setCenter(1375,285);

    topsLeftButton.setScale(buttonScale);
    topsRightButton.setScale(buttonScale);

    canvas.add(topsLeftButton);
    canvas.add(topsRightButton);
    canvas.add(topsBox);

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == topsLeftButton){
                changeTops(false, canvas);
            }

        }
    );

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == topsRightButton){
                changeTops(true, canvas);
            }

        }
    );

    //MANAGES THE BOTTOMS
    bottomsBox.setStrokeWidth(10);
    bottomsBox.setCenter(710, 515); //move up = subtraction, move left = subtract
    bottomsBox.setStroked(false);

    bottomsLeftButton.setCenter(1275,390);
    bottomsRightButton.setCenter(1375,385);

    bottomsLeftButton.setScale(buttonScale);
    bottomsRightButton.setScale(buttonScale);

    canvas.add(bottomsLeftButton);
    canvas.add(bottomsRightButton);
    canvas.add(bottomsBox);

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == bottomsLeftButton){
                changeBottoms(false, canvas);
            }

        }
    );

        canvas.onClick(
            event -> {event.getPosition();
                if(canvas.getElementAt(event.getPosition()) == bottomsRightButton){
                    changeBottoms(true, canvas);
                }
    
            }
        );

     //MANAGES THE SHOES
    shoesBox.setStrokeWidth(10);
    shoesBox.setCenter(650, 690);
    shoesBox.setStroked(false);


    shoesLeftButton.setCenter(1275,490);
    shoesRightButton.setCenter(1375,485);

    shoesLeftButton.setScale(buttonScale);
    shoesRightButton.setScale(buttonScale);


    canvas.add(shoesLeftButton);
    canvas.add(shoesRightButton);
    canvas.add(shoesBox);

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == shoesRightButton){
                        changeShoes(true, canvas);
                    }
        
                }
            );

    canvas.onClick(
       event -> {event.getPosition();
        if(canvas.getElementAt(event.getPosition()) == shoesLeftButton){
          changeShoes(false, canvas);
              }
                
           }
 );

    

    //MANAGES THE THEMES ADD THE CLOTHES ITEMS WITH THE SHOES
    if(TheMotherBoard.getTheme().equals(Winter.getOutfitComparision())){
    playerChoices.add(Winter.getwinterHats().get(0));
    Winter.getwinterHats().get(0).setCenter(hatsBox.getCenter());
    Winter.getwinterHats().get(0).setScale(hatScale);
    canvas.add(Winter.getwinterHats().get(0));
    runwayReady.add(Winter.getwinterHats().get(0));

    playerChoices.add(Winter.getwinterNeck().get(0));
    Winter.getwinterNeck().get(0).setCenter(neckBox.getCenter());
    Winter.getwinterNeck().get(0).setScale(neckScale);
    canvas.add(Winter.getwinterNeck().get(0));
    runwayReady.add(Winter.getwinterNeck().get(0));


    Winter.getwinterTops().get(0).setCenter(topsBox.getCenter());
    Winter.getwinterTops().get(0).setScale(topsScale);
    canvas.add(Winter.getwinterTops().get(0));
    runwayReady.add(Winter.getwinterTops().get(0));
    playerChoices.add(Winter.getwinterTops().get(0));


    Winter.getwinterBottoms().get(0).setCenter(bottomsBox.getCenter());
    Winter.getwinterBottoms().get(0).setScale(bottomScale);
    canvas.add(Winter.getwinterBottoms().get(0));
    runwayReady.add(Winter.getwinterBottoms().get(0));
    playerChoices.add(Winter.getwinterBottoms().get(0));

    Winter.getwinterShoes().get(0).setCenter(shoesBox.getCenter());
    Winter.getwinterShoes().get(0).setScale(shoeScale); 
    canvas.add(Winter.getwinterShoes().get(0));
    runwayReady.add(Winter.getwinterShoes().get(0));
    playerChoices.add(Winter.getwinterShoes().get(0));


    
    } else if(TheMotherBoard.getTheme().equals(School.getOutfitComparision())){
        School.getschoolHats().get(0).setCenter(hatsBox.getCenter());
        School.getschoolHats().get(0).setScale(hatScale);
        canvas.add(School.getschoolHats().get(0));
        runwayReady.add(School.getschoolHats().get(0));
        playerChoices.add(School.getschoolHats().get(0));

        School.getschoolNeck().get(0).setCenter(neckBox.getCenter());
        School.getschoolNeck().get(0).setScale(neckScale);
        canvas.add(School.getschoolNeck().get(0));
        runwayReady.add(School.getschoolNeck().get(0));
        playerChoices.add(School.getschoolNeck().get(0));
    
        School.getschoolTops().get(0).setCenter(topsBox.getCenter());
        School.getschoolTops().get(0).setScale(topsScale);
        canvas.add(School.getschoolTops().get(0));
        runwayReady.add(School.getschoolTops().get(0));
        playerChoices.add(School.getschoolTops().get(0));

        School.getschoolBottoms().get(0).setCenter(bottomsBox.getCenter());
        School.getschoolBottoms().get(0).setScale(bottomScale);
        canvas.add(School.getschoolBottoms().get(0));
        runwayReady.add(School.getschoolBottoms().get(0));
        playerChoices.add(School.getschoolBottoms().get(0));
    
        School.getschoolShoes().get(0).setCenter(shoesBox.getCenter());
        School.getschoolShoes().get(0).setScale(shoeScale);
        canvas.add(School.getschoolShoes().get(0));
        runwayReady.add(School.getschoolShoes().get(0));
        playerChoices.add(School.getschoolShoes().get(0));
    
    }
    else{
        Beach.getBeachHats().get(0).setCenter(hatsBox.getCenter());
        Beach.getBeachHats().get(0).setScale(hatScale);
        canvas.add(Beach.getBeachHats().get(0));
        runwayReady.add(Beach.getBeachHats().get(0));
        playerChoices.add(Beach.getBeachHats().get(0));
    
        Beach.getBeachNeck().get(0).setCenter(neckBox.getCenter());
        Beach.getBeachNeck().get(0).setScale(neckScale);
        canvas.add(Beach.getBeachNeck().get(0));
        runwayReady.add(Beach.getBeachNeck().get(0));
        playerChoices.add(Beach.getBeachNeck().get(0));
    
        Beach.getBeachTops().get(0).setCenter(topsBox.getCenter());
        Beach.getBeachTops().get(0).setScale(topsScale);
        canvas.add(Beach.getBeachTops().get(0));
        runwayReady.add(Beach.getBeachTops().get(0));
        playerChoices.add(Beach.getBeachTops().get(0));

        Beach.getBeachBottoms().get(0).setCenter(bottomsBox.getCenter());
        Beach.getBeachBottoms().get(0).setScale(bottomScale);
        canvas.add(Beach.getBeachBottoms().get(0));
        runwayReady.add(Beach.getBeachBottoms().get(0));
        playerChoices.add(Beach.getBeachBottoms().get(0));
    
        Beach.getBeachShoes().get(0).setCenter(shoesBox.getCenter());
        Beach.getBeachShoes().get(0).setScale(shoeScale);
        canvas.add(Beach.getBeachShoes().get(0));
        runwayReady.add(Beach.getBeachShoes().get(0));
        playerChoices.add(Beach.getBeachShoes().get(0));
      
    }

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == runwayButton){
                canvas.removeAll();
                ScreenManager.theRunway();
                canvas.add(runwayReady);

            }

        }
    );
        
    runwayButton.setCenter(165,65);
    canvas.add(runwayButton);
    runwayButton.setScale(0.25);
}
    



public static void changeHats(boolean moveForward, CanvasWindow canvas){
    //Winter HATS
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/WinterBeigeScarf.png"))){
    canvas.remove(Winter.getwinterHats().get(indexofHats));
    runwayReady.remove(Winter.getwinterHats().get(indexofHats));
    playerChoices.remove(Winter.getwinterHats().get(indexofHats));

    if(moveForward){
        indexofHats ++;
    }
    else{
    indexofHats --;
    }

    if(indexofHats  > Winter.getwinterHats().size() - 1){
        indexofHats  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = Winter.getwinterHats().size() - 1;
    }

    // Winter.getwinterHats().get(0).setPosition(0,0); FOR TESTING
    Winter.getwinterHats().get(indexofHats).setCenter(hatsBox.getCenter());
    Winter.getwinterHats().get(indexofHats).setScale(hatScale);
    canvas.add(Winter.getwinterHats().get(indexofHats));
    runwayReady.add(Winter.getwinterHats().get(indexofHats));
    playerChoices.add(Winter.getwinterHats().get(indexofHats));
}

    //School HATS
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/SchoolScarf.png"))){
    canvas.remove(School.getschoolHats().get(indexofHats));
    runwayReady.remove(School.getschoolHats().get(indexofHats));
    playerChoices.remove(School.getschoolHats().get(indexofHats));

    if(moveForward){
        indexofHats ++;
    }
    else{
    indexofHats --;
    }

    if(indexofHats  > School.getschoolHats().size() - 1){
        indexofHats  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = School.getschoolHats().size() - 1;
    }

    School.getschoolHats().get(indexofHats).setCenter(hatsBox.getCenter());
    School.getschoolHats().get(indexofHats).setScale(hatScale);
    canvas.add(School.getschoolHats().get(indexofHats));
    runwayReady.add(School.getschoolHats().get(indexofHats));
    playerChoices.add(School.getschoolHats().get(indexofHats));

    }

    //Beach HATS
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/TwoStackedPinkNecklace.png"))){
    canvas.remove(Beach.getBeachHats().get(indexofHats));
    runwayReady.remove(Beach.getBeachHats().get(indexofHats));
    playerChoices.remove(Beach.getBeachHats().get(indexofHats));

    if(moveForward){
        indexofHats ++;
    }
    else{
    indexofHats --;
    }

    if(indexofHats  > Beach.getBeachHats().size() - 1){
        indexofHats  = 0;
    }
    if(indexofHats  < 0){
        indexofHats  = Beach.getBeachHats().size() - 1;
    }

    Beach.getBeachHats().get(indexofHats).setCenter(hatsBox.getCenter());
    Beach.getBeachHats().get(indexofHats).setScale(hatScale);
    canvas.add(Beach.getBeachHats().get(indexofHats));
    runwayReady.add(Beach.getBeachHats().get(indexofHats));
    playerChoices.add(Beach.getBeachHats().get(indexofHats));

    }
}

public static void changeNeck(boolean moveForward, CanvasWindow canvas){

    //Winter NECKS
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/WinterBeigeScarf.png"))){
    canvas.remove(Winter.getwinterNeck().get(indexofNeck));
    ClosetManager.getRunwayReady().remove(Winter.getwinterNeck().get(indexofNeck));
    playerChoices.remove(Winter.getwinterNeck().get(indexofNeck));

    if(moveForward){
        indexofNeck ++;
    }
    else{
    indexofNeck --;
    }


    if(indexofNeck  > Winter.getwinterNeck().size() - 1){
        indexofNeck  = 0;
    }
    if(indexofNeck  < 0){
        indexofNeck  = Winter.getwinterNeck().size() - 1;
    }

    playerChoices.add(Winter.getwinterNeck().get(indexofNeck));
    Winter.getwinterNeck().get(indexofNeck).setCenter(neckBox.getCenter());
    Winter.getwinterNeck().get(indexofNeck).setScale(neckScale);
    canvas.add(Winter.getwinterNeck().get(indexofNeck));
    ClosetManager.getRunwayReady().add(Winter.getwinterNeck().get(indexofNeck));


}

    //School NECKS
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/SchoolScarf.png"))){
    canvas.remove(School.getschoolNeck().get(indexofNeck));
    runwayReady.remove(School.getschoolNeck().get(indexofNeck));
    playerChoices.remove(School.getschoolNeck().get(indexofNeck));

    if(moveForward){
        indexofNeck ++;
    }
    else{
    indexofNeck --;
    }


    if(indexofNeck  > School.getschoolNeck().size() - 1){
        indexofNeck  = 0;
    }
    if(indexofNeck  < 0){
        indexofNeck  = School.getschoolNeck().size() - 1;
    }

    School.getschoolNeck().get(indexofNeck).setCenter(neckBox.getCenter());
    School.getschoolNeck().get(indexofNeck).setScale(neckScale);
    canvas.add(School.getschoolNeck().get(indexofNeck));
    runwayReady.add(School.getschoolNeck().get(indexofNeck));
    playerChoices.add(School.getschoolNeck().get(indexofNeck));
}

    //Beach NECKS
if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/TwoStackedPinkNecklace.png"))){
    canvas.remove(Beach.getBeachNeck().get(indexofNeck));
    runwayReady.remove(Beach.getBeachNeck().get(indexofNeck));
    playerChoices.remove(Beach.getBeachNeck().get(indexofNeck));

    if(moveForward){
        indexofNeck ++;
    }
    else{
    indexofNeck --;
    }


    if(indexofNeck  > Beach.getBeachNeck().size() - 1){
        indexofNeck  = 0;
    }
    if(indexofNeck  < 0){
        indexofNeck  = Beach.getBeachNeck().size() - 1;
    }

    Beach.getBeachNeck().get(indexofNeck).setCenter(neckBox.getCenter());
    Beach.getBeachNeck().get(indexofNeck).setScale(neckScale);
    canvas.add(Beach.getBeachNeck().get(indexofNeck));
    runwayReady.add(Beach.getBeachNeck().get(indexofNeck));
    playerChoices.add(Beach.getBeachNeck().get(indexofNeck));
}

}


public static void changeTops(boolean moveForward, CanvasWindow canvas){
    //Winter TOPS
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/WinterBeigeScarf.png"))){
        canvas.remove(Winter.getwinterTops().get(indexofTops));
        runwayReady.remove(Winter.getwinterTops().get(indexofTops));
        playerChoices.remove(Winter.getwinterTops().get(indexofTops));

        if(moveForward){
        indexofTops ++;
        }
        else{
        indexofTops --;
        }

        if(indexofTops  > Winter.getwinterTops().size() - 1){
        indexofTops  = 0;
        }
        if(indexofTops  < 0){
        indexofTops  = Winter.getwinterTops().size() - 1;
        }

        Winter.getwinterTops().get(indexofTops).setCenter(topsBox.getCenter());
        Winter.getwinterTops().get(indexofTops).setScale(topsScale);
        canvas.add(Winter.getwinterTops().get(indexofTops));
        runwayReady.add(Winter.getwinterTops().get(indexofTops));
        playerChoices.add(Winter.getwinterTops().get(indexofTops));
    }


    //School TOPS
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/SchoolScarf.png"))){
        canvas.remove(School.getschoolTops().get(indexofTops));
        runwayReady.remove(School.getschoolTops().get(indexofTops));
        playerChoices.remove(School.getschoolTops().get(indexofTops));
    
        if(moveForward){
            indexofTops ++;
        }
        else{
        indexofTops --;
        }
    
        if(indexofTops  > School.getschoolTops().size() - 1){
            indexofTops  = 0;
        }
        if(indexofTops  < 0){
            indexofTops  = School.getschoolTops().size() - 1;
        }
    
        School.getschoolTops().get(indexofTops).setCenter(topsBox.getCenter());
        School.getschoolTops().get(indexofTops).setScale(topsScale);
        canvas.add(School.getschoolTops().get(indexofTops));
        runwayReady.add(School.getschoolTops().get(indexofTops));
        playerChoices.add(School.getschoolTops().get(indexofTops));
        }

        //Beach TOPS
        if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/TwoStackedPinkNecklace.png"))){
            canvas.remove(Beach.getBeachTops().get(indexofTops));
            runwayReady.remove(Beach.getBeachTops().get(indexofTops));
            playerChoices.remove(Beach.getBeachTops().get(indexofTops));
        
            if(moveForward){
                indexofTops ++;
            }
            else{
            indexofTops --;
            }
        
            if(indexofTops  > Beach.getBeachTops().size() - 1){
                indexofTops  = 0;
            }
            if(indexofTops  < 0){
                indexofTops  = Beach.getBeachTops().size() - 1;
            }
 
            Beach.getBeachTops().get(indexofTops).setCenter(topsBox.getCenter());
            Beach.getBeachTops().get(indexofTops).setScale(topsScale);
            canvas.add(Beach.getBeachTops().get(indexofTops));
            runwayReady.add(Beach.getBeachTops().get(indexofTops));
            playerChoices.add(Beach.getBeachTops().get(indexofTops));
            }
}


public static void changeBottoms(boolean moveForward, CanvasWindow canvas){
    //Winter BOTTOMS
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/WinterBeigeScarf.png"))){
    canvas.remove(Winter.getwinterBottoms().get(indexofBottoms));
    runwayReady.remove(Winter.getwinterBottoms().get(indexofBottoms));
    playerChoices.remove(Winter.getwinterBottoms().get(indexofBottoms));

    if(moveForward){
        indexofBottoms ++;
    }
    else{
    indexofBottoms --;
    }

    if(indexofBottoms  > Winter.getwinterBottoms().size() - 1){
        indexofBottoms  = 0;
    }
    if(indexofBottoms  < 0){
        indexofBottoms  = Winter.getwinterBottoms().size() - 1;
    }

    Winter.getwinterBottoms().get(indexofBottoms).setCenter(bottomsBox.getCenter());
    Winter.getwinterBottoms().get(indexofBottoms).setScale(bottomScale);
    canvas.add(Winter.getwinterBottoms().get(indexofBottoms));
    runwayReady.add(Winter.getwinterBottoms().get(indexofBottoms));
    playerChoices.add(Winter.getwinterBottoms().get(indexofBottoms));
}


//School BOTTOMS
if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/SchoolScarf.png"))){
    canvas.remove(School.getschoolBottoms().get(indexofBottoms));
    runwayReady.remove(School.getschoolBottoms().get(indexofBottoms));
    playerChoices.remove(School.getschoolBottoms().get(indexofBottoms));

    if(moveForward){
        indexofBottoms ++;
    }
    else{
    indexofBottoms --;
    }

    if(indexofBottoms  > School.getschoolBottoms().size() - 1){
        indexofBottoms  = 0;
    }
    if(indexofBottoms  < 0){
        indexofBottoms  = School.getschoolBottoms().size() - 1;
    }

    School.getschoolBottoms().get(indexofBottoms).setCenter(bottomsBox.getCenter());
    School.getschoolBottoms().get(indexofBottoms).setScale(bottomScale);
    canvas.add(School.getschoolBottoms().get(indexofBottoms));
    runwayReady.add(School.getschoolBottoms().get(indexofBottoms));
    playerChoices.add(School.getschoolBottoms().get(indexofBottoms));
}


//Beach BOTTOMS
if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/TwoStackedPinkNecklace.png"))){
    canvas.remove(Beach.getBeachBottoms().get(indexofBottoms));
    runwayReady.remove(Beach.getBeachBottoms().get(indexofBottoms));
    playerChoices.remove(Beach.getBeachBottoms().get(indexofBottoms));

    if(moveForward){
        indexofBottoms ++;
    }
    else{
    indexofBottoms --;
    }

    if(indexofBottoms  > Beach.getBeachBottoms().size() - 1){
        indexofBottoms  = 0;
    }
    if(indexofBottoms  < 0){
        indexofBottoms  = Beach.getBeachBottoms().size() - 1;
    }

    Beach.getBeachBottoms().get(indexofBottoms).setCenter(bottomsBox.getCenter());
    Beach.getBeachBottoms().get(indexofBottoms).setScale(bottomScale);
    canvas.add(Beach.getBeachBottoms().get(indexofBottoms));
    runwayReady.add(Beach.getBeachBottoms().get(indexofBottoms));
    playerChoices.add(Beach.getBeachBottoms().get(indexofBottoms));
}

}

public static void changeShoes(boolean moveForward, CanvasWindow canvas){

    //Winter SHOES
    if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/WinterBeigeScarf.png"))){
    canvas.remove(Winter.getwinterShoes().get(indexofShoes));
    runwayReady.remove(Winter.getwinterShoes().get(indexofShoes));
    playerChoices.remove(Winter.getwinterShoes().get(indexofShoes));

    if(moveForward){
        indexofShoes ++;
    }
    else{
    indexofShoes --;
    }
    if(indexofShoes  > Winter.getwinterShoes().size() - 1){
        indexofShoes  = 0;
    }
    if(indexofShoes  < 0){
        indexofShoes  = Winter.getwinterShoes().size() - 1;
    }

    Winter.getwinterShoes().get(indexofShoes).setCenter(shoesBox.getCenter());
    Winter.getwinterShoes().get(indexofShoes).setScale(shoeScale);
    canvas.add(Winter.getwinterShoes().get(indexofShoes));
    runwayReady.add(Winter.getwinterShoes().get(indexofShoes));
    playerChoices.add(Winter.getwinterShoes().get(indexofShoes));
}

  //School SHOES
  if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/SchoolScarf.png"))){
    canvas.remove(School.getschoolShoes().get(indexofShoes));
    runwayReady.remove(School.getschoolShoes().get(indexofShoes));
    playerChoices.remove(School.getschoolShoes().get(indexofShoes));

    if(moveForward){
        indexofShoes ++;
    }
    else{
    indexofShoes --;
    }
    if(indexofShoes  > School.getschoolShoes().size() - 1){
        indexofShoes  = 0;
    }
    if(indexofShoes  < 0){
        indexofShoes  = School.getschoolShoes().size() - 1;
    }

    School.getschoolShoes().get(indexofShoes).setCenter(shoesBox.getCenter());
    School.getschoolShoes().get(indexofShoes).setScale(shoeScale);
    canvas.add(School.getschoolShoes().get(indexofShoes));
    runwayReady.add(School.getschoolShoes().get(indexofShoes));
    playerChoices.add(School.getschoolShoes().get(indexofShoes));
}

  //Beach SHOES
  if(TheMotherBoard.getTheme().equals(new Image("assets_Clothes/TwoStackedPinkNecklace.png"))){
    canvas.remove(Beach.getBeachShoes().get(indexofShoes));
    runwayReady.remove(Beach.getBeachShoes().get(indexofShoes));
    playerChoices.remove(Beach.getBeachShoes().get(indexofShoes));

    if(moveForward){
        indexofShoes ++;
    }
    else{
    indexofShoes --;
    }
    if(indexofShoes  > Beach.getBeachShoes().size() - 1){
        indexofShoes  = 0;
    }
    if(indexofShoes  < 0){
        indexofShoes  = Beach.getBeachShoes().size() - 1;
    }

    Beach.getBeachShoes().get(indexofShoes).setCenter(shoesBox.getCenter());
    Beach.getBeachShoes().get(indexofShoes).setScale(shoeScale);
    canvas.add(Beach.getBeachShoes().get(indexofShoes));
    runwayReady.add(Beach.getBeachShoes().get(indexofShoes));
    playerChoices.add(Beach.getBeachShoes().get(indexofShoes));
}

}}
