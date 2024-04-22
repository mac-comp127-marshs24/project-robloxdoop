package ThemesOutfit;

import java.util.List;

import edu.macalester.graphics.Image;


public class Winter{ //implements Theme {
    List<Image>  winterGloves;
    List<Image> winterShirts;
    
    


    public Winter(){
     winterGloves = List.of(new Image ("assets_Clothes/BlackGloves.png"),
                            new Image ("assets_Clothes/BrownGloves.png"),
                            new Image ("assets_Clothes/BlueScarf.png"));

    winterShirts = List.of(new Image ("assets_Clothes/BlackShirt.png"),
                           new Image("assets_Clothes/GreenTop.png"),
                           new Image ("assets_Clothes/WhiteShirt.png"));
    }

      public List<Image> getwinterGloves(){
        return winterGloves;
      }

      public List<Image> getWinningOutfit(){
        return winterShirts;
      }

      public String getName(){
        return "Winter";
      }
}
