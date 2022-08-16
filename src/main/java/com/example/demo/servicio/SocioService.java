package com.example.demo.servicio;

import java.util.List;

import com.example.demo.domain.Socio;

public interface SocioService {
    
    public List <Socio> listarSocios();

    public void guardar (Socio socio);

    public void eliminar (Socio socio);

    public Socio buscarSocio(Socio socio);



}
