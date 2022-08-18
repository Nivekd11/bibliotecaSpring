package com.example.demo.servicio;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ILibroDao;
import com.example.demo.domain.Libro;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private ILibroDao libroDao;

    @Override
    @Transactional()
    public List<Libro> listarLibros() {
        return (List<Libro>) libroDao.findAll();
    }

    @Override
    public void guardar(Libro libro) throws IOException {
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminar(Libro libro) throws IOException {
        // TODO Auto-generated method stub

    }

    @Override
    public Libro buscarLibro(Libro libro) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Libro> buscarPorId() {
        return (List<Libro>) libroDao.buscarPorId(10010);
    }

}
