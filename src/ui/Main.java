package ui;

import data.GestorDatos;
import model.Centro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cargar centros de cultivo
        List<Centro> centrosCultivo = GestorDatos.cargarCentrosCultivo();
        //Recorrer la lista de centros de cultivo
        for (Centro c : centrosCultivo) {
            //Imprimir los centros de cultivo que tengan una cantidad mayor a 1000 y que el producto sea salmón
            if (c.getCantidad() > 1000 && c.getProducto().contains("Salmón")) {
                System.out.println(c.toString());
            }
        }
    }

}