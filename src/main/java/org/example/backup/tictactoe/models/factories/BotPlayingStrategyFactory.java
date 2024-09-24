package org.example.backup.tictactoe.models.factories;


import org.example.backup.tictactoe.models.Bot;
import org.example.backup.tictactoe.models.botPlayingStrategy.BotPlayingStrategy;
import org.example.backup.tictactoe.models.botPlayingStrategy.EasyBotPlayingStrategy;
import org.example.backup.tictactoe.models.botPlayingStrategy.HardBotPlayingStrategy;
import org.example.backup.tictactoe.models.botPlayingStrategy.MediumBotPlayingStrategy;
import org.example.backup.tictactoe.models.enums.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(Bot bot){
        BotDifficultyLevel difficultyLevel = bot.getDifficultyLevel();
        if(difficultyLevel == BotDifficultyLevel.EASY){
            return new EasyBotPlayingStrategy(bot);
        } else if(difficultyLevel == BotDifficultyLevel.MEDIUM){
            return new MediumBotPlayingStrategy(bot);
        } else if(difficultyLevel == BotDifficultyLevel.HARD){
            return new HardBotPlayingStrategy(bot);
        }
        return null;
    }
}
