package org.example.LAMBDA;

import java.util.*;

public class Ordenaciones {

    public static void main(String[] args) {


        List<String> listaCiudades = new ArrayList<>(Arrays.asList("Alicante", "Valencia","Castellón", "Albatera"));

        //Collections.sort(listaCiudades,(a,b)->a.compareTo(b));
        listaCiudades.sort(Comparator.comparing(s -> s));
        System.out.println(listaCiudades);

        Profesor patri = new Profesor("Paco","Programacion",20);
        Profesor paco = new Profesor("Paco","Sistemas",40);

        List<Profesor> listaProfes  = new ArrayList<>(Arrays.asList(patri,paco));

        listaProfes.sort(Comparator.comparing(Profesor::getNombre)
                .thenComparing(Profesor::getEdad));

        System.out.println(listaProfes);
        Collections.sort(listaProfes,(profe1,profe2) -> profe1.getNombre().compareTo(profe2.getNombre()));
        System.out.println(listaProfes);
    }
}
