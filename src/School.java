

import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Image;



/*
 * Manages the school outfits + the school backdrop
 */
public class School{
  static List<Image>  schoolHats = new ArrayList<Image>();
  static List<Image>  schoolNeck = new ArrayList<Image>();
  static List<Image> schoolTops = new ArrayList<Image>();
  static List<Image> schoolBottoms = new ArrayList<Image>();
  static List<Image>  schoolShoes = new ArrayList<Image>();
 
  static private Image getDressedButton = new Image("assets/DressupButton.png");
  
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
      
      /*
       * How we decide what the theme will be
       */
      public static Image getOutfitComparision(){
        return new Image("assets_Clothes/SchoolScarf.png");
      }

    public static void schoolTheme(CanvasWindow canvas){
      Image schoolTheme = new Image(-240,-150);
      schoolTheme.setImagePath("assets/school2.png");

      Image schoolText = new Image ("assets/99.png");
      schoolText.setCenter(canvas.getWidth()/2, canvas.getHeight()/2);
      schoolTheme.setScale(0.75);
      schoolText.setScale(0.65);

      canvas.add(schoolTheme);
      canvas.add(schoolText);

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
 
    }}
