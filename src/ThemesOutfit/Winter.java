package ThemesOutfit;

import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.Image;


public class Winter{ 
    List<Image>  winterHats = new ArrayList<Image>();
    List<Image>  winterNeck = new ArrayList<Image>();
    List<Image> winterTops = new ArrayList<Image>();
    List<Image> winterBottoms = new ArrayList<Image>();
    List<Image>  winterShoes = new ArrayList<Image>();
    

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

      public List<Image> getwinterHats(){
        return winterHats;
      }

      public List<Image> getwinterNeck(){
        return winterNeck;
      }

      public List<Image> getwinterTops(){
        return winterTops;
      }

      public List<Image> getwinterBottoms(){
        return winterBottoms;
      }
      public List<Image> getwinterShoes(){
        return winterShoes;
      }

      public List<Image> getWinningOutfit(){
        //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
        return winterNeck;
  
}

}
