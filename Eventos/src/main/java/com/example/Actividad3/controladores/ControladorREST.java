package com.example.Actividad3.controladores;


import com.example.Actividad3.Servicio.AutorServicio;
import com.example.Actividad3.domain.Autor;
import jakarta.validation.Valid;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorREST {
    
    @Autowired
    private AutorServicio autorServicio;
    
    @GetMapping("/")
    public String comienzo(Model model){
        
        List<Autor> autores = autorServicio.listaAutores();
        model.addAttribute("autores",autores );
        
        log.info("Estoy ejecuntado");
        
        return "indice";
        
    }
    
    @GetMapping ("/agregar")
    public String agregar (Autor autor){
        return "modificar";
    }
    
    @PostMapping ("/guardar")
    public String guardar(@Valid Autor autor, Errors error){
        if(error.hasErrors()){
            return "modificar";
        }
        autorServicio.guardar(autor);
        return "redirect:/";
    }
    
    @GetMapping ("/editar/{id}")
    public String editar(Autor autor, Model model){
        autor= autorServicio.buscar(autor);
        model.addAttribute("autor", autor);
        return "modificar";
    }
    
    @GetMapping ("/eliminar/{id}")
    public String eliminar(Autor autor){
        autorServicio.eliminar(autor);
        return "redirect:/";
    }
}
