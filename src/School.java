

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
      schoolHats.add(new Image ("assets_Clothes/BlackCap.png"));
      schoolHats.add(new Image ("assets_Clothes/WhiteBeanie.png"));
      schoolHats.add(new Image("assets_Clothes/PinkVisor.png"));

      schoolNeck.add(new Image ("assets_Clothes/TealScarf.png"));
      schoolNeck.add(new Image ("assets_Clothes/BlueScarf.png"));
      schoolNeck.add(new Image("assets_Clothes/ChainNecklace.png"));
    
      schoolTops.add(new Image ("assets_Clothes/PinkTubeTop.png"));
      schoolTops.add(new Image ("assets_Clothes/MintFlowerTop.png"));
      schoolTops.add(new Image ("assets_Clothes/RedVelvetTop.png"));

      schoolBottoms.add(new Image ("assets_Clothes/WhiteShorts.png"));
      schoolBottoms.add(new Image ("assets_Clothes/BlackSkirt.png"));
      schoolBottoms.add(new Image("assets_Clothes/BlackJeans.png"));

      schoolShoes.add(new Image ("assets_Clothes/GoldHeels.png"));
      schoolShoes.add(new Image ("assets_Clothes/GreenBoots.png"));
      schoolShoes.add(new Image ("assets_Clothes/BlackHeels.png"));

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

      public static List<Image> getWinningOutfit(){
        //WHAT WE DECIDED THE WINNING OUTFIT WILL BE
        return List.of(new Image ("assets_Clothes/BlackCap.png"), 
        new Image ("assets_Clothes/TealScarf.png"),
        new Image ("assets_Clothes/MintFlowerTop.png"),
        new Image ("assets_Clothes/BlackSkirt.png"),
        new Image ("assets_Clothes/GreenBoots.png")
      );
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
