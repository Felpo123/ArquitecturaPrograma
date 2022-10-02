package com.arquitectura.demo.repositories;

import com.arquitectura.demo.model.Familiar;
import com.arquitectura.demo.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamiliarRepository extends CrudRepository<Familiar,Integer> {
    List<Familiar> findAllByPersona(Persona persona);
}
