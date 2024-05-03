
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
        beachHats.add(new Image ("assets_Clothes/PinkVisor.png"));
        beachHats.add(new Image ("assets_Clothes/PinkHeadband.png"));
        beachHats.add(new Image("asset_Clothes/BlackHeadband.png"));
  
        beachNeck.add(new Image ("assets_Clothes/TwoStackedPinkNecklace.png"));
        beachNeck.add(new Image ("assets_Clothes/StackedPurpleNecklace.png"));
        beachNeck.add(new Image ("assets_Clothes/PurpleHeartNecklace.png"));
        beachNeck.add(new Image ("assets_Clothes/PinkNecklace.png"));
  
        beachTops.add(new Image ("assets_Clothes/PinkTubeTop.png"));
        beachTops.add(new Image ("assets_Clothes/OneShoulderPinkTop.png"));
        beachTops.add(new Image ("assets_Clothes/MustardTop.png"));
        beachTops.add(new Image ("assets_Clothes/MintTop.png"));
        beachTops.add(new Image ("assets_Clothes/HalterTop.png"));
        beachTops.add(new Image ("assets_Clothes/GreenFlowerTop.png"));
        beachTops.add(new Image ("assets_Clothes/MintFlowerTop.png"));


        beachBottoms.add(new Image ("assets_Clothes/WhiteShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/RedShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/RedRuffleSkirt.png"));
        beachBottoms.add(new Image ("assets_Clothes/PurpleSkirt.png"));
        beachBottoms.add(new Image ("assets_Clothes/PinkShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/JeanShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/BlackShorts.png"));

        beachShoes.add(new Image ("assets_Clothes/YellowHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/WhiteSneakers.png"));
        beachShoes.add(new Image ("assets_Clothes/PurpleHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/PinkHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/NavyHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/GreenStrapHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/BlueHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/BlackBowHeels.png"));
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
        //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
        return List.of(new Image ("assets_Clothes/WinterBeigeScarf.png"), new Image ("assets_Clothes/BlackLongBoots.png"));
  
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
