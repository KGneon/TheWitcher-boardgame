import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { GamePlayer } from '@app/entities/game-gamePlayer';
import { GamePlayerService } from '@app/services/game-gamePlayer.service';

@Component({
  selector: 'app-game-gamePlayers',
  templateUrl: './game-gamePlayers.component.html',
  styleUrls: ['./game-gamePlayers.component.css']
})
export class GamePlayersComponent implements OnInit {
  public gamePlayers: GamePlayer[];

  constructor(private gamePlayerService: GamePlayerService){}

  ngOnInit() {
    this.getPlayers();
  }

  public getPlayers(): void {
    this.gamePlayerService.getPlayers().subscribe(
      (response: GamePlayer[]) => {
        this.gamePlayers = response;
        console.log(this.gamePlayers);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  };
}
