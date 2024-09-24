package org.example.backup.tictactoe;

import org.example.backup.tictactoe.models.Bot;
import org.example.backup.tictactoe.models.Game;
import org.example.backup.tictactoe.models.Player;
import org.example.backup.tictactoe.models.Symbol;
import org.example.backup.tictactoe.controllers.GameController;
import org.example.backup.tictactoe.models.enums.BotDifficultyLevel;
import org.example.backup.tictactoe.models.exceptions.BotCountException;
import org.example.backup.tictactoe.models.exceptions.DimensionException;
import org.example.backup.tictactoe.models.exceptions.DuplicateSymbolException;
import org.example.backup.tictactoe.models.exceptions.PlayerCountException;
import org.example.backup.tictactoe.models.winningStrategies.*;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PlayerCountException, DuplicateSymbolException, BotCountException, DimensionException {
        GameController gameController = new GameController();

        int dimension = 3;

        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "Saharsh", new Symbol('X')));
        players.add(new Bot(2, "Bot", new Symbol('O'), BotDifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy(dimension, players));
        winningStrategies.add(new ColumnWinningStrategy(dimension, players));
        winningStrategies.add(new DiagonalWinningStrategy(players));
        winningStrategies.add(new CornersWinningStrategy());

        Game game = gameController.createGame(dimension, players, winningStrategies);
        gameController.runGame(game);

//        System.out.println("game has been started");
//        gameController.displayBoard(game);
//        while(game.getGameState() == GameState.IN_PROGRESS){
//            gameController.makeMove(game);
//            if(game.getGameState() == GameState.COMPLETED || game.getGameState() == GameState.DRAW){
//                break;
//            }
//            gameController.displayBoard(game);
//            gameController.checkForUndo(game);
//        }
//
//        gameController.displayBoard(game);
//        if(game.getGameState() == GameState.COMPLETED){
//            System.out.println("Game is completed. Winner is " + game.getWinner().getName());
//        }
//        if(game.getGameState() == GameState.DRAW){
//            System.out.println("Game is a Draw");
//        }
    }
}