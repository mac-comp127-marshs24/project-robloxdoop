import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.macalester.graphics.Image;

public class TheMotherBoard {
    static Random randNum = new Random();
    static List<Image> Themes = new ArrayList<>();
    static Winter winter = new Winter();
    static School school = new School();
    static Beach beach = new Beach();
    static Image ChosenTheme;
    static String filePath;

    public TheMotherBoard(){
    Themes.add(Winter.getOutfitComparision());
    Themes.add(School.getOutfitComparision());
    Themes.add(Beach.getOutfitComparision());
    ChosenTheme = Themes.get(randNum.nextInt(Themes.size()));
    
    }

    public void setTheme() {
        ChosenTheme = Themes.get(randNum.nextInt(Themes.size()));
    }

    public static Image getTheme(){
        return ChosenTheme;
    }

    public static String ChosenThemeName(Image ChosenTheme){

        System.out.println("The chosen theme "+ ChosenTheme);
        System.out.println("Winter " + Winter.getOutfitComparision());
        System.out.println("School " + School.getOutfitComparision());
        System.out.println("Beach " + Beach.getOutfitComparision());

        if (ChosenTheme.equals(Winter.getOutfitComparision())){
            return "The Theme is Winter!";
        }
        else if(ChosenTheme.equals(Beach.getOutfitComparision())){
            return "The Theme is Beach!";
        }
        else{
            return "The Theme is School!";
        }
        
    } 

    public static void main(String[] args) {

        new Thread(() -> {
            AudioFilePlayer player = new AudioFilePlayer();
            player.play("res/around_the_world-atc.wav");
        }).start();

        // Create and display the ScreenManager
        new ScreenManager();
            
    }

}
       




