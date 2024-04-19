package ThemesOutfit;

import java.util.List;

import edu.macalester.graphics.Image;


public class Winter {
    List<Image>  winterGloves;
    


    public Winter(){
     winterGloves = List.of(new Image ("assets_Clothes/BlackGloves.png"),
                                         new Image ("assets_Clothes/BrownGloves.png"),
                                         new Image ("assets_Clothes/BlueScarf.png"));
    }
      public List<Image> getwinterGloves(){
        return winterGloves;
      }
}
