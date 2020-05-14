/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

/**
 * @author Niels Feij s1029983
 * @author Julius Benjamins s1022533
 */
public enum Direction {
    Up(0,-1), Right(1,0), Down(0,1), Left(-1,0);

    private final int dX, dY;

    private Direction(int dX, int dY) {
        this.dX = dX;
        this.dY = dY;
    }
    public int getdX() {
        return dX;
    }

    public int getdY() {
        return dY;
    }
   }
