package com.osman.transferPortalApi.service;

import com.osman.transferPortalApi.dto.LeagueDto;
import com.osman.transferPortalApi.dto.TeamDto;
import com.osman.transferPortalApi.entity.League;
import com.osman.transferPortalApi.entity.Team;
import com.osman.transferPortalApi.repository.LeagueRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public LeagueDto addLeague(LeagueDto leagueDto) {
        League league = new League();
        league.setName(leagueDto.getName());
        league.setCountry(leagueDto.getCountry());
        leagueRepository.save(league);
        return leagueDto;
    }

    public List<LeagueDto> getAllLeagues() {
        List<League> leagues = leagueRepository.findAll();
        return leagues.stream().map(league -> {
            LeagueDto leagueDto = new LeagueDto();
            leagueDto.setName(league.getName());
            leagueDto.setCountry(league.getCountry());
            return leagueDto;
        }).toList();
    }


}
