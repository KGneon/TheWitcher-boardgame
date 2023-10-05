import { TestBed } from '@angular/core/testing';

import { GameEnemyService } from './game-gameEnemy.service';

describe('GameEnemyService', () => {
  let service: GameEnemyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GameEnemyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
