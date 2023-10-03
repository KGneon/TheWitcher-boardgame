package com.witcheronboard.service;

import com.witcheronboard.exception.BoardGameException;
import com.witcheronboard.model.Enemy;
import com.witcheronboard.model.Event;
import com.witcheronboard.model.Player;
import com.witcheronboard.model.YourCharacter;
import com.witcheronboard.repository.CharacterRepository;
import com.witcheronboard.repository.EnemyRepository;
import com.witcheronboard.repository.EventRepository;
import com.witcheronboard.repository.PlayerRepository;
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

    @Override
    public List<Enemy> getAllEnemies() {
        List<Enemy> listOfEnemies = enemyRepository.findAll();
        if(listOfEnemies != null)
        {
            return listOfEnemies;
        } else {
            throw new BoardGameException("Service.EMPTY_ENEMY_LIST");
        }
    }
    @Override
    public List<Event> getAllEvents() {
        List<Event> listOfEvents = eventRepository.findAll();
        if(listOfEvents != null)
        {
            return listOfEvents;
        } else {
            throw new BoardGameException("Service.EMPTY_EVENT_LIST");
        }
    }
    @Override
    public List<Player> getAllPlayers() {
        List<Player> listOfPlayers = playerRepository.findAll();
        if(listOfPlayers != null)
        {
            return listOfPlayers;
        } else {
            throw new BoardGameException("Service.EMPTY_PLAYER_LIST");
        }
    }
    @Override
    public List<YourCharacter> getAllCharacters() {
        List<YourCharacter> listOfCharacters = characterRepository.findAll();
        if(listOfCharacters != null)
        {
            return listOfCharacters;
        } else {
            throw new BoardGameException("Service.EMPTY_CHARACTER_LIST");
        }
    }

    @Override
    public Enemy getEnemyById(Integer id) {
        Optional<Enemy> optionalEnemy= enemyRepository.findById(id);
        Enemy enemy = optionalEnemy.orElseThrow(() -> new BoardGameException("Service.NO_ENEMY_BY_ID"));
        return enemy;
    }
    @Override
    public Event getEventById(Integer id) {
        Optional<Event> optionalEvent= eventRepository.findById(id);
        Event event = optionalEvent.orElseThrow(() -> new BoardGameException("Service.NO_EVENT_BY_ID"));
        return event;
    }
    @Override
    public Player getPlayerById(Integer id) {
        Optional<Player> optionalPlayer= playerRepository.findById(id);
        Player player = optionalPlayer.orElseThrow(() -> new BoardGameException("Service.NO_PLAYER_BY_ID"));
        return player;
    }
    @Override
    public YourCharacter getCharacterById(Integer id) {
        Optional<YourCharacter> optionalCharacter= characterRepository.findById(id);
        YourCharacter yourCharacter = optionalCharacter.orElseThrow(() -> new BoardGameException("Service.NO_CHARACTER_BY_ID"));
        return yourCharacter;
    }

    @Override
    public Enemy addEnemy(Enemy enemy) {
        if (enemy != null) {
            enemyRepository.save(enemy);
            return enemy;
        } else {
            throw new BoardGameException("WRONG_ENEMY_DATA");
        }
    }

    @Override
    public Event addEvent(Event event) {
        if (event != null) {
            eventRepository.save(event);
            return event;
        } else {
            throw new BoardGameException("WRONG_EVENT_DATA");
        }
    }
    @Override
    public Player addPlayer(Player player) {
        if (player != null) {
            playerRepository.save(player);
            return player;
        } else {
            throw new BoardGameException("WRONG_PLAYER_DATA");
        }
    }
    @Override
    public YourCharacter addCharacter(YourCharacter yourCharacter) {
        if (yourCharacter != null) {
            characterRepository.save(yourCharacter);
            return yourCharacter;
        } else {
            throw new BoardGameException("WRONG_CHARACTER_DATA");
        }
    }

    @Override
    public Enemy updateEnemy(Enemy enemy) {
        Optional<Enemy> optionalEnemy= enemyRepository.findById(enemy.getId());
        Enemy enemyToUpdate = optionalEnemy.orElseThrow(() -> new BoardGameException("There is no enemy with such id"));
        enemyRepository.save(enemyToUpdate);
        return enemyToUpdate;
    }
    @Override
    public Event updateEvent(Event event) {
        Optional<Event> optionalEvent= eventRepository.findById(event.getId());
        Event eventToUpdate = optionalEvent.orElseThrow(() -> new BoardGameException("There is no event with such id"));
        eventRepository.save(eventToUpdate);
        return eventToUpdate;
    }
    @Override
    public Player updatePlayer(Player player) {
        Optional<Player> optionalPlayer= playerRepository.findById(player.getId());
        Player playerToUpdate = optionalPlayer.orElseThrow(() -> new BoardGameException("There is no player with such id"));
        playerRepository.save(playerToUpdate);
        return playerToUpdate;
    }
    @Override
    public YourCharacter updateCharacter(YourCharacter yourCharacter) {
        Optional<YourCharacter> optionalCharacter= characterRepository.findById(yourCharacter.getId());
        YourCharacter characterToUpdate = optionalCharacter.orElseThrow(() -> new BoardGameException("There is no character with such id"));
        characterRepository.save(characterToUpdate);
        return characterToUpdate;
    }

    @Override
    public void deleteEnemy(Integer id) {
        Optional<Enemy> optionalEnemy= enemyRepository.findById(id);
        Enemy enemyToDelete = optionalEnemy.orElseThrow(() -> new BoardGameException("There is no enemy with such id"));
        enemyRepository.delete(enemyToDelete);
    }
    @Override
    public void deleteEvent(Integer id) {
        Optional<Event> optionalEvent= eventRepository.findById(id);
        Event eventToDelete = optionalEvent.orElseThrow(() -> new BoardGameException("There is no event with such id"));
        eventRepository.delete(eventToDelete);
    }
    @Override
    public void deletePlayer(Integer id) {
        Optional<Player> optionalPlayer= playerRepository.findById(id);
        Player playerToDelete = optionalPlayer.orElseThrow(() -> new BoardGameException("There is no player with such id"));
        playerRepository.delete(playerToDelete);
    }
    @Override
    public void deleteCharacter(Integer id) {
        Optional<YourCharacter> optionalCharacter= characterRepository.findById(id);
        YourCharacter characterToDelete = optionalCharacter.orElseThrow(() -> new BoardGameException("There is no character with such id"));
        characterRepository.delete(characterToDelete);
    }

}
