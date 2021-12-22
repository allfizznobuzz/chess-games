package com.chess.chessGame.pieces;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Piece {

    protected boolean moveVertical;
    protected boolean moveHorizontal;
    protected boolean moveDiagonal;
    protected boolean isKnight;
    protected boolean isPawn;
    protected boolean canMoveOnlyOneSpace;

    public Piece() {
    }

    public List<String> possibleMoves(Map<String, Piece> board) {

        List<String> moves = new ArrayList<String>();



        return moves;
    }

    public boolean getMoveVertical() {
        return moveVertical;
    }

    public void setMoveVertical(boolean moveVertical) {
        this.moveVertical = moveVertical;
    }

    public boolean getMoveHorizontal() {
        return moveHorizontal;
    }

    public void setMoveHorizontal(boolean moveHorizontal) {
        this.moveHorizontal = moveHorizontal;
    }

    public boolean getMoveDiagonal() {
        return moveDiagonal;
    }

    public void setMoveDiagonal(boolean moveDiagonal) {
        this.moveDiagonal = moveDiagonal;
    }

    public boolean getIsKnight() {
        return isKnight;
    }

    public void setKnight(boolean knight) {
        isKnight = knight;
    }

    public boolean getCanMoveOnlyOneSpace() {
        return canMoveOnlyOneSpace;
    }

    public void setCanMoveOnlyOneSpace(boolean canMoveOnlyOneSpace) {
        this.canMoveOnlyOneSpace = canMoveOnlyOneSpace;
    }

    public boolean getIsPawn() {
        return isPawn;
    }

    public void setPawn(boolean pawn) {
        isPawn = pawn;
    }
}
