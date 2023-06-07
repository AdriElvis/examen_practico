package com.example.ej2_examen.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conductor")
public class Conductor {
    @Id
    @Column(length =10)
    private String dni;
    @Column(length =60)
    private String nombre;
}
