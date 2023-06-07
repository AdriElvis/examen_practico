package com.example.ej2_examen.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @Column(length=7)
    private String matricula;
    private  Integer a_fabricacion;
}
