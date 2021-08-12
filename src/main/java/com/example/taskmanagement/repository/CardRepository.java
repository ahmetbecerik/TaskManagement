package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CardRepository extends CrudRepository<Card, Long> {
}
