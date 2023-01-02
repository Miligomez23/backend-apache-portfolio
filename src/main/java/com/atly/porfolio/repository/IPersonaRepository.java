package com.atly.porfolio.repository;

import com.atly.porfolio.entity.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<persona,Long>{
    
}
