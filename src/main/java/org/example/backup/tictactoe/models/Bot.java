package org.example.backup.tictactoe.models;


import org.example.backup.tictactoe.models.botPlayingStrategy.BotPlayingStrategy;
import org.example.backup.tictactoe.models.enums.BotDifficultyLevel;
import org.example.backup.tictactoe.models.enums.PlayerType;
import org.example.backup.tictactoe.models.factories.BotPlayingStrategyFactory;

public class Bot extends Player{

    private BotDifficultyLevel difficultyLevel;

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

    public Move makeMove(Board board){
        BotPlayingStrategy playingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(this);
        return playingStrategy.makeBotMove(board);
    }
}
