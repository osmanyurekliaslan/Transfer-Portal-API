package com.osman.transferPortalApi.controller;

import com.osman.transferPortalApi.dto.LeagueDto;
import com.osman.transferPortalApi.entity.League;
import com.osman.transferPortalApi.service.LeagueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeagueController {

    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @GetMapping("/api/leagues")
    public List<LeagueDto> getAllLeagues() {
        return leagueService.getAllLeagues();
    }

    @PostMapping("/api/leagues")
    public LeagueDto addLeague(@RequestBody LeagueDto leagueDto) {
        return leagueService.addLeague(leagueDto);
    }
}

