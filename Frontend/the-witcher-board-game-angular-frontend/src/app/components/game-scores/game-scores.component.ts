import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { GameScore } from '@app/entities/game-score';
import { GameScoreService } from '@app/services/game-score.service';

@Component({
  selector: 'app-game-scores',
  templateUrl: './game-scores.component.html',
  styleUrls: ['./game-scores.component.css']
})
export class GameScoresComponent implements OnInit {
  public gameScores: GameScore[];
  
  constructor(private gameScoreService: GameScoreService){}

  ngOnInit() {
    this.getScores();
  }

  public getScores(): void {
    this.gameScoreService.getScores().subscribe(
      (response: GameScore[]) => {
        this.gameScores = response;
        console.log(this.gameScores);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  };
}
