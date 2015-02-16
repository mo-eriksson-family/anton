package se.liu.ida.anter491.tddd78.lab4;

import java.util.Random;

/**
 * Created by ame on 2015-02-07.
 */
public class TetrominoMaker {

    Random rnd = new Random();
    //Boolean[][] iBlockTest = {
      //      {false, false, false, true},
        //    {false, false, false, true},
          //  {false, false, false, true},
            //{false, false, false, true}};

    SquareType[][] iBlock = {
            {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
            {SquareType.I, SquareType.I, SquareType.I, SquareType.I},
            {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
            {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}};

    SquareType[][] jBlock = {
            {SquareType.J, SquareType.EMPTY, SquareType.EMPTY},
            {SquareType.J, SquareType.J, SquareType.J},
            {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}};

    SquareType[][] lBlock = {
            {SquareType.EMPTY, SquareType.EMPTY, SquareType.L},
            {SquareType.L, SquareType.L, SquareType.L},
            {SquareType.EMPTY,SquareType.EMPTY,SquareType.EMPTY}};

    SquareType[][] oBlock = {
            {SquareType.O, SquareType.O},
            {SquareType.O, SquareType.O}};

    SquareType[][] sBlock = {
            {SquareType.EMPTY, SquareType.S, SquareType.S},
            {SquareType.S, SquareType.S, SquareType.EMPTY},
            {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}};

    SquareType[][] tBlock = {
            {SquareType.EMPTY, SquareType.T, SquareType.EMPTY},
            {SquareType.T, SquareType.T, SquareType.T},
            {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}};

    SquareType[][] zBlock = {
            {SquareType.Z, SquareType.Z, SquareType.EMPTY},
            {SquareType.EMPTY, SquareType.Z, SquareType.Z},
            {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}};




    public int randomGenerator(int n) {
        //Random number to represent squareType
        Random rnd = new Random();
        return rnd.nextInt(n);
    }

    public int getNumberOfType() {

        int numberOfTypes = SquareType.values().length - 2;
        return randomGenerator(numberOfTypes);
    }

    public Poly getPoly(int n) {
        // n between 0-6 to generate one of the 7 types
        switch (n) {
            case 0:
                return new Poly(iBlock);
            case 1:
                return new Poly(oBlock);
            case 2:
                return new Poly(tBlock);
            case 3:
                return new Poly(sBlock);
            case 4:
                return new Poly(zBlock);
            case 5:
                return new Poly(jBlock);
            case 6:
                return new Poly(lBlock);
        }

        System.out.println("blah");
        return null;
    }

    public static void main(String[] args) {

    TetrominoMaker testTet = new TetrominoMaker();
        for (int i = 0; i < 30; i++) {
            System.out.println(testTet.getPoly(5));
        }

    }
}

