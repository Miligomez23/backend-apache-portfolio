
package com.atly.porfolio.repository;


import com.atly.porfolio.entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rhys extends JpaRepository<hys, Integer>{
    Optional<hys> findByHabilidad(String habilidad);
    public boolean existsByHabilidad(String habilidad);
}