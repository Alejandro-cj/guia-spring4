/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.EjemploSpring;

import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejandro
 */
//@RestController
@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    
    public String inicio(){
        log.info("ejecutando el controlador inicio MVP");
    return "index";
    }
}
