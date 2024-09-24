package org.example.tictactoe;

import org.example.backup.tictactoe.models.exceptions.BotCountException;
import org.example.backup.tictactoe.models.exceptions.DimensionException;
import org.example.backup.tictactoe.models.exceptions.DuplicateSymbolException;
import org.example.backup.tictactoe.models.exceptions.PlayerCountException;
import org.example.tictactoe.enums.BotDifficultyLevel;
import org.example.tictactoe.models.*;
import org.example.tictactoe.winningStrategies.RowWinningStrategy;
import org.example.tictactoe.winningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // in the case of implementing games, you can take the blow approach.

    // main contains all the hardcoding that you need to do.
    // can contain the game logic as well.
    // if you get time, then move the logic to service class.
    public static void main(String[] args) throws PlayerCountException, DuplicateSymbolException, BotCountException, DimensionException {

        int boardSize = 3;

        List<Player> players1 = new ArrayList<>();
        players1.add(new Player(1, "Saharsh", new Symbol('X')));
        players1.add(new Player(2, "Navdeep", new Symbol('O')));


        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());

        Game game = Game.getbuilder()
                        .setBoardSize(boardSize)
                        .setPlayers(players1)
                        .setWinningStrategies(winningStrategies)
                        .build();
        game.play();


        System.out.println("DEBUG");

//        Game g1 = new Game(3, players1, winningStrategies);
//        Game g2 = new Game(5, players2, winningStrategies);


    }
}

// we have covered
// 0. Overview
// 1. requirements
// 2. class diagrams -> code
// 3. schema -> structure your DB

// Agenda
// how to implement TicTacToe
// basic structure
// Game Builder
// Bot difficulties
// Winning Strategies
// undo feature.
// keep the class till 9:30.