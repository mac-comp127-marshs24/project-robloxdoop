import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ThemesOutfit.Beach;
import ThemesOutfit.School;
import ThemesOutfit.Winter;
import edu.macalester.graphics.Image;



public class TheMotherBoard {
    static Random randNum = new Random();
    static List<List<Image>> Themes = new ArrayList<>();
    static Winter winter = new Winter();
    static School school = new School();
    static Beach beach = new Beach();

    public TheMotherBoard(){
    Themes.add(winter.getWinningOutfit());
    // Themes.add(school.getWinningOutfit());
    Themes.add(beach.getWinningOutfit());
    
    }
    
    
    public static List<Image> ChosenTheme(){
        return Themes.get(randNum.nextInt(Themes.size()));
    }

    public static String ChosenThemeName(){
        if (ChosenTheme() == winter.getWinningOutfit()){
            return "The Theme is Winter!";
        }
        else if(ChosenTheme() == beach.getWinningOutfit()){
            return "The Theme is Beach!";
        }
        else{
            return "The Theme is School!";
        }
        
    }

    public static void main(String[] args) {
        new TheMotherBoard();
        // new ScreenManager();
        System.out.println(ChosenTheme());
        System.out.println(ChosenThemeName());
        
    }
    
}




