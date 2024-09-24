package org.example.backup.tictactoe.models.winningStrategies;

import org.example.backup.tictactoe.models.Board;
import org.example.backup.tictactoe.models.Move;

public interface WinningStrategy {
    void updateCount(Board board, Move lastMove);
    boolean checkWinner(Board board, Move lastMove);
    void handleUndo(Board board, Move lastMove);
}
