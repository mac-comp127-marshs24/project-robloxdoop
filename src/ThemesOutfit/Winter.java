package ThemesOutfit;

import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.Image;


public class Winter{ 
    List<Image>  winterAccessories = new ArrayList<Image>();
    List<Image> winterTops = new ArrayList<Image>();
    List<Image> winterBottoms = new ArrayList<Image>();
    

    public Winter(){
      winterAccessories.add(new Image ("assets_Clothes/BlackGloves.png"));
      winterAccessories.add(new Image ("assets_Clothes/BrownGloves.png"));
      winterAccessories.add(new Image ("assets_Clothes/BlueScarf.png"));

      winterTops.add(new Image ("assets_Clothes/BlackGloves.png"));
      winterTops.add(new Image ("assets_Clothes/BlackGloves.png"));
      winterTops.add(new Image ("assets_Clothes/BlackGloves.png"));
   

      winterTops.add(new Image ("assets_Clothes/BlackGloves.png"));
      winterTops.add(new Image ("assets_Clothes/BrownGloves.png"));
      winterTops.add(new Image ("assets_Clothes/BlueScarf.png"));

  
    }

      public List<Image> getwinterAccessories(){
        return winterAccessories;
      }

      public List<Image> getwinterBottoms(){
        return winterBottoms;
      }
      public List<Image> getwinterJackets(){
        return winterTops;
      }
      public List<Image> getWinningOutfit(){
        //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
        return List.of(new Image ("assets_Clothes/BlueScarf.png"), new Image ("assets_Clothes/BrownGloves.png"), new Image ("assets_Clothes/BlackGloves.png"));
      }
  
}
