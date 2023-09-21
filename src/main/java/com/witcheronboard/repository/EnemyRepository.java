package com.witcheronboard.repository;

import com.witcheronboard.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyRepository extends JpaRepository<Enemy, Integer> {
}
