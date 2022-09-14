public class ChessMatch {
    private int turn;
    private Color currentPlayer;
    private boolean check;
    private boolean checkMate;
    private ChessPiece enPassantVulnerable;
    private ChessPiece promoted;
    private Board board;

    public ChessPiece getPieces(){
        ChessPiece [][] getPieces = new ChessPiece[][];
        /* ???? */

    }

    public boolean possibleMoves(ChessPiece sourcePosition){
        return possibleMoves(sourcePosition);
    }

    public ChessPiece performChessMove(ChessPiece sourcePosition,ChessPiece targetPosition ){
        return performChessMove(sourcePosition, targetPosition);
    }

    public ChessPiece replacePromotetPiece(String type){
        return  replacePromotetPiece(type);

    }


}
