package com.witcheronboard.service;

import com.witcheronboard.dto.GameScoreDTO;
import com.witcheronboard.exception.BoardGameException;
import com.witcheronboard.model.*;
import com.witcheronboard.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value="gameService")
public class BoardGameEventServiceImpl implements BoardGameEventService {

    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    CharacterRepository characterRepository;
    @Autowired
    EnemyRepository enemyRepository;
    @Autowired
    EventRepository eventRepository;
    @Autowired
    ScoreRepository scoreRepository;

    @Override
    public List<GameEnemy> getAllEnemies() {
        List<GameEnemy> listOfEnemies = enemyRepository.findAll();
        if(listOfEnemies != null)
        {
            return listOfEnemies;
        } else {
            throw new BoardGameException("Service.EMPTY_ENEMY_LIST");
        }
    }
    @Override
    public List<GameEvent> getAllEvents() {
        List<GameEvent> listOfGameEvents = eventRepository.findAll();
        if(listOfGameEvents != null)
        {
            return listOfGameEvents;
        } else {
            throw new BoardGameException("Service.EMPTY_EVENT_LIST");
        }
    }
    @Override
    public List<GamePlayer> getAllPlayers() {
        List<GamePlayer> listOfGamePlayers = playerRepository.findAll();
        if(listOfGamePlayers != null)
        {
            return listOfGamePlayers;
        } else {
            throw new BoardGameException("Service.EMPTY_PLAYER_LIST");
        }
    }
    @Override
    public List<GameCharacter> getAllCharacters() {
        List<GameCharacter> listOfCharacters = characterRepository.findAll();
        if(listOfCharacters != null)
        {
            return listOfCharacters;
        } else {
            throw new BoardGameException("Service.EMPTY_CHARACTER_LIST");
        }
    }
    @Override
    public List<GameScoreDTO> getAllScores() {
        List<GameScoreDTO> listOfScores = scoreRepository.findAll();
        if(listOfScores != null)
        {
            return listOfScores;
        } else {
            throw new BoardGameException("Service.EMPTY_SCORE_LIST");
        }
    }

    @Override
    public GameEnemy getEnemyById(Integer id) {
        Optional<GameEnemy> optionalEnemy= enemyRepository.findById(id);
        GameEnemy gameEnemy = optionalEnemy.orElseThrow(() -> new BoardGameException("Service.NO_ENEMY_BY_ID"));
        return gameEnemy;
    }
    @Override
    public GameEvent getEventById(Integer id) {
        Optional<GameEvent> optionalEvent= eventRepository.findById(id);
        GameEvent gameEvent = optionalEvent.orElseThrow(() -> new BoardGameException("Service.NO_EVENT_BY_ID"));
        return gameEvent;
    }
    @Override
    public GamePlayer getPlayerById(Integer id) {
        Optional<GamePlayer> optionalPlayer= playerRepository.findById(id);
        GamePlayer gamePlayer = optionalPlayer.orElseThrow(() -> new BoardGameException("Service.NO_PLAYER_BY_ID"));
        return gamePlayer;
    }
    @Override
    public GameCharacter getCharacterById(Integer id) {
        Optional<GameCharacter> optionalCharacter= characterRepository.findById(id);
        GameCharacter gameCharacter = optionalCharacter.orElseThrow(() -> new BoardGameException("Service.NO_CHARACTER_BY_ID"));
        return gameCharacter;
    }
    @Override
    public GameScoreDTO getScoreById(Integer id) {
        Optional<GameScore> optionalScore= scoreRepository.findById(id);
        GameScore gameScore = optionalScore.orElseThrow(() -> new BoardGameException("Service.NO_SCORE_BY_ID"));
        GameScoreDTO gameScoreDTO = GameScoreDTO.createDto(gameScore);
        return gameScoreDTO;
    }

    @Override
    public GameEnemy addEnemy(GameEnemy gameEnemy) {
        if (gameEnemy != null) {
            enemyRepository.save(gameEnemy);
            return gameEnemy;
        } else {
            throw new BoardGameException("WRONG_ENEMY_DATA");
        }
    }

