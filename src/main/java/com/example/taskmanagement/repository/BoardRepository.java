package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BoardRepository extends CrudRepository<Board, Long> {
}
