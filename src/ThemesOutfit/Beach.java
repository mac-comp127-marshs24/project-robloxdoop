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
        beachHats.add(new Image ("assets_Clothes/BlackGloves.png"));
        beachHats.add(new Image ("assets_Clothes/BrownGloves.png"));
        beachHats.add(new Image ("assets_Clothes/BlueScarf.png"));
  
        beachNeck.add(new Image ("assets_Clothes/BlackGloves.png"));
        beachNeck.add(new Image ("assets_Clothes/BrownGloves.png"));
        beachNeck.add(new Image ("assets_Clothes/BlueScarf.png"));
  
        beachTops.add(new Image ("assets_Clothes/BlackGloves.png"));
        beachTops.add(new Image ("assets_Clothes/BlackGloves.png"));
        beachTops.add(new Image ("assets_Clothes/BlackGloves.png"));
  
        beachBottoms.add(new Image ("assets_Clothes/BlackGloves.png"));
        beachBottoms.add(new Image ("assets_Clothes/BrownGloves.png"));
        beachBottoms.add(new Image ("assets_Clothes/BlueScarf.png"));
     
        beachShoes.add(new Image ("assets_Clothes/BlackGloves.png"));
        beachShoes.add(new Image ("assets_Clothes/BrownGloves.png"));
        beachShoes.add(new Image ("assets_Clothes/BlueScarf.png"));
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
        return List.of(new Image ("assets_Clothes/BlueScarf.png"), new Image ("assets_Clothes/BrownGloves.png"), new Image ("assets_Clothes/BlackGloves.png"));
    }
}
