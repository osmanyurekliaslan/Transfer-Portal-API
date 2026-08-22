package com.osman.transferPortalApi.service;

import com.osman.transferPortalApi.dto.TeamDto;
import com.osman.transferPortalApi.entity.Team;
import com.osman.transferPortalApi.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public TeamDto addTeam(TeamDto teamDto) {
        Team team = new Team();
        team.setName(teamDto.getName());
        team.setFoundedYear(teamDto.getFoundedYear());
        team.setLeague(teamDto.getLeague());
        teamRepository.save(team);
        return teamDto;
    }

    public List<TeamDto> getAllTeams() {
        List<Team> teams = teamRepository.findAll();
        return teams.stream().map(team -> {
            TeamDto teamDto = new TeamDto();
            teamDto.setName(team.getName());
            teamDto.setFoundedYear(team.getFoundedYear());
            teamDto.setLeague(team.getLeague());
            return teamDto;
        }).toList();
    }
}