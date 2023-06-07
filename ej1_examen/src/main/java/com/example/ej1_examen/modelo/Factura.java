package com.example.ej1_examen.modelo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Factura {
    private IImpuesto impuesto;
    private List<Producto> productos;



    public IImpuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(IImpuesto impuesto) {
        this.impuesto = impuesto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
