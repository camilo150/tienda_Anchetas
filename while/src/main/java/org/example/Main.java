package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre, cc, ancheta;
        double costoTotal,sumatoria=0.0;
        int opcion, cantidad;
        Scanner leerdato = new Scanner(System.in);


            System.out.println("por favor ingrese su nombre");
            leerdato.nextLine();
            System.out.println("digite su cedula");
            cc = leerdato.nextLine();
        do{
            System.out.println("vienvenod a peluchitos aquí tnemoas  nuestras opciones de compra\n1.comprar anchetas de cumpleaños ($180.000)\n2.comprar anchetas para el dia de la mujer($60.000)\n3.comprar anchetas para babyshowers ($250.000)\n4.salir");

                opcion = leerdato.nextInt();
                if (opcion == 1) {
                System.out.println("cuantas de estas decea comprar");
                cantidad = leerdato.nextInt();
                costoTotal = cantidad * 180000;
                sumatoria=sumatoria+costoTotal;
              } else if (opcion == 2) {
                System.out.println("cuantas de estas decea comprar");
                cantidad = leerdato.nextInt();
                costoTotal = cantidad * 60000;
                    sumatoria=sumatoria+costoTotal;
             } else if (opcion == 3) {
                System.out.println("cuantas de estas decea comprar");
                cantidad = leerdato.nextInt();
                costoTotal = cantidad * 250000;
                sumatoria=sumatoria+costoTotal;
              } else if (opcion > 4 || opcion < 1) {
                System.out.println("por favor ingrese un caracter valido");}
        } while (opcion != 4);
        System.out.println("El costo total es"+sumatoria+" gracias por su tiempo, vuelva pronto");



    }
}