export interface GameScore {
    id: number;
    playerId: number;
    playerName: string;
    characterName: string;
    gamesPlayed: number;
    highscore: number;
    score: number;
    isMultiplayer: boolean;
    gameDate: string;
}

