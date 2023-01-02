package com.atly.porfolio.service;

import com.atly.porfolio.Interface.IPersonaService;
import com.atly.porfolio.entity.persona;
import com.atly.porfolio.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<persona> getPersona() {
           List<persona> persona = ipersonaRepository.findAll();
           return persona;
    }

    @Override
    public void savePersona(persona persona) {
            ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public persona findPersona(Long id) {
        persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
