package com.witcheronboard.dto;

import com.witcheronboard.exception.BoardGameException;
import com.witcheronboard.model.GameScore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GameScoreDTO {
    private Integer id;
    private Integer playerId;
    private String playerName;
    private String characterName;
    private Integer gamesPlayed;
    private Integer highScore;
    private Integer score;
    private Boolean isMultiplayer;
    private String gameDate;

    //LocalDate localDate =
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public Integer getGamesPlayed() {
        return gamesPlayed;
    }
    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
    public Integer getHighScore() {
        return highScore;
    }
    public void setHighScore(Integer highScore) {
        this.highScore = highScore;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public Boolean getMultiplayer() {
        return isMultiplayer;
    }
    public void setMultiplayer(Boolean multiplayer) {
        isMultiplayer = multiplayer;
    }
    public LocalDate getGameDate() {
        String dateString = "2023-10-05"; // Example date string in ISO 8601 format (yyyy-MM-dd)
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

        try {
            LocalDate localGameDate = LocalDate.parse(dateString, formatter);
            return localGameDate;

        } catch (Exception e) {
            throw new BoardGameException("GameScoreDTO.WRONG_GIVEN_DATA");
        }

    }
    public void setGameDate(LocalDate gameDate) {
        this.gameDate = gameDate.format(DateTimeFormatter.ISO_DATE);
    }
    //public void setStringGameDate()

    public static GameScoreDTO createDto(GameScore gameScore) {
        GameScoreDTO gameScoreDTO = new GameScoreDTO();
        gameScoreDTO.setId(gameScore.getId());
        gameScoreDTO.setPlayerId(gameScore.getPlayerId());
        gameScoreDTO.setPlayerName(gameScore.getPlayerName());
        gameScoreDTO.setCharacterName(gameScore.getCharacterName());
        gameScoreDTO.setGamesPlayed(gameScore.getGamesPlayed());
        gameScoreDTO.setHighScore(gameScore.getHighScore());
        gameScoreDTO.setScore(gameScore.getScore());
        gameScoreDTO.setMultiplayer(gameScore.getMultiplayer());
        gameScoreDTO.setGameDate(gameScore.getGameDate());
        return gameScoreDTO;
    }
}
