package com.example.ej2_examen.repositorio;

import com.example.ej2_examen.modelo.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVisitaRepo extends JpaRepository<Visita, Integer> {
}
