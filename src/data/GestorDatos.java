package data;

import model.Centro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {
    public static List<Centro> cargarCentrosCultivo() {
        //Declarar lista de centros de cultivo
        List<Centro> centrosCultivo = new ArrayList<>();
        //Abrir el archivo
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("resources/centros.txt"));
            String linea;
            //Leer el archivo
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(";");
                Centro centro = new Centro(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
                centrosCultivo.add(centro);
            }

            buffer.close();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        //Devolver la lista de centros de cultivo
        return centrosCultivo;
    }
}
