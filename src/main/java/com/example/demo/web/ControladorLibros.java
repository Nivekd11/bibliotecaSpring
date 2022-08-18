package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Autor;
import com.example.demo.domain.Libro;
import com.example.demo.servicio.LibroService;
import lombok.var;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorLibros {

    @Autowired
    private LibroService libroService;

    @GetMapping("/verlibros")
    public String agregar(Model model) {
        var libros = libroService.buscarPorId();
        for (Libro libro : libros) {
            // System.out.println(libro.toString());
            List<Autor> autores = libro.getAutores();
            for (Autor autor : autores) {
                System.out.println("Libro: " + libro.getTitulo() + " " + autor.getNombre());
            }
            // System.out.println(libro.getAutores());
        }
        // System.out.println(libros);
        model.addAttribute("libros", libros);
        return "libros";
    }

}
