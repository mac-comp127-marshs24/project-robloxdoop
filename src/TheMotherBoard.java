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
    static List<Image> ChosenTheme;

    public TheMotherBoard(){
    Themes.add(winter.getWinningOutfit());
    Themes.add(school.getWinningOutfit());
    Themes.add(beach.getWinningOutfit());
    ChosenTheme = Themes.get(randNum.nextInt(Themes.size()));
    
    }

    public static List<Image> getTheme(){
        return ChosenTheme;
    }

    public static String ChosenThemeName(List<Image> ChosenTheme){

        System.out.println("The chosen theme "+ ChosenTheme);
        System.out.println("Winter " + winter.getWinningOutfit());
        System.out.println("School " + school.getWinningOutfit());
        System.out.println("Beach " + beach.getWinningOutfit());

        if (ChosenTheme.equals(winter.getWinningOutfit())){
            return "The Theme is Winter!";
        }
        else if(ChosenTheme.equals(beach.getWinningOutfit())){
            return "The Theme is Beach!";
        }
        else{
            return "The Theme is School!";
        }
        
    } 

    public static void main(String[] args) {
        new TheMotherBoard();
        new ScreenManager();
        System.out.println(ChosenThemeName(getTheme()));
        
    }
    
}




