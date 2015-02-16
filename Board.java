package se.liu.ida.anter491.tddd78.lab4;

import java.util.Random;

/**
 * Created by ame on 2015-02-04.
 */
public class Board {

    private SquareType[][] squares;
    private int height;
    private int width;
    private Poly falling;
    private int fallingXPosition;
    private int fallingYPosition;

    public void setFallingXPosition(int fallingXPosition) {
        this.fallingXPosition = fallingXPosition;
    }

    public void setFallingYPosition(int fallingYPosition) {
        this.fallingYPosition = fallingYPosition;
    }

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        this.squares = new SquareType[height][width];


            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {

                    if (j == 0 || j == (width - 1)) {
                        squares[i][j] = SquareType.OUTSIDE; }

                    else if (i == 0 || i == (height - 1)) {
                        squares[i][j] = SquareType.OUTSIDE;
                    }
                    else {
                        squares[i][j] = SquareType.EMPTY;
                    }
                }
            }

        }

    public void setRandomBoard() {
        for (int i = 1; i < height -1 ; i++) {
            for (int j = 1; j < width - 1; j++) {
                squares[i][j] = SquareType.values()[randomGenerator()];
            }
        }

    }


    public void setFalling(Poly falling) { this.falling = falling; }

    public Poly getFalling() { return falling; }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getFallingXPosition() { return fallingXPosition; }

    public int getFallingYPosition() { return fallingYPosition; }

    public SquareType getSquaresType(int xCoordinate, int yCoordinate) {
        //Returns squareType
        return squares[xCoordinate][yCoordinate];
    }
    public int randomGenerator() {
        //Random number to represent squareType
        Random rnd = new Random();
        return rnd.nextInt(9);
    }
    public void BoardRandom(int height, int width) {
        this.height = height;
        this.width = width;
        this.squares = new SquareType[height][width];


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (j == 0 || j == (width - 1)) {
                    squares[i][j] = SquareType.OUTSIDE; }

                else if (i == 0 || i == (height - 1)) {
                    squares[i][j] = SquareType.OUTSIDE;
                }
                else {
                    squares[i][j] = SquareType.values()[randomGenerator()];

                }
                //System.out.println(squares[i][j]);

            }
        }

    }

}
