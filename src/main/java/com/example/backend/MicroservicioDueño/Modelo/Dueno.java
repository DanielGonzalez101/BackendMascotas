package com.example.backend.MicroservicioDueño.Modelo;

import jakarta.persistence.*;

@Entity
@Table
public class Dueno {

    //Si da error importar la otra libreria
    @Id
    @SequenceGenerator(
            name = "dueno_sequence",
            sequenceName = "dueno_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "dueno_sequence"
    )
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;

    public Dueno(String nombre, String apellido, String telefono, Long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.id = id;
    }

    public Dueno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
