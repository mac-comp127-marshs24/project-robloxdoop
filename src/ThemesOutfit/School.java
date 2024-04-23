package ThemesOutfit;

import java.util.List;

import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Image;



public class School{
    List<Image>  schoolBags;
    List<Image> schoolShirts;
    List<Image> schoolBottoms;
    
    


    public School(){
     schoolBags = List.of(new Image ("assets_Clothes/PurpleHeartBackpack.png"),
                          new Image ("assets_Clothes/BlueShoulderBackpack.png"),
                          new Image ("assets_Clothes/PurpleShoulderBag.png"));
    schoolShirts = List.of(new Image ("assets_Clothes/BlackShirt.png"),
                           new Image("assets_Clothes/GreenTop.png"),
                           new Image ("assets_Clothes/WhiteShirt.png"));
    schoolBottoms = List.of(new Image ("assets_Clothes/KhakiPants.png"),
                           new Image("assets_Clothes/BlackJeans.png"),
                           new Image("assets_Clothes/TealSkirtLong.png"),
                           new Image("assets_Clothes/WhiteSneakers.png")); //Shoe
    }

      public List<Image> getschoolBags(){
        return schoolBags;
      }
      public List<Image> getschoolBottoms(){
        return schoolBottoms;
      }
      public List<Image> getWinningOutfit(){
        return schoolBags;
      }
}
 




// extends GraphicsGroup {
    
//     Image dress;
//     Image pants;

//     public School() {
    
//     }

//     public GraphicsObject top() {
//         dress = new Image(250,0);
//         dress.setScale(0.25,0.25);
//         // dress.setCenter(canvas.getCenter());
//         dress.setImagePath("testDress.png");

//         return dress;
//     }

//     public GraphicsObject bottom() {
//         pants = new Image(250,0);
//         pants.setScale(0.25,0.25);
//         pants.setImagePath("assets/pants.png");

//         return pants;
//     }

//     public GraphicsObject shoes() {
//         dress = new Image(250,0);
//         dress.setScale(0.25,0.25);
//         // dress.setCenter(canvas.getCenter());
//         dress.setImagePath("testDress.png");

//         return dress;
//     }

//     public GraphicsObject hair() {
//         dress = new Image(250,0);
//         dress.setScale(0.25,0.25);
//         // dress.setCenter(canvas.getCenter());
//         dress.setImagePath("testDress.png");

//         return dress;
//     }

//     public List<Image> getWinningOutfit() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getWinningOutfit'");
//     }
    
    
    
    
// }
