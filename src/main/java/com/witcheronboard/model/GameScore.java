package com.witcheronboard.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class GameScore {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false, updatable = false)
    private Integer id;
    private Integer playerId;
    private String playerName;
    private String characterName;
    private Integer gamesPlayed;
    private Integer highScore;
    private Integer score;
    private Boolean isMultiplayer;
    private LocalDate gameDate;
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
        return gameDate;
    }
    public void setGameDate(LocalDate gameDate) {
        this.gameDate = gameDate;
    }
}
