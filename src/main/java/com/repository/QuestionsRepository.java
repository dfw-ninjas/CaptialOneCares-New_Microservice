package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.Question;

@Repository
public interface QuestionsRepository extends CrudRepository<Question, Integer> {

}
