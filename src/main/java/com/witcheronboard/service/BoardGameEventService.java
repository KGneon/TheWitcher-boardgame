package com.witcheronboard.service;

import com.witcheronboard.dto.GameScoreDTO;
import com.witcheronboard.model.*;
import com.witcheronboard.model.GameCharacter;

import java.util.List;

public interface BoardGameEventService {

    List<GameCharacter> getAllCharacters();
    List<GameEnemy> getAllEnemies();
    List<GameEvent> getAllEvents();
    List<GamePlayer> getAllPlayers();
    List<GameScoreDTO> getAllScores();

    GameCharacter getCharacterById(Integer id);
    GameEvent getEventById(Integer id);
    GameEnemy getEnemyById(Integer id);
    GamePlayer getPlayerById(Integer id);
    GameScoreDTO getScoreById(Integer id);

    GameCharacter addCharacter(GameCharacter yourCharacter);
    GamePlayer addPlayer(GamePlayer gamePlayer);
    GameEvent addEvent(GameEvent gameEvent);
    GameEnemy addEnemy(GameEnemy gameEnemy);
    GameScoreDTO addScore(GameScoreDTO gameScoreDTO);

    GameEnemy updateEnemy(GameEnemy gameEnemy);
    GameEvent updateEvent(GameEvent gameEvent);
    GamePlayer updatePlayer(GamePlayer gamePlayer);
    GameCharacter updateCharacter(GameCharacter yourCharacter);
    GameScoreDTO updateScore(GameScoreDTO gameScoreDTO);

    void deleteEnemy(Integer id);
    void deleteEvent(Integer id);
    void deletePlayer(Integer id);
    void deleteCharacter(Integer id);
    void deleteScore(Integer id);

    //roll dice
    //move character (up, down, right, left)
    //meet event
    //fight
    //roll dice for enemy
    //roll dice for char
    //event
    //change statistics
    //move back
    //winner price
    //end turn
    //switch char
    //

}
