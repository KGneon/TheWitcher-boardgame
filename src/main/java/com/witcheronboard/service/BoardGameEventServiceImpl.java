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
    public YourCharacter getCharacterById(Integer id) {
        Optional<YourCharacter> optionalCharacter= characterRepository.findById(id);
        YourCharacter yourCharacter = optionalCharacter.orElseThrow(() -> new BoardGameException("Service.NO_CHARACTER_BY_ID"));
        return yourCharacter;
    }

    @Override
    public Event getEventById(Integer id) {
        Optional<Event> optionalEvent= eventRepository.findById(id);
        Event event = optionalEvent.orElseThrow(() -> new BoardGameException("Service.NO_EVENT_BY_ID"));
        return event;
    }

    @Override
    public Enemy getEnemyById(Integer id) {
        Optional<Enemy> optionalEnemy= enemyRepository.findById(id);
        Enemy enemy = optionalEnemy.orElseThrow(() -> new BoardGameException("Service.NO_ENEMY_BY_ID"));
        return enemy;
    }

    @Override
    public Player getPlayerById(Integer id) {
        Optional<Player> optionalPlayer= playerRepository.findById(id);
        Player player = optionalPlayer.orElseThrow(() -> new BoardGameException("Service.NO_PLAYER_BY_ID"));
        return player;
    }

    @Override
    public void addCharacter(Character character) {

    }

    @Override
    public void addPlayer(Player player) {

    }
}
