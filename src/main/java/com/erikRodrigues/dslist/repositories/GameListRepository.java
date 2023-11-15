package com.erikRodrigues.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erikRodrigues.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
