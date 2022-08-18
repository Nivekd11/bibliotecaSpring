package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "libro")

public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idlibro;
    private String titulo;
    @Column(name = "valor", nullable = true)
    // @Transient // hace que un atributo no sea persistente, ayuda a que en una
    // consulta sql no
    // estes obligado a traer dicho valor
    private double valor;
    private int ejemplares;
    private String edicion;
    private String isbn;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ideditorial")
    private Editorial editorial;

}
