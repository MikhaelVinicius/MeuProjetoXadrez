package chess;

import boardgame.Board;
import boardgame.Piece;
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
        turn = 1;
        currentPlayer = Color.WHITE;
        inicialSetup();
    }

    public int getTurn(){
        return turn;
    }
    public Color getCurrentPlayer(){
        return currentPlayer;
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

    public ChessPiece[][] getPieces(){

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
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));

    }

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validar(source);
        validaTarget(source,target);
        Piece capturePiece = makeMove(source, target);
        nextTurn();
        return (ChessPiece)capturePiece;

    }

    private void validaTarget(Position source, Position target) {
        if(!board.piece(source).possibleMoves(target)){
            throw new ChessExpetion("The chosen piece can not move to target position");
        }

    }

    private void validar(Position position){
        if(!board.thereIsAPiece(position)){
            throw new ChessExpetion("Não existe peça na posição de origem");


        }
        if(currentPlayer != ((ChessPiece)board.piece(position)).getColor()){
            throw new ChessExpetion("A peça escolhida não é sua.");
        }


        if(!board.piece(position).isThereAnyPossibleMove()){
            throw new ChessExpetion("There is nom possibles moves for the chosen piece");
        }


    }
    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturada = board.removePiece(target);
        board.placePiece(p,target);
        return capturada;

    }

    public boolean[][] possibleMoves(ChessPosition sourcePosition){
        Position position = sourcePosition.toPosition();
        validar(position);
        return board.piece(position).possibleMoves();
    }

    private void nextTurn(){
        turn++;
        currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }



}
