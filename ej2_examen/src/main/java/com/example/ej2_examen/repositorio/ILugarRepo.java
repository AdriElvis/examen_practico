package com.example.ej2_examen.repositorio;

import com.example.ej2_examen.modelo.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugarRepo extends JpaRepository<Lugar, Integer> {
}
