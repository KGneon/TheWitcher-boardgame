package com.witcheronboard.service;

import com.witcheronboard.model.Enemy;
import com.witcheronboard.model.Event;
import com.witcheronboard.model.Player;
import com.witcheronboard.model.YourCharacter;

import java.util.List;
import java.util.Optional;

public interface BoardGameEventService {

    public List<YourCharacter> getAllCharacters();
    public List<Enemy> getAllEnemies();
    public List<Event> getAllEvents();
    public List<Player> getAllPlayers();
    public YourCharacter getCharacterById(Integer id);
    public Event getEventById(Integer id);
    public Enemy getEnemyById(Integer id);
    public Player getPlayerById(Integer id);
    public YourCharacter addCharacter(YourCharacter yourCharacter);
    public Player addPlayer(Player player);
    public Event addEvent(Event event);
    public Enemy addEnemy(Enemy enemy);
    Enemy updateEnemy(Enemy enemy);
    Event updateEvent(Event event);
    Player updatePlayer(Player player);
    YourCharacter updateCharacter(YourCharacter yourCharacter);
    void deleteEnemy(Integer id);
    void deleteEvent(Integer id);
    void deletePlayer(Integer id);
    void deleteCharacter(Integer id);

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
