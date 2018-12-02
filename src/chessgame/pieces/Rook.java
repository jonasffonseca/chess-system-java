package chessgame.pieces;

import boardgame.Board;
import chessgame.ChessPiece;
import chessgame.enums.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "R";
	}

}
