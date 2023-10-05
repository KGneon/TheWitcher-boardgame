import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GameCharacter } from '@app/entities/game-character';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GameCharacterService {
  private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient) { }

    public getCharacters(): Observable<GameCharacter[]> {
        return this.http.get<GameCharacter[]>(`${this.apiServerUrl}/boardgame/characters/all`);
    }

    public addCharacter(gameCharacter: GameCharacter): Observable<GameCharacter> {
        return this.http.post<GameCharacter>(`${this.apiServerUrl}/boardgame/characters/add`, gameCharacter);
    }

    public updateCharacter(gameCharacter: GameCharacter): Observable<GameCharacter> {
        return this.http.put<GameCharacter>(`${this.apiServerUrl}/boardgame/characters/update`, gameCharacter);
    }

    public deleteCharacter(gameCharacterId : number): Observable<void> {
        return this.http.delete<void>(`${this.apiServerUrl}/boardgame/characters/delete/${gameCharacterId}`);
    }
}
