package com.witcheronboard.controller;

import com.witcheronboard.service.BoardGameEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardGameController {

    @Autowired
    BoardGameEventService boardGameEventService;


}
