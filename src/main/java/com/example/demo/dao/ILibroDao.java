package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Libro;

@Repository
public interface ILibroDao extends CrudRepository<Libro, String> {

    // public abstract Libro findBytitulo(@Param(":var_param") String titulo);
    @Query(value = "select idlibro,titulo,edicion,ejemplares,isbn,ideditorial,valor from Libro where Libro.idlibro <= ?", nativeQuery = true)
    List<Libro> buscarPorId(int id);
}
