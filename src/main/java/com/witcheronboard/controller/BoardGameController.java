package com.witcheronboard.controller;

import com.witcheronboard.model.Enemy;
import com.witcheronboard.model.Event;
import com.witcheronboard.model.Player;
import com.witcheronboard.model.YourCharacter;
import com.witcheronboard.service.BoardGameEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boardgame")
public class BoardGameController {

    @Autowired
    BoardGameEventService boardGameEventService;

    // GET ALL
    @GetMapping("/enemies")
    public ResponseEntity<List<Enemy>> getAllEnemies() {
        List<Enemy> enemies = boardGameEventService.getAllEnemies();
        return new ResponseEntity<>(enemies, HttpStatus.OK);
    }
    @GetMapping("/events")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = boardGameEventService.getAllEvents();
        return new ResponseEntity<>(events, HttpStatus.OK);
    }
    @GetMapping("/players")
    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> players = boardGameEventService.getAllPlayers();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }
    @GetMapping("/characters")
    public ResponseEntity<List<YourCharacter>> getAllCharacters() {
        List<YourCharacter> characters = boardGameEventService.getAllCharacters();
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    //GET ONE
    @GetMapping("/enemies/find/{id}")
    public ResponseEntity<Enemy> getEnemyById(@PathVariable("id") Integer id) {
        Enemy enemy = boardGameEventService.getEnemyById(id);
        return new ResponseEntity<>(enemy, HttpStatus.OK);
    }
    @GetMapping("/events/find/{id}")
    public ResponseEntity<Event> getEvnetById(@PathVariable("id") Integer id) {
        Event event = boardGameEventService.getEventById(id);
        return new ResponseEntity<>(event, HttpStatus.OK);
    }
    @GetMapping("/players/find/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable("id") Integer id) {
        Player player = boardGameEventService.getPlayerById(id);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }
    @GetMapping("/characters/find/{id}")
    public ResponseEntity<YourCharacter> getCharacterById(@PathVariable("id") Integer id) {
        YourCharacter yourCharacter = boardGameEventService.getCharacterById(id);
        return new ResponseEntity<>(yourCharacter, HttpStatus.OK);
    }

    //ADD NEW
    @PostMapping("/enemies/add")
    public ResponseEntity<Enemy> addEnemy(@RequestBody Enemy enemy) {
        Enemy newEnemy = boardGameEventService.addEnemy(enemy);
        return new ResponseEntity<>(newEnemy, HttpStatus.CREATED);
    }
    @PostMapping("/events/add")
    public ResponseEntity<Event> addEvent(@RequestBody Event event) {
        Event newEvent = boardGameEventService.addEvent(event);
        return new ResponseEntity<>(newEvent, HttpStatus.CREATED);
    }
    @PostMapping("/players/add")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player newPlayer = boardGameEventService.addPlayer(player);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }
    @PostMapping("/characters/add")
    public ResponseEntity<YourCharacter> addCharacter(@RequestBody YourCharacter yourCharacter) {
        YourCharacter newYourCharacter = boardGameEventService.addCharacter(yourCharacter);
        return new ResponseEntity<>(newYourCharacter, HttpStatus.CREATED);
    }

    //PUT
    @PutMapping("/enemies/update")
    public ResponseEntity<Enemy> updateEnemy(@RequestBody Enemy enemy) {
        Enemy updateEnemy = boardGameEventService.updateEnemy(enemy);
        return new ResponseEntity<>(updateEnemy, HttpStatus.OK);
    }
    @PutMapping("/events/update")
    public ResponseEntity<Event> updateEvent(@RequestBody Event event) {
        Event updateEvent = boardGameEventService.updateEvent(event);
        return new ResponseEntity<>(updateEvent, HttpStatus.OK);
    }@PutMapping("/players/update")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        Player updatePlayer = boardGameEventService.updatePlayer(player);
        return new ResponseEntity<>(updatePlayer, HttpStatus.OK);
    }
    @PutMapping("/characters/update")
    public ResponseEntity<YourCharacter> updateCharacter(@RequestBody YourCharacter character) {
        YourCharacter updateYourCharacter = boardGameEventService.updateCharacter(character);
        return new ResponseEntity<>(updateYourCharacter, HttpStatus.OK);
    }

    //DELETE
    @PutMapping("/enemies/delete")
    public ResponseEntity<?> deleteEnemy(@PathVariable("id") Integer id) {
        boardGameEventService.deleteEnemy(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/events/delete")
    public ResponseEntity<?> deleteEvent(@PathVariable("id") Integer id) {
        boardGameEventService.deleteEvent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }@PutMapping("/players/delete")
    public ResponseEntity<?> deletePlayer(@PathVariable("id") Integer id) {
        boardGameEventService.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/characters/delete")
    public ResponseEntity<?> deleteCharacter(@PathVariable("id") Integer id) {
        boardGameEventService.deleteCharacter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
