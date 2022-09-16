package boardgame;

import boardgame.Board;

public class Piece {

    protected Position position;
    private Board board;

    public boolean possibleMoves(){
       boolean[][] possibleMoves = new boolean[position.getRow()][position.getColumn()];
        /* ???? */
        return false;}

    public boolean possibleMove(Position position){
        return false;}

    public boolean isThereAnyPossibleMove(){
        return false;
    }

    protected Board getBoard() {
        return board;
    }

    public Piece(Board board){
        this.board = board;
        position = null;
    }

}
