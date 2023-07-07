package entities.chess.exceptions;

import entities.board.exceptions.BoardException;

public class ChessException extends BoardException {

	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}

}
