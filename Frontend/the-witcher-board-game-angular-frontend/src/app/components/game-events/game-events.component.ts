import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { GameEvent } from '@app/entities/game-gameEvent';
import { GameEventService } from '@app/services/game-gameEvent.service';

@Component({
  selector: 'app-game-gameEvents',
  templateUrl: './game-gameEvents.component.html',
  styleUrls: ['./game-gameEvents.component.css']
})
export class GameEventsComponent implements OnInit {
  public gameEvents: GameEvent[];

  constructor(private gameEventService: GameEventService){}

  ngOnInit() {
    this.getEvents();
  }

  public getEvents(): void {
    this.gameEventService.getEvents().subscribe(
      (response: GameEvent[]) => {
        this.gameEvents = response;
        console.log(this.gameEvents);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  };
}
