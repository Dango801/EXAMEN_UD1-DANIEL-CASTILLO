package org.example;

import java.util.Scanner;

public class Examen {

    public void ejercicio1() {

        // Uso scanner para pedir un número a la persona
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        // Ahora hacemos que si el numero introducido es positovo responda y si es negativo que lo invierta
         if(num >= 0){

             System.out.print("El valor absoluto de " + num + " es " + num );

         }
         else{

            num = (num *-1);

            System.out.print("El valor absoluto de " + -num + " es " + num );

         }

    }


    public void ejercicio2() {

        // Uso scanner para pedir el nombre
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Esta es la obra de " + nombre + ",  por favor ");

        // Ahora lo usamos para pedir las dimensiones de la pared y de los azulejos

        System.out.print("introduce la altura de la pared: ");
        int alturapared = scanner.nextInt();

        System.out.print("Introduce el ancho de la pared: ");
        int anchopared = scanner.nextInt();

        System.out.print("Introduce la altura de los azulejos: ");
        int alturaazulejos = scanner.nextInt();

        System.out.print("Introduce el ancho de los azulejos: ");
        int anchoazulejos = scanner.nextInt();

        if ( alturaazulejos == anchoazulejos){
            System.out.print("El azulejo no puede ser cuadrado. ");
        }
        else {

            if ( alturaazulejos > alturapared){
                System.out.print("El azulejo no puede ser mas grande que la pared. ");
            }
            else{

                if (anchoazulejos > anchopared){
                    System.out.print("El azulejo no puede ser mas grande que la pared. ");
                }
                else {

                    int areapared = (alturapared * anchopared);
                    int areaazulejo = (alturaazulejos * anchoazulejos);

                    int numazulejos = (areapared / areaazulejo);

                    System.out.print("Se necesitan " + numazulejos + " azulejos");


                }

            }
        }


    }
}