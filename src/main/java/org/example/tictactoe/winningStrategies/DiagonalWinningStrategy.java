package org.example.tictactoe.winningStrategies;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        // check the diagonal of this board.
        return false;
    }
}
