package com.osman.transferPortalApi.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class League extends BaseEntity {

    private String name;
    private String country;
}
