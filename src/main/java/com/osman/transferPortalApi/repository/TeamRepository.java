package com.osman.transferPortalApi.repository;

import com.osman.transferPortalApi.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
