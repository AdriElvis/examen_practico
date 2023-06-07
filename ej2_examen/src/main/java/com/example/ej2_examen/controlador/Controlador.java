package com.example.ej2_examen.controlador;

import com.example.ej2_examen.modelo.Autobus;
import com.example.ej2_examen.servicio.IAutobusServicio;
import com.example.ej2_examen.servicio.IVisitaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/autobuses")
public class Controlador {
    @Autowired
    private IAutobusServicio servicoAutobus;

    @Autowired
    private IVisitaServicio servicioVisita;


    @GetMapping
    public ResponseEntity<List<Autobus>> obtener(Integer id){
        return new ResponseEntity(servicioVisita.obtenerAutobus(id), HttpStatus.OK);
    }

}
