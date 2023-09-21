package com.witcheronboard.repository;

import com.witcheronboard.model.YourCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<YourCharacter, Integer> {
}
