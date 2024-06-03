
package com.example.Actividad3.Servicio;

import com.example.Actividad3.dao.AutorDAO;
import com.example.Actividad3.domain.Autor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author murieldiazperez
 */

@Service
public class AutorServicioImp  implements AutorServicio{

    @Autowired
    private AutorDAO autorDao;
    
    @Transactional(readOnly = true)
    @Override
    public List<Autor> listaAutores() {
       return (List<Autor>) autorDao.findAll();
      
    }

    @Transactional
    @Override
    public void guardar(Autor autor) {
        autorDao.save(autor);
        
    }

    @Transactional
    @Override
    public void eliminar(Autor autor) {
        autorDao.delete(autor);
        
    }
    
    @Transactional(readOnly = true)
    @Override
    public Autor buscar(Autor autor) {
        return autorDao.findById(autor.getId()).orElse(null);
        
    }
    
   
    
    
    
}
