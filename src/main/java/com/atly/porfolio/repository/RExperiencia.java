
package com.atly.porfolio.repository;

import com.atly.porfolio.entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByLugar(String lugar);
    public boolean existsByLugar(String lugar);
}
