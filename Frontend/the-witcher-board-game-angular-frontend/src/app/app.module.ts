import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './components/app-routing.module';
import { AppComponent } from './components/app.component';
import { MainMenuComponent } from './components/main-menu/main-menu.component';
import { SettingsComponent } from './components/settings/settings.component';
import { PlayGameComponent } from './components/play-game/play-game.component';
import { GameEventsComponent } from './components/game-gameEvents/game-gameEvents.component';
import { GameEnemiesComponent } from './components/game-enemies/game-enemies.component';
import { GamePlayersComponent } from './components/game-gamePlayers/game-gamePlayers.component';
import { GameCharactersComponent } from './components/game-characters/game-characters.component';
import { GameScoresComponent } from './components/game-scores/game-scores.component';

@NgModule({
  declarations: [
    AppComponent,
    MainMenuComponent,
    SettingsComponent,
    PlayGameComponent,
    GameEventsComponent,
    GameEnemiesComponent,
    GamePlayersComponent,
    GameCharactersComponent,
    GameScoresComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
