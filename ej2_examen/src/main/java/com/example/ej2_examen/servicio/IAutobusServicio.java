package com.example.ej2_examen.servicio;

import com.example.ej2_examen.modelo.Autobus;

import java.util.List;
import java.util.Optional;

public interface IAutobusServicio {
    List<Autobus> listar();
    Optional<Autobus> consultar(String matricula);
    Autobus actualizar(String matricula);
    void eliminar(String matricula);
}
