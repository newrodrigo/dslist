package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    @Query("SELECT new com.devsuperior.dslist.dto.GameMinDTO(g.id, g.title, g.year, g.imgUrl, g.shortDescription) " +
            "FROM Game g " +
            "JOIN Belonging b ON g.id = b.id.game.id " +
            "WHERE b.id.list.id = :listId " +
            "ORDER BY b.position")
     List<GameMinProjection> searchByList(Long listId);

}
