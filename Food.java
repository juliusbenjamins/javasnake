package snake;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * @author Niels Feij s1029983
 * @author Julius Benjamins s1022533
 */
public class Food extends Circle {
    private int foodX = 0, foodY = 0;

    public Food () {
        super( World.UNIT / 2, World.UNIT / 2, World.UNIT / 2, Color.BLUE );
    }
    
    public boolean foundAt( int x, int y ){
        return foodX == x && foodY == y;
    }
    
    public void moveTo( int x, int y ){
        foodX = x;
        foodY = y;
        setTranslateX(foodX * World.UNIT);
        setTranslateY(foodY * World.UNIT);
    }
}
