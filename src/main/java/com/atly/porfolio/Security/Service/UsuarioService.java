package com.atly.porfolio.Security.Service;

import com.atly.porfolio.Security.Entity.Usuario;
import com.atly.porfolio.Security.Repository.iUsuarioRepository;
//import jakarta.transaction.Transactional;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
     public boolean existByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
     public void save(Usuario usuario){
         iusuarioRepository.save(usuario);
     }
}
