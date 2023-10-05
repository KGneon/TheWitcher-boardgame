import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GameEnemy } from '@app/entities/game-gameEnemy';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GameEnemyService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getEnemies(): Observable<GameEnemy[]> {
      return this.http.get<GameEnemy[]>(`${this.apiServerUrl}/boardgame/enemies/all`);
  }

  public addEnemy(gameEnemy: GameEnemy): Observable<GameEnemy> {
      return this.http.post<GameEnemy>(`${this.apiServerUrl}/boardgame/enemies/add`, gameEnemy);
  }

  public updateGameEnemy(gameEnemy: GameEnemy): Observable<GameEnemy> {
      return this.http.put<GameEnemy>(`${this.apiServerUrl}/boardgame/enemies/update`, gameEnemy);
  }

  public deleteEnemy(gameEnemyId : number): Observable<void> {
      return this.http.delete<void>(`${this.apiServerUrl}/boardgame/enemies/delete/${gameEnemyId}`);
  }
}
