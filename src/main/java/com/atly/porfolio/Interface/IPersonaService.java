package com.atly.porfolio.Interface;

import com.atly.porfolio.entity.persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de personas
    public List<persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona (persona persona);
    
    //eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    public persona findPersona(Long id);
    
}
