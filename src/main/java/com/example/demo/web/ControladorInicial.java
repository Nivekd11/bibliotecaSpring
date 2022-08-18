package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.dao.ISocioDao;
import com.example.demo.servicio.SocioService;
import lombok.var;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j 
public class ControladorInicial {
    
    @Autowired
    private SocioService socioService; 

    @Value("${iindex.mensaje}")
    private String aplicationProperies;
    @GetMapping("/")
    public String inicio(Model model){
        var socios = socioService.listarSocios();
        // Persona persona = new Persona();
        // persona.setNombre("Kevin Edwin");
        // persona.setApellido("Sandoval Hernández");
        // Persona persona2 = new Persona();
        // persona2.setNombre("Sergio Edilberto");
        // persona2.setApellido("Valle Ortiz");
        // var personas = new ArrayList<Persona>();
        // personas.add(persona);
        // personas.add(persona2);
        // log.info("Ejecutando el controlador Res");
        // ConexionBD.connectDatabase();
         String saludar = "Hola mundo kevin compartirrr";
         model.addAttribute("saludo", saludar);
        // model.addAttribute("mensaje", aplicationProperies);
         model.addAttribute("Socios", socios);
        return "index";
    }
}
