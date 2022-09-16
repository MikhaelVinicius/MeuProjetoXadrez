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
    private Piece[][] pieces;

    public Board(int rows, int conlumns){
        if(rows < 1 || conlumns < 1){
            throw new BoardException("Erro criando o tabuleiro: É necessario que haja pelo menos uma linha e uma coluna.");
        }

        this.rows = rows;
        this.conlumns = conlumns;
        pieces = new Piece[rows][conlumns];
    }

    public Piece piece(int row, int colum){
        if(!positionExists(row,colum)){
            throw  new BoardException("Posição não está no tabuleiro.");
        }

        return pieces[row][colum];
    }

    public Piece piece(Position position){
        if(!positionExists(position)){
            throw  new BoardException("Posição não está no tabuleiro.");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void  placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("Já há uma posição " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;

    }

    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        if(piece(position)==null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    private boolean positionExists(int row, int conlum){
        return row >= 0 && row < rows && conlum >= 0 && conlum < conlumns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Não está no tabuleiro.");
        }
        return piece(position) != null;


    }


}
