package se.liu.ida.anter491.tddd78.lab4;

/**
 * Created by ame on 2015-02-05.
 */
public class BoardToTextConverter {


    public static String convertToText(Board board) {
        StringBuilder builder = new StringBuilder();
        board.getFalling();

        for (int i = 0; i < board.getHeight(); i++) {
            builder.append("\n");
            for (int j = 0; j < board.getWidth(); j++) {

                switch (board.getSquaresType(i, j)) {
                    case EMPTY:
                        builder.append(" ");
                        break;
                    case OUTSIDE:
                        builder.append("#");
                        break;
                    case I:
                        builder.append("¤");
                        break;
                    case O:
                        builder.append("%");
                        break;
                    case T:
                        builder.append("&");
                        break;
                    case S:
                        builder.append("@");
                        break;
                    case J:
                        builder.append("£");
                        break;
                    case Z:
                        builder.append("$");
                        break;
                    case L:
                        builder.append("+");
                        break;
                    default:
                        builder.append("BADDDD");
                        break;
                }

            }
        }
        String result = builder.toString();
        return result;
    }
}

