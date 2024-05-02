

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.ui.Button;


public class Winter{ 
    static List<Image>  winterHats = new ArrayList<Image>();
    static List<Image>  winterNeck = new ArrayList<Image>();
    static List<Image> winterTops = new ArrayList<Image>();
    static List<Image> winterBottoms = new ArrayList<Image>();
    static List<Image>  winterShoes = new ArrayList<Image>();
    private static Button closetButton2 = new Button("Let's get Dressed!");
    

    public Winter(){
      winterHats.add(new Image ("assets_Clothes/WinterWhiteBeanie.png"));
      winterHats.add(new Image ("assets_Clothes/BlackSideCapHat.png"));
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
      winterBottoms.add(new Image ("assets_Clothes/GreenCargoPants.png"));
      winterBottoms.add(new Image ("assets_Clothes/WhiteSkinnyJeans.png"));
      winterBottoms.add(new Image("assets_Clothes/TestPants1.png"));
      winterBottoms.add(new Image ("assets_Clothes/LightBlueBowPants.png"));

   
      winterShoes.add(new Image ("assets_Clothes/BlackLongBoots.png"));
      winterShoes.add(new Image ("assets_Clothes/WhiteSneakers.png"));
      winterShoes.add(new Image ("assets_Clothes/GreenBoots.png"));
      winterShoes.add(new Image ("assets_Clothes/GreenLongBoots.png"));
      winterShoes.add(new Image ("assets_Clothes/RedLongOmbreBoots.png"));
      winterShoes.add(new Image ("assets_Clothes/GreenStrapHeels.png"));
      winterShoes.add(new Image ("assets_Clothes/BlueHeels.png"));
      winterShoes.add(new Image ("assets_Clothes/BlackBowHeels.png"));
  
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

      public static Image getWinningOutfit(){
        //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
        return new Image ("assets_Clothes/WinterBeigeScarf.png");
  
}

public static void winterTheme(CanvasWindow canvas){
    Image winterTheme = new Image(-240,-150);
    GraphicsText winterText = new GraphicsText("\t  The Theme is Winter! \nCreate your best Winter Outfit!");
    winterText.setPosition(canvas.getWidth()/2 - 400, canvas.getHeight()/2);
    winterText.setFontSize(60);
    winterText.setFillColor(Color.BLACK);
    winterText.setStroked(true);
    winterText.setStrokeWidth(2);
    winterText.setStrokeColor(Color.WHITE);

    winterTheme.setImagePath("assets/winter2.png");
    winterTheme.setScale(0.75);
    canvas.add(winterTheme);
    canvas.add(winterText);
    closetButton2.setPosition(600,50);
    canvas.add(closetButton2);
    closetButton2.onClick(() -> {
        canvas.removeAll();
        ClosetManager.theCloset(canvas);});
}

}
