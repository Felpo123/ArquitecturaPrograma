package com.arquitectura.demo.repositories;

import com.arquitectura.demo.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona,String> {
}
