package org.example.LAMBDA;

import java.util.ArrayList;
import java.util.List;

public class AppProductos {


    public static void main(String[] args) {


        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("Smartphone",150.0,"electronica"));
        listaProducto.add(new Producto("Tablet", 72.0,"electronica"));
        listaProducto.add(new Producto("Perfume Arabe",40.0,"perfumeria"));
        listaProducto.add(new Producto("kebab",2.50,"alimentacion"));

        FiltroProducto filtro = (producto) -> {

            if (producto.getCategoria().equals("electronica") && producto.getPrecio() > 100){
                return true;
            }
        return false;
        };

        List<Producto> productos_filtrados = new ArrayList<>();

        for (Producto producto : listaProducto){

            if (filtro.filtrar(producto)){
                productos_filtrados.add(producto);
            }
        }


        System.out.println("productos despues de filtrar");

        for (Producto producto : productos_filtrados){
            System.out.println(producto);
        }
        System.out.println();
        System.out.println();
        for (Producto producto : listaProducto){

            if (filtro.filtrar(producto)){
                System.out.println(producto);
            }
        }

    }
}
