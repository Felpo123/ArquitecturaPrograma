package com.arquitectura.demo.service;

import com.arquitectura.demo.model.Familiar;
import com.arquitectura.demo.model.Persona;
import com.arquitectura.demo.repositories.FamiliarRepository;
import com.arquitectura.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FamiliaService {
    @Autowired
    FamiliarRepository familiaRepository;

    @Autowired
    PersonaRepository personaRepository;

    public Iterable<Familiar> familia(String rut) {
        Optional<Persona> persona = personaRepository.findById(rut);
        if (persona.isPresent()) {
            if(persona.get().isCasado()){
                Iterable<Familiar> familiares = familiaRepository.findAllByPersona(persona.get());
                return familiares;
            }else{
                return null;
            }
        }else{
            System.out.println("No hay persona con ese rut.");
        }
        return null;
    }
}
