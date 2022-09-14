package boardgame;

public class Board {
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    private int rows;

    public int getConlumns() {
        return conlumns;
    }

    public void setConlumns(int conlumns) {
        this.conlumns = conlumns;
    }

    private int conlumns;
    private Piece[][] piece;

    public Board(int rows, int conlumns){
        this.rows = rows;
        this.conlumns = conlumns;
        piece = new Piece[rows][conlumns];
    }

    public Piece piece(int row, int colum){

        return piece[row][colum];
    }

    public Piece piece(Position position){
        return piece[position.getRow()][position.getColumn()];
    }

    public void  placePiece(Piece piece, Position position){
        return;

    }

    public Piece removePiece(Position position){
        return removePiece(position);
    }

    public boolean positionExists(Position position){
        return true;
    }

    public boolean thereIsAPiece(Position position){
        return true;


    }


}
