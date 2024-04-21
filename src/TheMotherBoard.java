import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;


import ThemesOutfit.School;
import ThemesOutfit.Theme;
import ThemesOutfit.Winter;
import ThemesOutfit.Beach;


public class TheMotherBoard {
    Random randNum = new Random();
    List<Theme> themes = new ArrayList<>()
    randNum.nextInt(themes.size())

    public static void main(String[] args) {
        new TheMotherBoard().generateRandomThemes();  
    }
//Method Works only with Theme Interface or superclass
    //having problems with creating this, Ask Rama Destiny and Hadly
    themes.add(new School());
    themes.add(new Winter());
    themes.add(new Beach());


    public void generateRandomThemes() {
      
     

    
        List<Theme> selectedThemes = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            int index = themeGenerator.nextInt(themes.size());
            selectedThemes.add(themes.remove(index)); 
        

    }
}
}

    


//     public static void main(String[] args) {
//         new ScreenManager();  
        
//     }
// }




