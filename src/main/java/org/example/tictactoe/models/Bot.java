package org.example.tictactoe.models;


import org.example.tictactoe.enums.BotDifficultyLevel;
import org.example.tictactoe.enums.PlayerType;

public class Bot extends Player {

    private BotDifficultyLevel difficultyLevel;
    // bot has 5 attributes in total
    // 4 are from parent -> player

    public Bot(int id, String name, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(id, name, symbol);
        this.difficultyLevel = difficultyLevel;
        this.setPlayerType(PlayerType.BOT);
    }

    public BotDifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
