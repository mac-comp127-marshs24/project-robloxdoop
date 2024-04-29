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
      schoolHats.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolHats.add(new Image ("assets_Clothes/BrownGloves.png"));
      schoolHats.add(new Image ("assets_Clothes/BlueScarf.png"));

      schoolNeck.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolNeck.add(new Image ("assets_Clothes/BrownGloves.png"));
      schoolNeck.add(new Image ("assets_Clothes/BlueScarf.png"));

      schoolTops.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolTops.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolTops.add(new Image ("assets_Clothes/BlackGloves.png"));

      schoolBottoms.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BrownGloves.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlueScarf.png"));
   
      schoolShoes.add(new Image ("assets_Clothes/BlackGloves.png"));
      schoolShoes.add(new Image ("assets_Clothes/BrownGloves.png"));
      schoolShoes.add(new Image ("assets_Clothes/BlueScarf.png"));

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
        return List.of(new Image ("assets_Clothes/BlueScarf.png"), new Image ("assets_Clothes/BrownGloves.png"), new Image ("assets_Clothes/BlackGloves.png"));
      }
 
}
