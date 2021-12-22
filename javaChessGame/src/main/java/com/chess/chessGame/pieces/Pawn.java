package com.chess.chessGame.pieces;

import org.springframework.stereotype.Component;

@Component
public class Pawn extends Piece {

    public Pawn() {
        super.canMoveOnlyOneSpace = true;
        super.isKnight = false;
        super.isPawn = true;
        super.moveDiagonal = false;
        super.moveHorizontal = false;
        super.moveVertical = true;
    }
}
