package org.example.backup.tictactoe.models.winningStrategies;


import org.example.backup.tictactoe.models.Board;
import org.example.backup.tictactoe.models.Cell;
import org.example.backup.tictactoe.models.Move;
import org.example.backup.tictactoe.models.Player;

import java.util.List;

public class ColumnWinningStrategy extends MapWinningStrategy{

    public ColumnWinningStrategy(int dimension, List<Player> players){
        super(dimension, players);
    }

    @Override
    public void updateCount(Board board, Move lastMove){
        Cell cell = lastMove.getCell();
        Player player = lastMove.getPlayer();
        int column = cell.getColumn();

        updateCountMap(column, player);
    }

    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        Cell cell = lastMove.getCell();
        Player player = lastMove.getPlayer();
        int column = cell.getColumn();

        return checkCountMapForWinner(column, player, board.getSize());
    }

    @Override
    public void handleUndo(Board board, Move lastMove){
        Player player = lastMove.getPlayer();
        Cell cell = lastMove.getCell();
        int column = cell.getColumn();

        handleMapUndo(column, player);
    }
}



// X O X
//   O X
//   O
