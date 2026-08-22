package com.osman.transferPortalApi.dto;

import com.osman.transferPortalApi.entity.League;
import lombok.*;

import java.time.Year;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {

    private String name;
    private Year foundedYear;
    private League league;
}
