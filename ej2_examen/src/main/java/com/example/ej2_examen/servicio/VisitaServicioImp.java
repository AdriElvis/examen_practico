package com.example.ej2_examen.servicio;

import com.example.ej2_examen.modelo.Autobus;
import com.example.ej2_examen.modelo.Visita;
import com.example.ej2_examen.repositorio.IVisitaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VisitaServicioImp implements IVisitaServicio{
    @Autowired
    IVisitaRepo repo;
    @Override
    public Visita consulta(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public Autobus obtenerAutobus(Integer id) {
        return repo.findById(id).get().getMatricula();
    }

}