    @Override
    public GameEvent addEvent(GameEvent gameEvent) {
        if (gameEvent != null) {
            eventRepository.save(gameEvent);
            return gameEvent;
        } else {
            throw new BoardGameException("WRONG_EVENT_DATA");
        }
    }
    @Override
    public GamePlayer addPlayer(GamePlayer gamePlayer) {
        if (gamePlayer != null) {
            playerRepository.save(gamePlayer);
            return gamePlayer;
        } else {
            throw new BoardGameException("WRONG_PLAYER_DATA");
        }
    }
    @Override
    public GameCharacter addCharacter(GameCharacter gameCharacter) {
        if (gameCharacter != null) {
            characterRepository.save(gameCharacter);
            return gameCharacter;
        } else {
            throw new BoardGameException("WRONG_CHARACTER_DATA");
        }
    }
    @Override
    public GameScoreDTO addScore(GameScoreDTO gameScoreDTO) {
        if (gameScoreDTO != null) {
            scoreRepository.save(gameScoreDTO);
            return gameScoreDTO;
        } else {
            throw new BoardGameException("WRONG_SCORE_DATA");
        }
    }

    @Override
    public GameEnemy updateEnemy(GameEnemy gameEnemy) {
        Optional<GameEnemy> optionalEnemy= enemyRepository.findById(gameEnemy.getId());
        GameEnemy gameEnemyToUpdate = optionalEnemy.orElseThrow(() -> new BoardGameException("There is no enemy with such id"));
        enemyRepository.save(gameEnemyToUpdate);
        return gameEnemyToUpdate;
    }
    @Override
    public GameEvent updateEvent(GameEvent gameEvent) {
        Optional<GameEvent> optionalEvent= eventRepository.findById(gameEvent.getId());
        GameEvent gameEventToUpdate = optionalEvent.orElseThrow(() -> new BoardGameException("There is no event with such id"));
        eventRepository.save(gameEventToUpdate);
        return gameEventToUpdate;
    }
    @Override
    public GamePlayer updatePlayer(GamePlayer gamePlayer) {
        Optional<GamePlayer> optionalPlayer= playerRepository.findById(gamePlayer.getId());
        GamePlayer gamePlayerToUpdate = optionalPlayer.orElseThrow(() -> new BoardGameException("There is no player with such id"));
        playerRepository.save(gamePlayerToUpdate);
        return gamePlayerToUpdate;
    }
    @Override
    public GameCharacter updateCharacter(GameCharacter gameCharacter) {
        Optional<GameCharacter> optionalCharacter= characterRepository.findById(gameCharacter.getId());
        GameCharacter characterToUpdate = optionalCharacter.orElseThrow(() -> new BoardGameException("There is no character with such id"));
        characterRepository.save(characterToUpdate);
        return characterToUpdate;
    }
    @Override
    public GameScoreDTO updateScore(GameScoreDTO gameScoreDTO) {
        Optional<GameScoreDTO> optionalScore= scoreRepository.findById(gameScoreDTO.getId());
        GameScoreDTO scoreToUpdate = optionalScore.orElseThrow(() -> new BoardGameException("There is no score with such id"));
        scoreRepository.save(scoreToUpdate);
        return scoreToUpdate;
    }

    @Override
    public void deleteEnemy(Integer id) {
        Optional<GameEnemy> optionalEnemy= enemyRepository.findById(id);
        GameEnemy gameEnemyToDelete = optionalEnemy.orElseThrow(() -> new BoardGameException("There is no enemy with such id"));
        enemyRepository.delete(gameEnemyToDelete);
    }
    @Override
    public void deleteEvent(Integer id) {
        Optional<GameEvent> optionalEvent= eventRepository.findById(id);
        GameEvent gameEventToDelete = optionalEvent.orElseThrow(() -> new BoardGameException("There is no event with such id"));
        eventRepository.delete(gameEventToDelete);
    }
    @Override
    public void deletePlayer(Integer id) {
        Optional<GamePlayer> optionalPlayer= playerRepository.findById(id);
        GamePlayer gamePlayerToDelete = optionalPlayer.orElseThrow(() -> new BoardGameException("There is no player with such id"));
        playerRepository.delete(gamePlayerToDelete);
    }
    @Override
    public void deleteCharacter(Integer id) {
        Optional<GameCharacter> optionalCharacter= characterRepository.findById(id);
        GameCharacter characterToDelete = optionalCharacter.orElseThrow(() -> new BoardGameException("There is no character with such id"));
        characterRepository.delete(characterToDelete);
    }
    @Override
    public void deleteScore(Integer id) {
        Optional<GameScoreDTO> optionalScore= characterRepository.findById(id);
        GameCharacter scoreToDelete = optionalCharacter.orElseThrow(() -> new BoardGameException("There is no score with such id"));
        scoreRepository.delete(scoreToDelete);
    }

}
