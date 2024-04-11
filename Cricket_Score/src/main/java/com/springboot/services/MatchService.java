package com.springboot.services;

import java.util.List;

import com.springboot.entity.Match;

public interface MatchService {

	List<Match> getAllMatches();
	
	List<Match> getLiveMatches();
	
	List<List<String>> getPointTable();
}
