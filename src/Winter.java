import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.CanvasWindow;

import edu.macalester.graphics.Image;


/*
 * Manages the winter outfits + winter theme
 */
public class Winter{ 
    static List<Image>  winterHats = new ArrayList<Image>();
    static List<Image>  winterNeck = new ArrayList<Image>();
    static List<Image> winterTops = new ArrayList<Image>();
    static List<Image> winterBottoms = new ArrayList<Image>();
    static List<Image>  winterShoes = new ArrayList<Image>();
    static Image getDressedButton = new Image("assets/DressupButton.png");
   
    

    public Winter(){
      winterHats.add(new Image ("assets_Clothes/WhiteBeanie.png"));
      winterHats.add(new Image ("assets_Clothes/BlackSideCap.png"));
      winterHats.add(new Image ("assets_Clothes/BlueCowboyHat.png"));

      winterNeck.add(new Image ("assets_Clothes/WinterBeigeScarf.png"));
      winterNeck.add(new Image ("assets_Clothes/WinterPurpleHoopScarf.png"));
      winterNeck.add(new Image ("assets_Clothes/WinterTealInfinityScarf.png"));
      winterNeck.add(new Image ("assets_Clothes/BlueScarf.png"));
      winterNeck.add(new Image ("assets_Clothes/RedScarf.png"));

      winterTops.add(new Image ("assets_Clothes/BrownSweater.png"));
      winterTops.add(new Image ("assets_Clothes/WhiteTop.png"));
      winterTops.add(new Image ("assets_Clothes/RedVelvetTop.png"));
      winterTops.add(new Image ("assets_Clothes/BlackShirt.png"));

      winterBottoms.add(new Image ("assets_Clothes/BlackJeans.png"));
      winterBottoms.add(new Image ("assets_Clothes/TestSkirt1.png"));
      winterBottoms.add(new Image ("assets_Clothes/CargoPants.png"));
      winterBottoms.add(new Image ("assets_Clothes/WhiteSkinnyJeans.png"));
      winterBottoms.add(new Image("assets_Clothes/TestPants1.png"));
      winterBottoms.add(new Image ("assets_Clothes/BlueBowPants.png"));

   
      winterShoes.add(new Image ("assets_Clothes/GoldHeels.png"));
      winterShoes.add(new Image ("assets_Clothes/GreenBoots.png"));
      winterShoes.add(new Image ("assets_Clothes/BlackHeels.png"));
  
    }

      public static List<Image> getwinterHats(){
        return winterHats;
      }

      public static List<Image> getwinterNeck(){
        return winterNeck;
      }

      public static List<Image> getwinterTops(){
        return winterTops;
      }

      public static List<Image> getwinterBottoms(){
        return winterBottoms;
      }
      public static List<Image> getwinterShoes(){
        return winterShoes;
      }

      public static Image getOutfitComparision(){
        return new Image ("assets_Clothes/WinterBeigeScarf.png");
  
    }

    public static List<Image> getWinningOutfit(){
      //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
      return List.of(new Image ("assets_Clothes/WinterBeigeScarf.png"), new Image ("assets_Clothes/BlackLongBoots.png"));

  }

public static void winterTheme(CanvasWindow canvas){
    Image winterTheme = new Image(-240,-150);
    Image winterText = new Image ("assets/98.png");
    winterText.setCenter(canvas.getWidth()/2, canvas.getHeight()/2);
    winterText.setScale(0.75);

    winterTheme.setImagePath("assets/winter2.png");
    winterTheme.setScale(0.75);
    canvas.add(winterTheme);
    canvas.add(winterText);

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