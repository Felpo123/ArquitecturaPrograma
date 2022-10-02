package com.arquitectura.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PERSONA")
public class Persona {
    @Id
    private String rut;
    private String nombre;
    @Column(columnDefinition = "TINYINT", length = 1)
    private boolean casado;

    @OneToMany(mappedBy = "persona")
    private List<Familiar> familiares;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setFamiliares(List<Familiar> familiares) {
        this.familiares = familiares;
    }
}
