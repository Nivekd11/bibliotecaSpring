package com.example.demo.web;

import com.example.demo.domain.Socio;
import com.example.demo.servicio.SocioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class ControladorSocios {
    

    @Autowired
    private SocioService socioService;

    @GetMapping("/agregar")
    public String agregar(Socio socio){

        return "SocioAgregar";
    }

    @PostMapping("/guardar")
    public String guardar(Socio socio){

        socio.setEstatus("Habilitado");
        socioService.guardar(socio);

        return "redirect:/";
    }

    @GetMapping("/editar/{curp}")
    public String editar(Socio socio,Model model) {
        socio = socioService.buscarSocio(socio);
        model.addAttribute("socio", socio);
        return "SocioAgregar";
    }

    @GetMapping("/eliminar/{curp}")
    public String eliminar(Socio socio){
        socioService.eliminar(socio);
        return "redirect:/";
    }
    
}
