package com.witcheronboard.controller;

import com.witcheronboard.dto.GameScoreDTO;
import com.witcheronboard.model.GameEnemy;
import com.witcheronboard.model.GameCharacter;
import com.witcheronboard.model.GameEvent;
import com.witcheronboard.model.GamePlayer;
import com.witcheronboard.service.BoardGameEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boardgame")
public class BoardGameController {

    @Autowired
    BoardGameEventService boardGameEventService;

    // GET ALL
    @GetMapping("/enemies/all")
    public ResponseEntity<List<GameEnemy>> getEnemies() {
        List<GameEnemy> enemies = boardGameEventService.getAllEnemies();
        return new ResponseEntity<>(enemies, HttpStatus.OK);
    }
    @GetMapping("/events/all")
    public ResponseEntity<List<GameEvent>> getEvents() {
        List<GameEvent> gameEvents = boardGameEventService.getAllEvents();
        return new ResponseEntity<>(gameEvents, HttpStatus.OK);
    }
    @GetMapping("/players/all")
    public ResponseEntity<List<GamePlayer>> getPlayers() {
        List<GamePlayer> gamePlayers = boardGameEventService.getAllPlayers();
        return new ResponseEntity<>(gamePlayers, HttpStatus.OK);
    }
    @GetMapping("/characters/all")
    public ResponseEntity<List<GameCharacter>> getCharacters() {
        List<GameCharacter> characters = boardGameEventService.getAllCharacters();
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }
    @GetMapping("/scores/all")
    public ResponseEntity<List<GameScoreDTO>> getScores() {
        List<GameScoreDTO> scoresDTO = boardGameEventService.getAllScores();
        return new ResponseEntity<>(scoresDTO, HttpStatus.OK);
    }

    //GET ONE
    @GetMapping("/enemies/find/{id}")
    public ResponseEntity<GameEnemy> getEnemyById(@PathVariable("id") Integer id) {
        GameEnemy gameEnemy = boardGameEventService.getEnemyById(id);
        return new ResponseEntity<>(gameEnemy, HttpStatus.OK);
    }
    @GetMapping("/events/find/{id}")
    public ResponseEntity<GameEvent> getEvnetById(@PathVariable("id") Integer id) {
        GameEvent gameEvent = boardGameEventService.getEventById(id);
        return new ResponseEntity<>(gameEvent, HttpStatus.OK);
    }
    @GetMapping("/players/find/{id}")
    public ResponseEntity<GamePlayer> getPlayerById(@PathVariable("id") Integer id) {
        GamePlayer gamePlayer = boardGameEventService.getPlayerById(id);
        return new ResponseEntity<>(gamePlayer, HttpStatus.OK);
    }
    @GetMapping("/characters/find/{id}")
    public ResponseEntity<GameCharacter> getCharacterById(@PathVariable("id") Integer id) {
        GameCharacter gameCharacter = boardGameEventService.getCharacterById(id);
        return new ResponseEntity<>(gameCharacter, HttpStatus.OK);
    }

    //ADD NEW
    @PostMapping("/enemies/add")
    public ResponseEntity<GameEnemy> addEnemy(@RequestBody GameEnemy gameEnemy) {
        GameEnemy newGameEnemy = boardGameEventService.addEnemy(gameEnemy);
        return new ResponseEntity<>(newGameEnemy, HttpStatus.CREATED);
    }
    @PostMapping("/events/add")
    public ResponseEntity<GameEvent> addEvent(@RequestBody GameEvent gameEvent) {
        GameEvent newGameEvent = boardGameEventService.addEvent(gameEvent);
        return new ResponseEntity<>(newGameEvent, HttpStatus.CREATED);
    }
    @PostMapping("/players/add")
    public ResponseEntity<GamePlayer> addPlayer(@RequestBody GamePlayer gamePlayer) {
        GamePlayer newGamePlayer = boardGameEventService.addPlayer(gamePlayer);
        return new ResponseEntity<>(newGamePlayer, HttpStatus.CREATED);
    }
    @PostMapping("/characters/add")
    public ResponseEntity<GameCharacter> addCharacter(@RequestBody GameCharacter gameCharacter) {
        GameCharacter newCharacter = boardGameEventService.addCharacter(gameCharacter);
        return new ResponseEntity<>(newCharacter, HttpStatus.CREATED);
    }

    //PUT
    @PutMapping("/enemies/update")
    public ResponseEntity<GameEnemy> updateEnemy(@RequestBody GameEnemy gameEnemy) {
        GameEnemy updateGameEnemy = boardGameEventService.updateEnemy(gameEnemy);
        return new ResponseEntity<>(updateGameEnemy, HttpStatus.OK);
    }
    @PutMapping("/events/update")
    public ResponseEntity<GameEvent> updateEvent(@RequestBody GameEvent gameEvent) {
        GameEvent updateGameEvent = boardGameEventService.updateEvent(gameEvent);
        return new ResponseEntity<>(updateGameEvent, HttpStatus.OK);
    }@PutMapping("/players/update")
    public ResponseEntity<GamePlayer> updatePlayer(@RequestBody GamePlayer gamePlayer) {
        GamePlayer updateGamePlayer = boardGameEventService.updatePlayer(gamePlayer);
        return new ResponseEntity<>(updateGamePlayer, HttpStatus.OK);
    }
    @PutMapping("/characters/update")
    public ResponseEntity<GameCharacter> updateCharacter(@RequestBody GameCharacter gameCharacter) {
        GameCharacter updateCharacter = boardGameEventService.updateCharacter(gameCharacter);
        return new ResponseEntity<>(updateCharacter, HttpStatus.OK);
    }

    //DELETE
    @PutMapping("/enemies/delete/{id}")
    public ResponseEntity<?> deleteEnemy(@PathVariable("id") Integer id) {
        boardGameEventService.deleteEnemy(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/events/delete/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable("id") Integer id) {
        boardGameEventService.deleteEvent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }@PutMapping("/players/delete/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable("id") Integer id) {
        boardGameEventService.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/characters/delete/{id}")
    public ResponseEntity<?> deleteCharacter(@PathVariable("id") Integer id) {
        boardGameEventService.deleteCharacter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
