package com.witcheronboard.repository;

import com.witcheronboard.model.GameCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<GameCharacter, Integer> {
}
