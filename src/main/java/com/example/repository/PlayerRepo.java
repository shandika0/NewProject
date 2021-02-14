package com.example.repository;

import java.util.List;
import soccer.com.example.entity.Entities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepo extends JpaRepository<Entities, Long> {
    @Query(value = "select * from players p where lower(u.name) like %:name%", nativeQuery = true)
    List<Entities> getPlayersByName(String name);

    @Query(value = "select * from  players p where p.age <= :age", nativeQuery = true)
    List<Entities> getByAge(Integer age);
    
    @Query(value = "select * from players p where lower(p.nationality) like %:nationality%", nativeQuery = true)
    List<Entities> getByNationality(String nationality);

    @Query(value = "select * from players p where p.goals >= :from and p.goals <= :to", nativeQuery = true)
    List<Entities> getByGoals(Integer from, Integer to);
    
    @Query(value = "select * from players p where p.assists >= :from and p.assists <= :to", nativeQuery = true)
    List<Entities> getByAssists(Integer from, Integer to);
}

