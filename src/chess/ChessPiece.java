package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public Color getColor() {
        return color;
    }



    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public ChessPosition getChessPosition(){
        return getChessPosition();
        /* ???? */
    }

    protected boolean isThereOpponentPiece(Position position){
        return true;
    }

    protected void increaseMoceCount(){

    }
    protected void  descraeseMoveCount(){

    }

}
