package ThemesOutfit;

import java.util.ArrayList;
import java.util.List;
import edu.macalester.graphics.Image;



public class School{
    List<Image>  schoolAccessories = new ArrayList<Image>();
    List<Image> schoolTops = new ArrayList<Image>();
    List<Image> schoolBottoms = new ArrayList<Image>();
  
    public School(){
      schoolAccessories.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolAccessories.add(new Image ("assets_Clothes/BrownGloves.png"));
      schoolAccessories.add(new Image ("assets_Clothes/BlueScarf.png"));

      schoolTops.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolTops.add(new Image ("assets_Clothes/BrownGloves.png"));
      schoolTops.add(new Image ("assets_Clothes/BlueScarf.png"));


      schoolBottoms.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BrownGloves.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlueScarf.png"));
    }

      public List<Image> getschoolAccessories(){
        return schoolAccessories;
      }

      public List<Image> getschoolBottoms(){
        return schoolTops;
      }
      public List<Image> getschoolJackets(){
        return schoolBottoms;
      }
      public List<Image> getWinningOutfit(){
        //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
        return List.of(new Image ("assets_Clothes/BlueScarf.png"), new Image ("assets_Clothes/BrownGloves.png"), new Image ("assets_Clothes/BlackGloves.png"));
      }
 
}
