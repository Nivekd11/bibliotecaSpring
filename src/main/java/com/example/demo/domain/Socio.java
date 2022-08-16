package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="socio")
public class Socio implements Serializable {
    
    private static final long serialVersionUID= 1L;

    @Id
    private String curp;
    private String nombre;
    private java.sql.Date fecha_nacimiento;
    private String telefono;
    private String correo;
    private String direccion;
    private String estatus;
    //private List<Prestamo> prestamos;
    //private boolean tienePenalizaciones;

}
