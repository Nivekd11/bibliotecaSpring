package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Socio;

public interface ISocioDao extends CrudRepository<Socio,String>{
    
}
