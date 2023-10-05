import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { GameEnemy } from '@app/entities/game-gameEnemy';
import { GameEnemyService } from '@app/services/game-gameEnemy.service';

@Component({
  selector: 'app-game-enemies',
  templateUrl: './game-enemies.component.html',
  styleUrls: ['./game-enemies.component.css']
})
export class GameEnemiesComponent implements OnInit {
  public gameEnemies: GameEnemy[];

  constructor(private gameEnemyService: GameEnemyService){}

  ngOnInit() {
    this.getEnemies();
  }

  public getEnemies(): void {
    this.gameEnemyService.getEnemies().subscribe(
      (response: GameEnemy[]) => {
        this.gameEnemies = response;
        console.log(this.gameEnemies);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  };

}
