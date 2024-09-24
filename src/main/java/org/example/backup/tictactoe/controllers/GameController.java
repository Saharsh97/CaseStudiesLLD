package org.example.backup.tictactoe.controllers;


import org.example.backup.tictactoe.models.Game;
import org.example.backup.tictactoe.models.Player;
import org.example.backup.tictactoe.models.exceptions.BotCountException;
import org.example.backup.tictactoe.models.exceptions.DimensionException;
import org.example.backup.tictactoe.models.exceptions.DuplicateSymbolException;
import org.example.backup.tictactoe.models.exceptions.PlayerCountException;
import org.example.backup.tictactoe.models.winningStrategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws PlayerCountException, DuplicateSymbolException, BotCountException, DimensionException, PlayerCountException, DuplicateSymbolException, BotCountException, DimensionException {
        return Game.getBuilder().
                setDimension(dimension).
                setPlayers(players).
                setWinningStrategies(winningStrategies).
                build();
    }

    public void displayBoard(Game game){
        game.getBoard().displayBoard();
    }

    public void runGame(Game game){
        game.run();
    }
}
