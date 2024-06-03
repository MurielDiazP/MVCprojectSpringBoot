/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Actividad3.dao;

import com.example.Actividad3.domain.Autor;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author murieldiazperez
 */
public interface AutorDAO extends CrudRepository <Autor, Integer >{
    
    
    
}
