package ThemesOutfit;

import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.Image;


public class Winter{ 
    static List<Image>  winterGloves = new ArrayList<Image>();
    List<Image> winterShirts = new ArrayList<Image>();
    List<Image> winterBottoms = new ArrayList<Image>();
    List<Image> winterJackets = new ArrayList<Image>();
    
    


    public Winter(){
     winterGloves.add(new Image ("assets_Clothes/BlackGloves.png"));
    winterGloves.add(new Image ("assets_Clothes/BrownGloves.png"));
    winterGloves.add(new Image ("assets_Clothes/BlueScarf.png"));
    System.out.println(winterGloves.size());
    System.out.println(winterGloves.get(0));
    // winterShirts = List.of(new Image ("assets_Clothes/BlackShirt.png"),
    //                        new Image("assets_Clothes/GreenTop.png"),
    //                        new Image ("assets_Clothes/WhiteShirt.png"));
    // winterBottoms = List.of(new Image ("assets_Clothes/KhakiPants.png"),
    //                        new Image("assets_Clothes/BlackJeans.png"),
    //                        new Image("assets_Clothes/TealSkirtLong.png"),
    //                        new Image("assets_Clothes/WhiteSneakers.png")); //Shoe
    // winterJackets = List.of(new Image("assets_Clothes/GreyFurJacket.png"),
    //                         new Image("assets_Clothes/FurJacket.png"),
    //                         new Image ("assets_Clothes/CoralJacketLong.png"),
    //                         new Image("assets_Clothes/BlackCropJacket.png"));
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

      public static void main(String[] args) {
        // System.out.println(winterGloves.size());
        // System.out.println(winterGloves.get(0));
        new Winter();
      }
}
