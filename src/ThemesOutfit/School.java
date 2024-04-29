package ThemesOutfit;

import java.util.ArrayList;
import java.util.List;
import edu.macalester.graphics.Image;



public class School{
  List<Image>  schoolHats = new ArrayList<Image>();
  List<Image>  schoolNeck = new ArrayList<Image>();
  List<Image> schoolTops = new ArrayList<Image>();
  List<Image> schoolBottoms = new ArrayList<Image>();
  List<Image>  schoolShoes = new ArrayList<Image>();
  
    public School(){
      schoolHats.add(new Image ("assets_Clothes/BlackSideCapHat.png"));
      schoolHats.add(new Image ("assets_Clothes/BlackandWhiteHat.png"));

      schoolNeck.add(new Image ("assets_Clothes/StripeScarf.png"));
      schoolNeck.add(new Image ("assets_Clothes/SilverNecklace.png"));
      schoolNeck.add(new Image ("assets_Clothes/SilverHeartNecklace.png"));
      schoolNeck.add(new Image("assets_Clothes/SchoolScarf.png"));

      schoolTops.add(new Image ("assets_Clothes/PurpleTop.png"));
      schoolTops.add(new Image ("assets_Clothes/LavendarTop.png"));
      schoolTops.add(new Image ("assets_Clothes/BlackCrissCrossTop.png"));
      schoolTops.add(new Image ("assets_Clothes/BlackandWhiteCropTop.png"));

      schoolBottoms.add(new Image ("assets_Clothes/WhiteSkirt.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlackSkirt.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlackHighLowSkirt.png"));
      schoolBottoms.add(new Image ("assets_Clothes/RedSkirts.png"));
      schoolBottoms.add(new Image ("assets_Clothes/RedCheetahSkirt.png"));
      schoolBottoms.add(new Image ("assets_Clothes/LightBlueBowPants.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlackJeans.png"));
      schoolBottoms.add(new Image ("assets_Clothes/WhiteSkinnyJeans.png"));
      schoolBottoms.add(new Image ("asset_Clothes/GreenCargoPants.png"));

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

      public List<Image> getschoolHats(){
        return schoolHats;
      }
      public List<Image> getschoolNeck(){
        return schoolNeck;
      }
      public List<Image> getschoolTops(){
        return schoolTops;
      }
      public List<Image> getschoolBottoms(){
        return schoolBottoms;
      }
      public List<Image> getschoolShoes(){
        return schoolShoes;
      }
      
      public List<Image> getWinningOutfit(){
        //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
        return schoolShoes;
      }
 
}
