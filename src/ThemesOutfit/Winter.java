package ThemesOutfit;

import java.util.List;

import edu.macalester.graphics.Image;


public class Winter{ 
    List<Image>  winterGloves;
    List<Image> winterShirts;
    List<Image> winterBottoms;
    List<Image> winterJackets;
    
    


    public Winter(){
     winterGloves = List.of(new Image ("assets_Clothes/BlackGloves.png"),
                            new Image ("assets_Clothes/BrownGloves.png"),
                            new Image ("assets_Clothes/BlueScarf.png"));
    winterShirts = List.of(new Image ("assets_Clothes/BlackShirt.png"),
                           new Image("assets_Clothes/GreenTop.png"),
                           new Image ("assets_Clothes/WhiteShirt.png"));
    winterBottoms = List.of(new Image ("assets_Clothes/KhakiPants.png"),
                           new Image("assets_Clothes/BlackJeans.png"),
                           new Image("assets_Clothes/TealSkirtLong.png"),
                           new Image("assets_Clothes/WhiteSneakers.png")); //Shoe
    winterJackets = List.of(new Image("assets_Clothes/GreyFurJacket.png"),
                            new Image("assets_Clothes/FurJacket.png"),
                            new Image ("assets_Clothes/CoralJacketLong.png"),
                            new Image("assets_Clothes/BlackCropJacket.png"));
    }

      public List<Image> getwinterGloves(){
        return winterGloves;
      }
      public List<Image> getwinterBottoms(){
        return winterBottoms;
      }
      public List<Image> getwinterJackets(){
        return winterJackets;
      }
      public List<Image> getWinningOutfit(){
        return winterShirts;
      }
      public String getName(){
        return "Winter";
      }
}
