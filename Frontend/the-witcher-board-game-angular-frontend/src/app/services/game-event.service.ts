import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GameEvent } from '@app/entities/game-gameEvent';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GameEventService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getEvents(): Observable<GameEvent[]> {
      return this.http.get<GameEvent[]>(`${this.apiServerUrl}/boardgame/gameEvents/all`);
  }

  public addEvent(gameEvent: GameEvent): Observable<GameEvent> {
      return this.http.post<GameEvent>(`${this.apiServerUrl}/boardgame/gameEvents/add`, gameEvent);
  }

  public updateGameEvent(gameEvent: GameEvent): Observable<GameEvent> {
      return this.http.put<GameEvent>(`${this.apiServerUrl}/boardgame/gameEvents/update`, gameEvent);
  }

  public deleteEvent(gameEventId : GameEvent): Observable<void> {
      return this.http.delete<void>(`${this.apiServerUrl}/boardgame/gameEvents/delete/${gameEventId}`);
  }
}
