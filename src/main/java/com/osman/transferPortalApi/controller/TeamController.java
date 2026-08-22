package com.osman.transferPortalApi.controller;

import com.osman.transferPortalApi.dto.TeamDto;
import com.osman.transferPortalApi.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/api/teams")
    public List<TeamDto> getAllTeams() {
        return teamService.getAllTeams();
    }

    @PostMapping("/api/teams")
    public TeamDto addTeam(@RequestBody TeamDto teamDto) {
        return teamService.addTeam(teamDto);
    }

}
