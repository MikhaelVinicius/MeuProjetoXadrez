package principal;

import boardgame.Board;
import chess.ChessMatch;

public class programaPrincipal {
    public static void main(String[] arg){

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPiece());



    }
}
