package chess;

import boardgame.Board;

public class Quenn extends ChessPiece{
    public Quenn(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String  toString(){
        return "Q";}

    @Override
    public boolean[][] possibleMoves() {
        return new boolean[0][];
    }
}
