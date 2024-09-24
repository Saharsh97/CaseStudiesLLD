package org.example.tictactoe.winningStrategies;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        // check row wise
        return false;
    }
}
