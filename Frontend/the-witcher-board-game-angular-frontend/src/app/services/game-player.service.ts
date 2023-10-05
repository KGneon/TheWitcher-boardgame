import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GamePlayer } from '@app/entities/game-gamePlayer';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GamePlayerService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getPlayers(): Observable<GamePlayer[]> {
      return this.http.get<GamePlayer[]>(`${this.apiServerUrl}/boardgame/gamePlayers/all`);
  }

  public addPlayer(gamePlayer: GamePlayer): Observable<GamePlayer> {
      return this.http.post<GamePlayer>(`${this.apiServerUrl}/boardgame/gamePlayers/add`, gamePlayer);
  }

  public updateGamePlayer(gamePlayer: GamePlayer): Observable<GamePlayer> {
      return this.http.put<GamePlayer>(`${this.apiServerUrl}/boardgame/gamePlayers/update`, gamePlayer);
  }

  public deletePlayer(gamePlayerId : number): Observable<void> {
      return this.http.delete<void>(`${this.apiServerUrl}/boardgame/gamePlayers/delete/${gamePlayerId}`);
  }
}
