package com.example.demo.servicio;

import java.io.IOException;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Libro;

@Service
public interface LibroService {

    public List<Libro> listarLibros();

    public void guardar(Libro libro) throws IOException;

    public void eliminar(Libro libro) throws IOException;

    public Libro buscarLibro(Libro libro) throws IOException;

    public List<Libro> buscarPorId();

}
