/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package boardgame;

/**
 *
 * @author fergalhainey
 */
public class Move {
    private int x;
    private int y;
    private int colour;

    public int getColour() {
        return colour;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Move(int x, int y, int colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }
}
