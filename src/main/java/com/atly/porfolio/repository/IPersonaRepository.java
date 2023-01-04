package com.atly.porfolio.repository;


import com.atly.porfolio.entity.persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository<persona, Integer>{
    Optional<persona> findByName(String name);
    public boolean existsByName(String name);
}
