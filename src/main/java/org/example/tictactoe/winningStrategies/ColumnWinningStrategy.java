package org.example.tictactoe.winningStrategies;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;

public class ColumnWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        // check all columns in this board
        return false;
    }
}
