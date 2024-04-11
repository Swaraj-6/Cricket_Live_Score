package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Match;
import com.springboot.services.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	private MatchService matchService;

	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches() {
		return new ResponseEntity<List<Match>>(this.matchService.getLiveMatches(), HttpStatus.OK);
	}
	
	@GetMapping("/point-table")
	public ResponseEntity<List<List<String>>> getpointsTable(){
		return new ResponseEntity<List<List<String>>>(this.matchService.getPointTable(), HttpStatus.OK);
	}
	
	@GetMapping("/")
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }
}
