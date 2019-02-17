package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.PersonalDetails;

@Repository
public interface PersonalDetailsRepository extends CrudRepository<PersonalDetails, Integer> {

}
