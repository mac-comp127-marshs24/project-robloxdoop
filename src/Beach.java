
import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Image;

/*
 * Manages the Beach Theme, with beach clothes and beach backdrop
 */

public class Beach {
    static List<Image>  beachHats = new ArrayList<Image>();
    static List<Image> beachNeck = new ArrayList<Image>();
    static List<Image>  beachTops = new ArrayList<Image>();
    static List<Image> beachBottoms = new ArrayList<Image>();
    static List<Image> beachShoes = new ArrayList<Image>();
    private static Image getDressedButton = new Image("assets/DressupButton.png");

    public Beach(){
        beachHats.add(new Image ("assets_Clothes/BlackCap.png"));
        beachHats.add(new Image ("assets_Clothes/WhiteBeanie.png"));
        beachHats.add(new Image("assets_Clothes/PinkVisor.png"));

        beachNeck.add(new Image ("assets_Clothes/TealScarf.png"));
        beachNeck.add(new Image ("assets_Clothes/BlueScarf.png"));
        beachNeck.add(new Image("assets_Clothes/ChainNecklace.png"));
  
        beachTops.add(new Image ("assets_Clothes/PinkTubeTop.png"));
        beachTops.add(new Image ("assets_Clothes/MintFlowerTop.png"));
        beachTops.add(new Image ("assets_Clothes/RedVelvetTop.png"));


        beachBottoms.add(new Image ("assets_Clothes/WhiteShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/BlackSkirt.png"));
        beachBottoms.add(new Image("assets_Clothes/BlackJeans.png"));

        beachShoes.add(new Image ("assets_Clothes/GoldHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/GreenBoots.png"));
        beachShoes.add(new Image ("assets_Clothes/BlackHeels.png"));
    }


    public static List<Image> getBeachHats(){
        return beachHats;
    }

    public static List<Image> getBeachNeck(){
        return beachNeck;
    }

    public static List<Image> getBeachTops(){
        return beachTops;
    }

    public static List<Image> getBeachBottoms(){
        return beachBottoms;
    }

    public static List<Image> getBeachShoes(){
        return beachShoes;
    }

    /*
     * How the game decides what the theme is
     */
    public static Image getOutfitComparision() {
        return new Image("assets_Clothes/TwoStackedPinkNecklace.png");
    }

    public static List<Image> getWinningOutfit(){
        return List.of(
        new Image("assets_Clothes/PinkVisor.png"), 
        new Image("assets_Clothes/ChainNecklace.png"),
        new Image ("assets_Clothes/PinkTubeTop.png"),
        new Image ("assets_Clothes/WhiteShorts.png"),
        new Image ("assets_Clothes/GoldHeels.png")
      );
    }
    

    public static void beachTheme(CanvasWindow canvas){
    Image beachTheme = new Image(-240,-150);
    beachTheme.setImagePath("assets/beach2.png");

    Image beachText = new Image ("assets/100.png");
    beachText.setCenter(canvas.getWidth()/2, canvas.getHeight()/2);
    beachText.setScale(0.65);
    beachTheme.setScale(0.75);

    canvas.add(beachTheme);
    canvas.add(beachText);

    getDressedButton.setPosition(-830,-500);
    getDressedButton.setScale(0.15);
    canvas.add(getDressedButton);

    canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == getDressedButton){
                canvas.removeAll();
                ClosetManager.theCloset(canvas);
            }

        }
    );
}

}
