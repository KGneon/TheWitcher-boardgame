package com.witcheronboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="gameService")
public class BoardGameEventServiceImpl implements BoardGameEventService {

    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    EnemyRepository enemyRepository;

    @Autowired
    EventRepository eventRepository;


}
