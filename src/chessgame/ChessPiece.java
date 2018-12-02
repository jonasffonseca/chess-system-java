package chessgame;

import boardgame.Board;
import boardgame.Piece;
import chessgame.enums.Color;

public class ChessPiece extends Piece {
	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}