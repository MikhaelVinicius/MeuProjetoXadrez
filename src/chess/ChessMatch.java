package chess;

import boardgame.Board;
import boardgame.Position;

public class ChessMatch {

    private int turn;
    private Color currentPlayer;
    private boolean check;
    private boolean checkMate;
    private ChessPiece enPassantVulnerable;
    private ChessPiece promoted;
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        inicialSetup();
    }

    public ChessPiece[][] getPiece(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getConlumns()];
        for(int i=0; i<board.getRows();i++){
            for(int j=0; j<board.getConlumns();j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);

            }
        }
        return mat;
    }

    public ChessPiece getPieces(){

        return getPieces();

    }

    public boolean possibleMoves(ChessPiece sourcePosition){
        return possibleMoves(sourcePosition);
    }

    public ChessPiece performChessMove(ChessPiece sourcePosition, ChessPiece targetPosition ){
        return performChessMove(sourcePosition, targetPosition);
    }

    public ChessPiece replacePromotetPiece(String type){
        return  replacePromotetPiece(type);

    }
    private void placeNewPiece(char column, int row, ChessPiece piece ){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());

    }

    private void inicialSetup(){
        placeNewPiece('c', 6, new Rook(board,Color.White));
        board.placePiece(new King(board,Color.Black), new Position(2, 1));

    }



}
