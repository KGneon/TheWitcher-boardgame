import { Component, OnInit } from '@angular/core';
import { GameCharacter } from '@app/entities/game-character';
import { GameCharacterService } from '@app/services/game-character.service';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-game-characters',
  templateUrl: './game-characters.component.html',
  styleUrls: ['./game-characters.component.css']
})
export class GameCharactersComponent implements OnInit {
  public gameCharacters: GameCharacter[];
  
  constructor(private gameCharacterService: GameCharacterService){}

  ngOnInit() {
    this.getCharacters();
  }

  public getCharacters(): void {
    this.gameCharacterService.getCharacters().subscribe(
      (response: GameCharacter[]) => {
        this.gameCharacters = response;
        console.log(this.gameCharacters);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  };
}
