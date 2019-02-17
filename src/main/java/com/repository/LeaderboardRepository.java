package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.Leaderboard;

@Repository
public interface LeaderboardRepository extends CrudRepository<Leaderboard, Integer> {

}
