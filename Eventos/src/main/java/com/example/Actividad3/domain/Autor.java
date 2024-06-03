
package com.example.Actividad3.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author MURIEL DIAZ
 */
@Data
@Entity
@Table (name="autor")
public class Autor implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotEmpty
    private String area_investigacion;
    
    @NotEmpty
    private String cedula;
    
    @NotEmpty
    @Email
    private String email;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    private String institucion;
    
    @NotEmpty
    private String celular;
    
     @OneToMany(mappedBy = "autor")
    private List<Trabajo_enviado> trabajosEnviados;
   
    
}
