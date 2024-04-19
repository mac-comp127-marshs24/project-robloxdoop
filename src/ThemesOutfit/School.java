package ThemesOutfit;

import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Image;



public class School extends GraphicsGroup {
    
    Image dress;
    Image pants;

    public School() {
    
    }

    public GraphicsObject top() {
        dress = new Image(250,0);
        dress.setScale(0.25,0.25);
        // dress.setCenter(canvas.getCenter());
        dress.setImagePath("testDress.png");

        return dress;
    }

    public GraphicsObject bottom() {
        pants = new Image(250,0);
        pants.setScale(0.25,0.25);
        pants.setImagePath("assets/pants.png");

        return pants;
    }

    public GraphicsObject shoes() {
        dress = new Image(250,0);
        dress.setScale(0.25,0.25);
        // dress.setCenter(canvas.getCenter());
        dress.setImagePath("testDress.png");

        return dress;
    }

    public GraphicsObject hair() {
        dress = new Image(250,0);
        dress.setScale(0.25,0.25);
        // dress.setCenter(canvas.getCenter());
        dress.setImagePath("testDress.png");

        return dress;
    }
    
    
    
    
}
