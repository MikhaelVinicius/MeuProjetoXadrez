package chess;

import boardgame.Board;
import boardgame.Position;
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

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getConlumns()];
        Position p = new Position(0, 0);

        p.setValues(position.getRow()-1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow(), position.getColumn()-1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow(), position.getColumn()+1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }

        p.setValues(position.getRow()+1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }





        return mat;

    }
}
