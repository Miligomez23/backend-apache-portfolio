package com.atly.porfolio.Security.Service;

import com.atly.porfolio.Security.Entity.Rol;
import com.atly.porfolio.Security.Enums.RolNombre;
import com.atly.porfolio.Security.Repository.iRolRepository;
//import jakarta.transaction.Transactional;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        irolRepository.save(rol);
    }
}
