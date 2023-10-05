import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GameEnemiesComponent } from './game-enemies.component';

describe('GameEnemiesComponent', () => {
  let component: GameEnemiesComponent;
  let fixture: ComponentFixture<GameEnemiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GameEnemiesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GameEnemiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
