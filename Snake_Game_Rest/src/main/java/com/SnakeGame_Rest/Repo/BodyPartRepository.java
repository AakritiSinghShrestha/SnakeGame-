package com.SnakeGame_Rest.Repo;

import com.SnakeGame_Rest.model.BodyPart;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BodyPartRepository extends CrudRepository<BodyPart,Long> {
List<BodyPart> findAll();
}
