package ThemesOutfit;

import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.Image;

public class Beach {
    List<Image>  beachHats = new ArrayList<Image>();
    List<Image> beachNeck = new ArrayList<Image>();
    List<Image>  beachTops = new ArrayList<Image>();
    List<Image> beachBottoms = new ArrayList<Image>();
    List<Image> beachShoes = new ArrayList<Image>();

    public Beach(){
        beachHats.add(new Image ("assets_Clothes/PinkandBlackVizor.png"));
  
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

        beachBottoms.add(new Image ("assets_Clothes/WhiteShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/RedFlaredShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/RedCrossSkirt.png"));
        beachBottoms.add(new Image ("assets_Clothes/PurpleSkirt.png"));
        beachBottoms.add(new Image ("assets_Clothes/PinkSparkleShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/JeanShorts.png"));
        beachBottoms.add(new Image ("assets_Clothes/BlackShorts.png"));

        beachShoes.add(new Image ("assets_Clothes/YellowPearlHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/WhiteSneakers.png"));
        beachShoes.add(new Image ("assets_Clothes/PurpleHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/PurpleHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/PinkPearlHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/NavyHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/GreenStrapHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/BlueHeels.png"));
        beachShoes.add(new Image ("assets_Clothes/BlackBowHeels.png"));
    }


    public List<Image> getBeachHats(){
        return beachHats;
    }

    public List<Image> getBeachNeck(){
        return beachNeck;
    }

    public List<Image> getBeachTops(){
        return beachTops;
    }

    public List<Image> getBeachBottoms(){
        return beachBottoms;
    }

    public List<Image> getBeachShoes(){
        return beachShoes;
    }

    
    public List<Image> getWinningOutfit() {
        return beachShoes;
    }
}
