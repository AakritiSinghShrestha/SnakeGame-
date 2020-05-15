package com.SnakeGame_Rest.Repo;

import com.SnakeGame_Rest.model.Game;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameRepository extends CrudRepository<Game,Long> {
    Game findById(int id);
}
