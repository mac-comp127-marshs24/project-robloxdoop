

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.ui.Button;



public class School{
  static List<Image>  schoolHats = new ArrayList<Image>();
  static List<Image>  schoolNeck = new ArrayList<Image>();
  static List<Image> schoolTops = new ArrayList<Image>();
  static List<Image> schoolBottoms = new ArrayList<Image>();
  static List<Image>  schoolShoes = new ArrayList<Image>();
  private static Button closetButton2 = new Button("Let's get Dressed!");
  
    public School(){
      schoolHats.add(new Image ("assets_Clothes/BlackSideCap.png"));
      schoolHats.add(new Image ("assets_Clothes/BlueCowboyHat.png"));
      schoolHats.add(new Image("assets_Clothes/BlueCap.png"));

      schoolNeck.add(new Image ("assets_Clothes/StripeScarf.png"));
      schoolNeck.add(new Image ("assets_Clothes/SilverNecklace.png"));
      schoolNeck.add(new Image ("assets_Clothes/SilverHeartNecklace.png"));
      schoolNeck.add(new Image("assets_Clothes/ChainNecklace.png"));
      schoolNeck.add(new Image ("assets_Clothes/GoldNecklace.png"));

      schoolTops.add(new Image ("assets_Clothes/PurpleTop.png"));
      schoolTops.add(new Image ("assets_Clothes/LavendarTop.png"));
      schoolTops.add(new Image ("assets_Clothes/BlackCrissCrossTop.png"));
      schoolTops.add(new Image ("assets_Clothes/RedCrissCrossTop.png"));
      schoolTops.add(new Image ("assets_Clothes/BlackandWhiteCropTop.png"));

      schoolBottoms.add(new Image ("assets_Clothes/WhiteSkirt.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlackSkirt.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlackSkirtBelt.png"));
      schoolBottoms.add(new Image ("assets_Clothes/RedRuffleSkirts.png"));
      schoolBottoms.add(new Image ("assets_Clothes/RedCheetahSkirt.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlueBowPants.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlackPants.png"));
      schoolBottoms.add(new Image ("assets_Clothes/WhiteSkinnyJeans.png"));
      schoolBottoms.add(new Image ("asset_Clothes/CargoPants.png"));
      schoolBottoms.add(new Image("assets_Clothes/DarkBlueJean"));


      schoolShoes.add(new Image ("assets_Clothes/YellowPearlHeels.png"));
      schoolShoes.add(new Image ("assets_Clothes/WhiteSneakers.png"));
      schoolShoes.add(new Image ("assets_Clothes/PurpleHeels.png"));
      schoolShoes.add(new Image ("assets_Clothes/PurpleHeels.png"));
      schoolShoes.add(new Image ("assets_Clothes/PinkPearlHeels.png"));
      schoolShoes.add(new Image ("assets_Clothes/NavyHeels.png"));
      schoolShoes.add(new Image ("assets_Clothes/GreenStrapHeels.png"));
      schoolShoes.add(new Image ("assets_Clothes/BlueHeels.png"));
      schoolShoes.add(new Image ("assets_Clothes/BlackBowHeels.png"));

    }

      public static List<Image> getschoolHats(){
        return schoolHats;
      }
      public static List<Image> getschoolNeck(){
        return schoolNeck;
      }
      public static List<Image> getschoolTops(){
        return schoolTops;
      }
      public static List<Image> getschoolBottoms(){
        return schoolBottoms;
      }
      public static List<Image> getschoolShoes(){
        return schoolShoes;
      }
      
      public static Image getOutfitComparision(){
        //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
        return new Image("assets_Clothes/SchoolScarf.png");
      }

    public static void schoolTheme(CanvasWindow canvas){
      Image schoolTheme = new Image(-240,-150);
      schoolTheme.setImagePath("assets/school2.png");
      GraphicsText schoolText = new GraphicsText("\t  The Theme is School! \nCreate your best School Outfit!");
      schoolText.setPosition(canvas.getWidth()/2 - 400, canvas.getHeight()/2);
      schoolTheme.setScale(0.75);
      schoolText.setFontSize(60);
      schoolText.setFillColor(Color.BLACK);
      schoolText.setStroked(true);
      schoolText.setStrokeWidth(2);
      schoolText.setStrokeColor(Color.WHITE);

      canvas.add(schoolTheme);
      canvas.add(schoolText);
      closetButton2.setPosition(600,50);
      canvas.add(closetButton2);
      closetButton2.onClick(() -> {
          canvas.removeAll();
          ClosetManager.theCloset(canvas);});
  }
 
}
