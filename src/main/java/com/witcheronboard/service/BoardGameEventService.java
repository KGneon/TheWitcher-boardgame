package com.witcheronboard.service;

import com.witcheronboard.model.Enemy;
import com.witcheronboard.model.Event;
import com.witcheronboard.model.Player;

import java.util.List;
import java.util.Optional;

public interface BoardGameEventService {

    public List<Character> getAllCharacters();
    public List<Enemy> getAllEnemies();
    public List<Event> getAllEvents();
    public List<Player> getAllPlayers();
    public Optional getCharacterById(Integer id);
    public Optional getEventById(Integer id);
    public Optional getEnemyById(Integer id);
    public void addCharacter(Character character);
    public void addPlayer(Player player);

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
