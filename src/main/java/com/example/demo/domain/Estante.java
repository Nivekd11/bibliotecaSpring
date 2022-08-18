package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Estante {

    @Id
    private String nombre;
    private String seccion;
}
