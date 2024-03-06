package com.triagil.desafiotriagil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.triagil.desafiotriagil.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
