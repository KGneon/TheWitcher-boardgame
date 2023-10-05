package com.witcheronboard.repository;

import com.witcheronboard.model.GameEnemy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyRepository extends JpaRepository<GameEnemy, Integer> {
}
