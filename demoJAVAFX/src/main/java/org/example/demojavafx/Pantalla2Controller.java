package org.example.demojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;

public class Pantalla2Controller {


    @FXML
    private TextField tipoCalzado;

    @FXML
    private TextField talla;

    @FXML
    private TextField precio;

    public void volverAPantallaHello() throws IOException {

        HelloApplication.setRoot("hello-view");
    }

    public void Keep_it() {

        String tipo_calzado = tipoCalzado.getText();
        int talla_cal = Integer.parseInt(talla.getText());
        double precio_cal = Double.parseDouble(precio.getText());

        Calzado calzado = new Calzado(tipo_calzado,talla_cal,precio_cal);

        System.out.println("Calzado creado: "+calzado.getTipo_calzado()+ " de talla: "+ calzado.getTalla()+ " y precio: "+ calzado.getPrecio() );

        
        tipoCalzado.clear();
        talla.clear();
        precio.clear();
    }
}
