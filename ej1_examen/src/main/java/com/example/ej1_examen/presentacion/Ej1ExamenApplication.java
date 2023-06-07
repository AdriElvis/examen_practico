package com.example.ej1_examen.presentacion;

import com.example.ej1_examen.modelo.Producto;
import com.example.ej1_examen.modelo.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ej1ExamenApplication implements CommandLineRunner {
	@Autowired
	Factura f1;

	public static void main(String[] args) {
		SpringApplication.run(Ej1ExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto("producto1",3.5));
		productos.add(new Producto("producto2",5.5));

	}
}
