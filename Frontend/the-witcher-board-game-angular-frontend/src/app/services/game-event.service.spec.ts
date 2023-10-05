import { TestBed } from '@angular/core/testing';

import { GameEventService } from './game-gameEvent.service';

describe('GameEventService', () => {
  let service: GameEventService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GameEventService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
