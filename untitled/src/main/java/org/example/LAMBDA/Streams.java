package org.example.LAMBDA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        List<String> coches = new ArrayList<>(Arrays.asList("Ford","Audi","Renault","Skoda","Mitsubishi"));

        Stream<String> streamito = Stream.of("Ford","Citroen");


        List <String> filtrados = coches.stream()
                .filter(marca -> marca.endsWith("i"))
                .filter(marca -> marca.length()>5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        filtrados.forEach(System.out::println);
    }
}
