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
      winterHats.add(new Image ("assets_Clothes/BlackGloves.png"));
      winterHats.add(new Image ("assets_Clothes/BrownGloves.png"));
      winterHats.add(new Image ("assets_Clothes/BlueScarf.png"));

      winterNeck.add(new Image ("assets_Clothes/BlackGloves.png"));
      winterNeck.add(new Image ("assets_Clothes/BrownGloves.png"));
      winterNeck.add(new Image ("assets_Clothes/BlueScarf.png"));

      winterTops.add(new Image ("assets_Clothes/GreenTop.png"));
      winterTops.add(new Image ("assets_Clothes/BlackGloves.png"));
      winterTops.add(new Image ("assets_Clothes/BlackGloves.png"));

      winterBottoms.add(new Image ("assets_Clothes/BlackJeans.png"));
      winterBottoms.add(new Image ("assets_Clothes/KhakiPants.png"));
      winterBottoms.add(new Image ("assets_Clothes/BlueScarf.png"));
   
      winterShoes.add(new Image ("assets_Clothes/BlackGloves.png"));
      winterShoes.add(new Image ("assets_Clothes/BrownGloves.png"));
      winterShoes.add(new Image ("assets_Clothes/BlueScarf.png"));

  
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
        return List.of(new Image ("assets_Clothes/BlueScarf.png"), new Image ("assets_Clothes/BrownGloves.png"), new Image ("assets_Clothes/BlackGloves.png"));
      }
  
}
