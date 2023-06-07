package com.example.ej2_examen;

import com.example.ej2_examen.modelo.Autobus;
import com.example.ej2_examen.modelo.Visita;
import com.example.ej2_examen.servicio.AutobusServicioImp;
import com.example.ej2_examen.servicio.VisitaServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ej2ExamenApplication implements CommandLineRunner {
	@Autowired
	AutobusServicioImp autobusServicio;
	@Autowired
	VisitaServicioImp visitaServicio;
	public static void main(String[] args) {
		SpringApplication.run(Ej2ExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (Autobus p : autobusServicio.listar()){
			System.out.println("\n" + p + "\n");
		}

		System.out.println(visitaServicio.consulta(1));
		System.out.println(visitaServicio.obtenerAutobus(1));
	}
}
