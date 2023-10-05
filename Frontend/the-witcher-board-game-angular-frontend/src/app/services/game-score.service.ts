import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GameScore } from '@app/entities/game-score';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GameScoreService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getScores(): Observable<GameScore[]> {
      return this.http.get<GameScore[]>(`${this.apiServerUrl}/boardgame/scores/all`);
  }

  public addScore(gameScore: GameScore): Observable<GameScore> {
      return this.http.post<GameScore>(`${this.apiServerUrl}/boardgame/scores/add`, gameScore);
  }

  public updateScore(gameScore: GameScore): Observable<GameScore> {
      return this.http.put<GameScore>(`${this.apiServerUrl}/boardgame/scores/update`, gameScore);
  }

  public deleteScore(gameScoreId : number): Observable<void> {
      return this.http.delete<void>(`${this.apiServerUrl}/boardgame/scores/delete/${gameScoreId}`);
  }
}
