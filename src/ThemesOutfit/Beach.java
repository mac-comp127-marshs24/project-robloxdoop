package ThemesOutfit;

import java.util.List;

import edu.macalester.graphics.Image;

public class Beach {
    List<Image>  beachTops;
    List<Image> beachBottoms;

    public Beach(){
            beachTops = List.of(new Image ("assets_Clothes/CheetahMiniDress.png"),
                                   new Image ("assets_Clothes/WhiteShirt.png"),
                                   new Image ("assets_Clothes/OmbrePurpleDress.png"));
       
           beachBottoms = List.of(new Image ("assets_Clothes/Coral.png"));
           beachBottoms = List.of(new Image ("assets_Clothes/WhiteSneakers.png"));
    }

    public List<Image> getBeachTops(){
        return beachTops;
    }

    public List<Image> getBeachBottoms(){
        return beachBottoms;
    }

    
    public List<Image> getWinningOutfit() {
        return beachTops;
    }
}
