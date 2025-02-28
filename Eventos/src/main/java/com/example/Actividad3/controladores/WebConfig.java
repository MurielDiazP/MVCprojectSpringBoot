/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Actividad3.controladores;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 *
 * @author murieldiazperez
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Bean
    public LocaleResolver localeResolver(){
       SessionLocaleResolver slr = new SessionLocaleResolver();
       slr.setDefaultLocale(new Locale("es"));
       return slr;
    }
    
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
       LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
       lci.setParamName("lang");
       return lci;
    }
    
    @Override
   public void addInterceptors(InterceptorRegistry intercepto){
       intercepto.addInterceptor(localeChangeInterceptor());
       
   }
    
}
