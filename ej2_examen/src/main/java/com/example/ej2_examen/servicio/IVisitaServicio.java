package com.example.ej2_examen.servicio;

import com.example.ej2_examen.modelo.Autobus;
import com.example.ej2_examen.modelo.Visita;

import java.util.List;
import java.util.Optional;

public interface IVisitaServicio {
    List<Visita> listar();
    Visita consulta(Integer id);
    Autobus obtenerAutobus(Integer id);
}
