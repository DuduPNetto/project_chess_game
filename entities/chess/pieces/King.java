package entities.chess.pieces;

import entities.board.Board;
import entities.chess.enums.Color;
import entities.chess.ChessPiece;

public class King extends ChessPiece {
    
    public King(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

}
