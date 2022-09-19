package principal;

import boardgame.Board;
import chess.ChessExpetion;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class programaPrincipal {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            try{
            UI.printBoard(chessMatch.getPiece());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            UI.clearScreen();

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturar = chessMatch.performChessMove(source,target);

        }
        catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();

        }
        }


    }
}
