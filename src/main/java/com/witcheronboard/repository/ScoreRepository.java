package com.witcheronboard.repository;

import com.witcheronboard.model.GameScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<GameScore, Integer> {
}
