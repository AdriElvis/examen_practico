package com.example.ej2_examen.repositorio;

import com.example.ej2_examen.modelo.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConductorRepo extends JpaRepository<Conductor, String> {
}
