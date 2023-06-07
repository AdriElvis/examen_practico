package com.example.ej2_examen.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lugar")
public class Lugar {
    @Id
    private Integer id_lugar;
    @Column(length=60)
    private String nombre;
}
