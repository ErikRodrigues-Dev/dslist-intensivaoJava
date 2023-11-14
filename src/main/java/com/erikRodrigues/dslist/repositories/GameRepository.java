package com.erikRodrigues.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erikRodrigues.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
