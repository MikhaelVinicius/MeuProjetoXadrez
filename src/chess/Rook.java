package chess;

import boardgame.Board;
import chess.ChessPiece;

public class Rook extends ChessPiece{
    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String  toString(){
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        return new boolean[0][];
    }
}
