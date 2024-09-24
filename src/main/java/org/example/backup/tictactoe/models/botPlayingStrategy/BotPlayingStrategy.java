package org.example.backup.tictactoe.models.botPlayingStrategy;


import org.example.backup.tictactoe.models.Board;
import org.example.backup.tictactoe.models.Move;

public interface BotPlayingStrategy {
    // just give a reference of the board,
    // let the strategy decide what move it wants to make.
    Move makeBotMove(Board board);
}
