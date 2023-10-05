package com.witcheronboard.repository;

import com.witcheronboard.model.GameEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<GameEvent, Integer> {
}
