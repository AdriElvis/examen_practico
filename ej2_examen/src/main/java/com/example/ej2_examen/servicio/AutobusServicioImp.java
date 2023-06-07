package com.example.ej2_examen.servicio;

import com.example.ej2_examen.modelo.Autobus;
import com.example.ej2_examen.repositorio.IAutobusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutobusServicioImp implements IAutobusServicio {

    @Autowired
    IAutobusRepo repo;
    @Override
    public List<Autobus> listar() {

        return repo.findAll();
    }

    @Override
    public Optional<Autobus> consultar(String matricula) {

        return repo.findById(matricula);
    }

    @Override
    public Autobus actualizar(String matricula) {

        return null;
    }

    @Override
    public void eliminar(String matricula) {

    }
}
