package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        model.addAttribute("libros", libros);
        return "libros";
    }

}
