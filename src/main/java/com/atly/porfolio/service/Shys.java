
package com.atly.porfolio.service;

import com.atly.porfolio.entity.hys;
import com.atly.porfolio.repository.Rhys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class Shys {
    @Autowired
    Rhys rhys;
    
    public List<hys> list(){
        return rhys.findAll();
    }
    
    public Optional<hys> getOne(int id){
        return rhys.findById(id);
    }
    
    public Optional<hys> getByHabilidad(String habilidad){
        return rhys.findByHabilidad(habilidad);
    }
    
    public void save(hys skill){
        rhys.save(skill);
    }
    
    public void delete(int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhys.existsById(id);
    }
    
    public boolean existsByHabilidad(String habilidad){
        return rhys.existsByHabilidad(habilidad);
    }
}
//fjkdjslkfd