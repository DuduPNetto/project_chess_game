package entities.chess.pieces;

import entities.board.Board;
import entities.chess.enums.Color;
import entities.chess.ChessPiece;

public class Rook extends ChessPiece {
    
    public Rook(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

}
