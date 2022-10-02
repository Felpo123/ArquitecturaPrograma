package com.arquitectura.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="FAMILIAR")
public class Familiar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFamiliar;

    @ManyToOne
    @JoinColumn(name="persona_rut", nullable=false)
    private Persona persona;

    private String tipo;
    private String nombre;

    @Override
    public String toString() {
        return "Familiar{" +
                "idFamiliar=" + idFamiliar +
                ", persona=" + persona +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(int idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
