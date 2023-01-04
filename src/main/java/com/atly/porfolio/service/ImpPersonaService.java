package com.atly.porfolio.service;

import com.atly.porfolio.entity.persona;
import com.atly.porfolio.repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService {
    @Autowired
    IPersonaRepository ipersonaRepository;
    
    public List<persona> list(){
        return ipersonaRepository.findAll();
    }
    
    public Optional<persona> getOne(int id){
        return ipersonaRepository.findById(id);
    }
    
    public Optional<persona> getByName(String name){
        return ipersonaRepository.findByName(name);  
    }
    
    public void save(persona persona){
        ipersonaRepository.save(persona);
    }
    
    public void delete(int id){
        ipersonaRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return ipersonaRepository.existsById(id);    
    }
    
    public boolean existsByName(String name){
        return ipersonaRepository.existsByName(name);
    }
}
