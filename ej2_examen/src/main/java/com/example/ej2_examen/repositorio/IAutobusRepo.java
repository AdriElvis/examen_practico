package com.example.ej2_examen.repositorio;

import com.example.ej2_examen.modelo.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobusRepo extends JpaRepository<Autobus, String> {
}
