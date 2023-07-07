package entities.chess;

import entities.board.Board;
import entities.board.Position;
import entities.chess.enums.Color;
import entities.chess.pieces.King;
import entities.chess.pieces.Rook;

public class ChessMatch {
    
    private Board board;

    public ChessMatch(){
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i++){
            for(int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));
        board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }

}
