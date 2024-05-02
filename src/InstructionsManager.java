import java.awt.Color;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;

public class InstructionsManager {

    static String introductionText = "Hello and Welcome to Fashion Famous! \n" +
    "In this game, you will be given a theme,\n" +
    "to which you must create a spectacular \n" +
    "outfit to present to the judges.";

    static String introductionText2 = "At the end, the judges' top pick will be, \n" +
    "presented and you will be given a score \n" + 
    "Based on how well you did! Good Luck!";

    static GraphicsText Instructions = new GraphicsText(introductionText);
    static GraphicsText Instructions1 = new GraphicsText(introductionText2);

    public static GraphicsText formatString(GraphicsText stringName){
    stringName.setFontSize(60);
    stringName.setFillColor(Color.WHITE);
    stringName.setStroked(true);
    stringName.setStrokeWidth(2);
    stringName.setStrokeColor(Color.BLACK);

    return stringName;
    }

    

    public static void theInstructionsScreen(CanvasWindow canvas, GraphicsObject buttonName){
    Image instructionsScreen;
    formatString(Instructions).setPosition(0,150);
    formatString(Instructions1).setPosition(-100,450);

    instructionsScreen = new Image(0,0);
    instructionsScreen.setScale(0.75,0.75);
    instructionsScreen.setImagePath("assets/mainMenu2.png");
    Image InstructScreenReadyButton = new Image("assets/ReadyButton.png");

    canvas.add(instructionsScreen);
    canvas.add(Instructions);
    canvas.add(Instructions1);
    moveableText(canvas, Instructions, 5, 0, InstructScreenReadyButton);
    buttonName.setCenter(canvas.getWidth()/2, 700);
    buttonName.setScale(0.4);
    canvas.add(buttonName);

     canvas.onClick(
        event -> {event.getPosition();
            if(canvas.getElementAt(event.getPosition()) == buttonName){
            canvas.removeAll();
            if(TheMotherBoard.getTheme().equals(Winter.getOutfitComparision())){
                Winter.winterTheme(canvas);
            }if(TheMotherBoard.getTheme().equals(School.getOutfitComparision())){
                School.schoolTheme(canvas);
            }
            if(TheMotherBoard.getTheme().equals(Beach.getOutfitComparision())){
            Beach.beachTheme(canvas);
            }
        
            }

        }
    );


}

public static void moveableText(CanvasWindow canvas,GraphicsText Instructions, double dx, double dy, Image buttonName){
    canvas.animate( 
        () -> {
            if(Instructions.getX() + Instructions.getWidth() + 50 < canvas.getWidth()){
            Instructions.moveBy(dx,dy);}
            else if((Instructions1.getX() + Instructions1.getWidth() + 50 < canvas.getWidth())) {
                Instructions1.moveBy(dx,dy);} 
        }

    );

    
}
}