package com.example.ej2_examen.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visita")
public class Visita {
    @Id
    private Integer id;
    private Date f_vista;
    @OneToOne
    @JoinColumn(name = "matricula", nullable=false, foreignKey = @ForeignKey(name = "fk_matricula_autobus"))
    private Autobus matricula;
    @OneToOne
    @JoinColumn(name = "dni", nullable=false, foreignKey = @ForeignKey(name = "fk_dni_conductor"))
    private Conductor dni;
    @OneToOne
    @JoinColumn(name = "id_lugar", nullable=false, foreignKey = @ForeignKey(name = "fk_idLugar_lugar"))
    private Lugar id_lugar;
}
