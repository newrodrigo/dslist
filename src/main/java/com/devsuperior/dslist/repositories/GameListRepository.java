package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslist.entities.GameList;

import jakarta.transaction.Transactional;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

	@Modifying
    @Transactional
    @Query("UPDATE Belonging b SET b.position = :newPosition WHERE b.id.list.id = :listId AND b.id.game.id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
