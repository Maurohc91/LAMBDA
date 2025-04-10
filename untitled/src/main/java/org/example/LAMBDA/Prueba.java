package org.example.LAMBDA;

public class Prueba {


    public static void main(String[] args) {


        Profesores patri = new Profesores() {
            @Override
            public boolean calificar(int nota) {
                System.out.println("Comparando para " + nota + ":");
                if (nota > 10) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        boolean notas = patri.calificar(5);
        System.out.println(notas);

        Profesores paco = (nota) -> {
            System.out.println("Comparando para " + nota + ":");
            if (nota > 10) {
                return true;
            } else {
                return false;
            }

        };

        boolean notas2 = paco.calificar(11);
        System.out.println(notas2);


        VerificadorVoto verificar = (profesor) -> { //profesor.getEdad()>=18

            System.out.println("Verificando voto para " + profesor.getNombre() + " con edad " + profesor.getEdad());
            if (profesor.getEdad() < 18) {
                return false;
            } else {
                return true;
            }
        };

        System.out.println(verificar.puedeVotar(new Profesor("Patri","programacion",25)));
        System.out.println(verificar.puedeVotar(new Profesor("Paco","sistemas",15)));
    }

}


