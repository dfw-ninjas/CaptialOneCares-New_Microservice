package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.Investment;


@Repository
public interface InvestmentsRepository extends CrudRepository<Investment, Integer> {

}
