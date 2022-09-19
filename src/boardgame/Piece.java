package boardgame;

import boardgame.Board;

public abstract class Piece {

    protected Position position;
    private Board board;

    public abstract boolean [][] possibleMoves();

        public boolean possibleMoves(Position position){
            return possibleMoves()[position.getRow()][position.getColumn()];
        }
        public boolean isThereAnyPossibleMove(){
            boolean [][] mat = possibleMoves();
            for(int i = 0; i< mat.length; i++){
                for(int j=0; j< mat.length; j++){
                    if(mat[i][j]){
                        return true;
                    }

                }
            }
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
