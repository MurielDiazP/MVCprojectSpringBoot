
package com.example.Actividad3.Servicio;

import com.example.Actividad3.domain.Autor;
import java.util.List;

/**
 *
 * @author murieldiazperez
 */
public interface AutorServicio {
    public List<Autor> listaAutores ();
    public void guardar (Autor autor);
    public void eliminar (Autor autor);
    public Autor buscar (Autor autor);
    
    
}
