package com.osman.transferPortalApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.apache.catalina.User;

import java.time.Year;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Team extends BaseEntity {

    private String name;
    private Year foundedYear;
    @ManyToOne()
    private League league;
}
