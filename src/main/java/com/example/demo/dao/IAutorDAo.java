package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Libro;

@Repository
public interface IAutorDAo extends CrudRepository<Libro, String> {

}
