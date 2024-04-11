package com.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{

	Optional<Match> findByTeamHeading(String teamHeading);
}
