package se.liu.ida.anter491.tddd78.lab4;

import java.util.ArrayList;

/**
 * Created by ame on 2015-02-05.
 */
public class BoardTest {


    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Board testBoard = new Board(15, 10);
            TetrominoMaker testMaker = new TetrominoMaker();
            //testBoard.setRandomBoard();
            testBoard.setFalling(testMaker.getPoly(5));
            System.out.println(testBoard.getFalling()
            );
            System.out.println(BoardToTextConverter.convertToText(testBoard));

        }


            //SquareType[][] testPoly = new SquareType[2][2];

            //System.out.println(testPoly[0].length);

        //System.out.println(SquareType.values()[8]);



    }
}
